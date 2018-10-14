  
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Receipt implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ; 
    
    public Receipt ()
    {
        
    }

    public void printReceiptDescription() {
        //DecimalFormat fmt = new DecimalFormat("0.00");
        for (Component obj  : components)
        {
            obj.printReceiptDescription();
        }
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
     
}
 
