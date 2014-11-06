#include <jni.h>
#include <stdio.h>
#include "HelloJNI.h"

JNIEXPORT void JNICALL Java_HelloJNI_sayHello(JNIEnv *env, jobject thiz) {
   printf("Hello World!\n");
   return;
}

JNIEXPORT void JNICALL Java_HelloJNI_setDouble (JNIEnv *env, jobject thiz, jdouble val) {
   printf("do stuff here...\n");
   return;
}
