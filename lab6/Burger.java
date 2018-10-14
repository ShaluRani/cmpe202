public class Burger implements Component
{
    private String receiptDescription, ingredient ;
    private Double price;
    
    
    public Burger()
    {
        price = 5.59;
       
    }
    
    public void printReceiptDescription()
    {

        ingredient = "LBB               " + price + "\n";
        ingredient += "{{{{BACON}}}}\n";
        ingredient += "LETTUCE\n";
        ingredient += "TOMATO\n";
        ingredient += "->|G ONION\n";
        ingredient += "->|JALA Grilled\n";  
    
    
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
