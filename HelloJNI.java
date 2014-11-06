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

   public native byte[] getByteArray();

   private native void callToC();
 
   // Test Driver
   public static void main(String[] args) {
      new HelloJNI().sayHello();  // invoke the native method
   }
}
