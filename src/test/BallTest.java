import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BallTest {
    @Test
    public void testRoll() throws Exception {
        MockFrame frame = new MockFrame();
        Ball ballToTest = new Ball();
        ballToTest.roll(frame, 1);
        assertTrue(frame.isHitCalled());
    }
}
