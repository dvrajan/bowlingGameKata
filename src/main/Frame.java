public class Frame {

    public static final int NO_OF_PINS = 10;
    private boolean[] pins = new boolean[NO_OF_PINS];


    public void hit(int pinNo)
    {
        if(pinNo < NO_OF_PINS )
            pins[pinNo] = true;
    }

    public int getNoOfPinsHit()
    {
        int count = 0;
        for(boolean pin : pins){
            if(pin == true)
                count ++;
        }
        return count;
    }

}
