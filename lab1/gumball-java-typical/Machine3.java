
/**
 * Write a description of class Machine3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Machine3 extends GumballMachine
{
    // instance variables - replace the example below with your own
    private int Total = 0;

    /**
     * Constructor for objects of class Machine3
     */
    public Machine3()
    {
        // initialise instance variables
        super(50);
    }

        public void insertQuarter(int coin)
    {
        Total += coin;
        if ( Total < 50 ) {
            System.out.println("An amount of 50 cents is expected.");
        }
        else 
            if( Total >= 50 ) {
                Total = Total - 50;
                if(Total > 0) {
                    System.out.println("Balance of "+ Total + " will not be returned. Add amount to get more gumballs");
                }
                setHasQuarter(true);
            }       
    }
}
