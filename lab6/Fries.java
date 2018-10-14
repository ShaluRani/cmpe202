public class Fries implements Component
{
    private String ingredient ;
    private Double price;
    
    
    public Fries()
    {
        price = 2.79;
    }
    
    public void printReceiptDescription()
    {
        ingredient = "LTL CAJ               " + price + "\n"; 
    }
    
    public String getDescription() 
    {        
        return ingredient ;
    }
    
    public Double getPrice()
    {
        return price;
    }   
}
