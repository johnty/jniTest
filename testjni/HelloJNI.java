package testjni;

import testjni.MoreFuncs;

public class HelloJNI {
    static {
        //System.load("/Users/johnty/dev/jniTest/libhello.so");
        System.loadLibrary("hello"); // Load native library at runtime
        // hello.dll (Windows) or libhello.so (Unixes)
    }
    
    // Declare a native method sayHello() that receives nothing and returns void
    private native void sayHello();
    private native double getDouble();
    private native void setDouble(double d);
    private native double average(int n1, int n2);
    
    public native byte[] getByteArray();
    
    private native void callToC();
    
    
    private void callFromC() {
        System.out.println("called from native C code...");
    }
    
    // Test Driver
    public static void main(String[] args) {
        new HelloJNI().sayHello();  // invoke the native method
        System.out.println("Testing JNI C function: average of 3 and 4 is: ");
        double res = new HelloJNI().average(3,4);
        System.out.println("..." + res);
        
        System.out.println("\n\nTesting call to/from C:");
        new HelloJNI().callToC();
        
        System.out.println("\n\n\nTesting MoreFuncs....\n");
        MoreFuncs myFuncs = new MoreFuncs();
        for (int i=0; i< 10; i++)
            myFuncs.callToC();
        
        
    }
}
