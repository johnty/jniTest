package testjni;

public class MoreFuncs {
    
    MoreFuncs() {
        System.loadLibrary("morefuncs");
    }
    
    public native void callToC();
    private native void updateCallCount(int count);
    
    int callCount;
    
    public void callFromC() {
        callCount++;
        System.out.println("Called from native C code; callcount = "+callCount);
        
    }
}