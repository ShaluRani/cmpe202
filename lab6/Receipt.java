  
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Receipt implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description,display ; 
    
    public Receipt (String desc)
    {
        description = desc;
    }

    public void printDescription() {
        
        if(description.equals("CustReceipt"))
        {
            DecimalFormat fmt = new DecimalFormat("0.00");
            System.out.println("\nCustomer Receipt:");
            for (Component obj  : components)
            {
                obj.getPrice();
                obj.printDescription();
                
            }
        }
        else 
        if(description.equals("KitchenReceipt"))
        {
            System.out.println("\nKitchen Receipt:");
            for (Component obj  : components)
            {
                obj.printDescriptionSorted();
            }
        }
        
    }
    
    public void printDescriptionSorted() {
    }
    

    
    public void addChild(Component c) {
        components.add( c ) ;
    }
     
    public void removeChild(Component c) {
        components.remove(c) ;
    }
     
    public Component getChild(int i) {
        return components.get( i ) ;
    }
    
      public void getPrice()
      {
        }
        

     
}
 
