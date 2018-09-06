
/**
 * Write a description of class Machine2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Machine2 extends GumballMachine
{
    // instance variables - replace the example below with your own
    private int counter = 1;

    /**
     * Constructor for objects of class Machine2
     */
    public Machine2()
    {
        // initialise instance variables
       super(50);
    }

     public void insertQuarter(int coin)
    {
        if ( coin == 25 && counter < 2 ) {
            counter++;
            System.out.println("Insert another quarter");
        }
        else 
            if( counter == 2 ) {
                counter = 0;
                setHasQuarter(true);
            }    
    }
}
