public class BowlingGame {

    public static final int TOTAL_POSSIBLE_CHANCES = 21;

    public BowlingGame()
    {
        setupGame();

    }

    private void setupGame() {
        for(int i=0; i<TOTAL_POSSIBLE_CHANCES; i++)
        {
            frames[i] = new Frame();
            ball = new Ball();
        }
    }

    public void roll(int noOfPinsToHit)
    {
        ball.roll(frames[currentChance], noOfPinsToHit);
        currentChance++;
    }

    public int score()
    {
        int score = 0;
        currentChance = 0;
        for(int frame=0; frame < 10; frame++)
        {
            if(isStrike(currentChance))
            {
                score += 10 + getStrikeBonus(currentChance);
                skipAChance();
            }
            else if(isSpare(currentChance))
            {
                score += 10 + getSpareBonus(currentChance);
                nextChance();
            }
            else
            {
                score += sumOfBallsInFrame(currentChance);
                nextChance();
            }
        }
        return score;
    }

    private void nextChance() {
        currentChance += 2;
    }

    private void skipAChance() {
        currentChance++;
    }

    private int sumOfBallsInFrame(int chance) {
        return frames[chance].getNoOfPinsHit() + frames[chance + 1].getNoOfPinsHit() ;
    }

    private int getStrikeBonus(int chance)
    {
        return frames[chance + 1].getNoOfPinsHit() + getSpareBonus(chance);
    }

    private int getSpareBonus(int chance){
        return frames[chance + 2].getNoOfPinsHit();
    }

    private boolean isSpare(int chance){
        return sumOfBallsInFrame(chance) == 10;
    }

    private boolean isStrike(int chance){
        return frames[chance].getNoOfPinsHit() == 10;
    }



    private Frame[] frames = new Frame[TOTAL_POSSIBLE_CHANCES];
    private int currentChance = 0;
    private Ball ball;


}
