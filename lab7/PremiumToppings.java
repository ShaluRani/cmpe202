import java.lang.String;

public class PremiumToppings extends LeafDecorator
{
    private String[] options ;
    
    
    public PremiumToppings( String d )
    {
        super(d) ;
    }
    
    public void setOptions( String[] options )
    {
        this.options = options ;
        int len = options.length ;
        if ( len > 0 )
        {
            for(int i = 0; i<len; i++) {
                if(options[i].equals("Marinated Tomatoes"))
                    this.price += 2.00 ;
                }
            this.price += len * 1.00 ;
        }
        System.out.println("Entering PremiumToppings\n"+this.price);
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
}