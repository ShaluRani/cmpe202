
/**
 * Write a description of class GumballMachine3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachine3 extends GumballMachine
{
    // instance variables - replace the example below with your own
    private int coinCounter = 0;
    /**
     * Constructor for objects of class GumballMachine3
     */
    public GumballMachine3()
    {
        // initialise instance variables
       super(50);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void insertQuarter( int coinAmount) {
        coinCounter += coinAmount;
        if(coinCounter >= 50) {
            state.insertQuarter();
            coinCounter = coinCounter - 50;
        }
    }
}
