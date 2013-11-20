public class MockFrame extends Frame {
     private boolean isCalled = false;

    public void hit(int pinNo)
    {
        isCalled = true;
    }

    public boolean isHitCalled()
    {
        return isCalled;
    }
}
