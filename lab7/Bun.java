public class Bun extends LeafDecorator
{
    private String[] options ;
    
    
    public Bun( String d )
    {
        super(d) ;
    }
    
    // 1 sauce free, extra +.75
    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
            if(options[i].equals("Gluten-Free Bun") || options[i].equals("Hawaiian Bun"))
                this.price += 1.00 ;
            else if(options[i].equals("Pretzel Bun"))
                this.price += 0.50 ;
            else this.price += 0.00 ;
        }
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