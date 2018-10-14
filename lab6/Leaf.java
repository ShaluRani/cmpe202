 

import java.text.DecimalFormat;
import java.util.*;
//import java.util.Arrays;
//import java.util.Collections;


public class Leaf implements Component {

    private String description="", str1, str2, str3, str4, str5;
    protected Double price ;

    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
        str1 = "{{{{BACON}}}}\n";
        str2 = "LETTUCE\n";
        str3 = "TOMATO\n";
        str4 = "->|G ONION\n";
        str5 = "->|JALA Grilled\n";
    }
    
    
    public void printDescriptionSorted() {
        ArrayList<String> al = new ArrayList<String>();
        if(description == "LBB")
        {
        if(str1 != null) al.add(str1);
        if(str2 != null) al.add(str2);
        if(str3 != null) al.add(str3);
        if(str4 != null) al.add(str4);
        if(str5 != null) al.add(str5);
        Collections.sort(al);
        description += al;
    }
        System.out.println(description  );
 
    }
    
    public void printDescription() {
        if(description == "LBB")
        {
        description += str1+str2+str3+str4+str5;
    }
        System.out.println( description );
    }
    
    public void getPrice()
    {
        System.out.print("          " + price + "\n");
    }
    

    public void addChild(Component c) {
        // no implementation
    }

    public void removeChild(Component c) {
        // no implementation
    }

    public Component getChild(int i) {
        // no implementation
        return null ;
    }
    
    public void displayContent()
    {
    }
    

     
}
 
