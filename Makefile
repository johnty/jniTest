all 		: libhello.dylib

libhello.dylib	: HelloJNI.o
	gcc -shared -o libhello.dylib HelloJNI.o

HelloJNI.o	: HelloJNI.c HelloJNI.h
	gcc -c -I"/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX10.9.sdk/System/Library/Frameworks/JavaVM.framework/Versions/A/Headers/" HelloJNI.c

HelloJNI.h	: HelloJNI.class
	javah HelloJNI

clean		:
	rm libhello.dylib
	rm HelloJNI.o
	rm HelloJNI.h
