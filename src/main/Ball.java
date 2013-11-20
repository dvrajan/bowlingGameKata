public class Ball {
    public void roll(Frame frameToHit, int noOfPinsToHit)
    {
        for(int i=0; i < noOfPinsToHit; i++)
            frameToHit.hit(i);
    }
}
