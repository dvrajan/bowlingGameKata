import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FrameTest {

    private Frame frame;

    @Before
    public void setUp() throws Exception {
        frame = new Frame();
    }

    @Test
    public void getNoOfPinsHitForZero() throws Exception {
           assertEquals(0,frame.getNoOfPinsHit());
    }

    @Test
    public void shouldHitOnePin() throws Exception {
        hitNTimes(1);
            assertEquals(1,frame.getNoOfPinsHit());
    }

    @Test
    public void shouldNotHitMoreThanTenPins() throws Exception {
        hitNTimes(12);
        assertEquals(10,frame.getNoOfPinsHit());
    }

    @Test
    public void shouldHitFivePins() throws Exception {
        hitNTimes(5);
            assertEquals(5,frame.getNoOfPinsHit());
    }

    @Test
    public void getNoOfPinsHitForTwo() throws Exception {
        hitNTimes(2);
        assertEquals(2,frame.getNoOfPinsHit());
    }


    private void hitNTimes(int n)
    {
         for(int i=0; i<n ;i++)
             frame.hit(i);
    }
}
