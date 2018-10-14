  

public interface Component {

     void printDescription() ;
     void printDescriptionSorted();
     void getPrice() ;
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);

}
 
