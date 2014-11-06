JNI_H="/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX10.9.sdk/System/Library/Frameworks/JavaVM.framework/Versions/A/Headers/"


all 		: libhello.dylib

libhello.dylib	: HelloJNI.o
	gcc -shared -o libhello.dylib HelloJNI.o

HelloJNI.o	: HelloJNI.c HelloJNI.h
	gcc -c -I$(JNI_H) -I./include HelloJNI.c

HelloJNI.h	: HelloJNI.class
	javah -d include testjni.HelloJNI

HelloJNI.class	:
	javac testjni/HelloJNI.java

clean		:
	rm -f libhello.dylib
	rm -f HelloJNI.o
	rm -f include/testjni_HelloJNI.h
	rm -f testjni/*.class
