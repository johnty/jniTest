#include "include/testjni_MoreFuncs.h"

JNIEXPORT void JNICALL Java_testjni_MoreFuncs_callToC(JNIEnv *env, jobject thiz) {
    jclass thisClass = (*env)->GetObjectClass(env, thiz);
    
    jmethodID myCallBack = (*env)->GetMethodID(env, thisClass, "callFromC", "()V");
    if (NULL == myCallBack)
        return;
    printf("Calling C from Java\n");
    //now we call back to Java:
    
    (*env)->CallVoidMethod(env, thiz, myCallBack);
    return;
}

JNIEXPORT void JNICALL Java_testjni_MoreFuncs_updateCallCount (JNIEnv *env, jobject thiz, jint count) {
    printf("JNI call count = %i\n", count);
    return;
    
}
