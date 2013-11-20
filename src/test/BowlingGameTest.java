import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {
    BowlingGame bowlingGame;

    @Before
    public void setUp() throws Exception {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void scoreShouldReturnZeroForNoPins() throws Exception {
        int score = bowlingGame.score();
        Assert.assertEquals(0, score);
    }

    @Test
    public void scoreShouldReturnTwentyForTwentyHits() throws Exception {
        rollNTimes(20, 1);
        assertEquals(20, bowlingGame.score());
    }


    @Test
    public void testASpare() throws Exception {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        bowlingGame.roll(3);
        rollNTimes(17, 0);
        assertEquals(16, bowlingGame.score());

    }

    @Test
    public void testAStrike() throws Exception {
        bowlingGame.roll(10);
        bowlingGame.roll(4);
        bowlingGame.roll(3);
        rollNTimes(17, 0);
        assertEquals(24, bowlingGame.score());
    }

    @Test
    public void testAllStrikeInGame() throws Exception {
        rollNTimes(20,10);
        assertEquals(300, bowlingGame.score());

    }

    private void rollNTimes(int times, int pinsHit)
    {
        for(int i=0; i<times; i++)
            bowlingGame.roll(pinsHit);
    }

}
