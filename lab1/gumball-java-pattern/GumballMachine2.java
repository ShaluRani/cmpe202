
/**
 * Write a description of class GumballMachine2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachine2 extends GumballMachine
{
    // instance variables - replace the example below with your own
    private int counter = 0;

    /**
     * Constructor for objects of class GumballMachine2
     */
    public GumballMachine2()
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
   public void insertQuarter() {
        counter++;
        if(counter == 2) {
            state.insertQuarter();
            counter = 0;
        }
    }
}
