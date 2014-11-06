#include <jni.h>
#include <stdio.h>
#include "testjni_HelloJNI.h"

JNIEXPORT void JNICALL Java_testjni_HelloJNI_sayHello(JNIEnv *env, jobject thiz) {
   printf("Hello World!\n");
   return;
}

JNIEXPORT void JNICALL Java_testjni_HelloJNI_setDouble (JNIEnv *env, jobject thiz, jdouble val) {
   printf("do stuff here...\n");
   return;
}

JNIEXPORT jdouble JNICALL Java_testjni_HelloJNI_average (JNIEnv *env, jobject thiz, jint n1, jint n2) {
   return n1+n2;
}
