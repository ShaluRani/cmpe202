  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/2 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        // premium cheese +1.50
        PremiumCheese pc = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco = { "Danish Blue Cheese" } ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;
         // 1 sauce free, extra +.50
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        // Unlimited Toppings
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        // premium topping +1.00 - +3.00
        PremiumToppings pt = new PremiumToppings( "Premium Options" ) ;
        String[] pto = { "Marinated Tomatoes" } ;
        pt.setOptions( pto ) ;
        pt.wrapDecorator( t ) ;
        // Base price of bun included. Extra charges for specifications
        Bun bn = new Bun( "Bun Options" ) ;
        String[] bno = { "Ciabatta(Vegan)" } ;
        bn.setOptions( bno ) ;
        bn.wrapDecorator( pt ) ;
        // side +3.00
        Side sd = new Side( "Side Options" ) ;
        String[] sdo = { "Shoestring Fries" } ;
        sd.setOptions( sdo ) ;
        sd.wrapDecorator( bn ) ;
       
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( sd ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( pt ) ;
        customBurger.addChild( bn ) ;
        customBurger.addChild( sd ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/2 lb
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gouda", "Greek Feta" } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;
        // premium cheese +1.50
        PremiumCheese pc2 = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco2 = { "Fresh Mozarrella" } ;
        pc2.setOptions( pco2 ) ;
        pc2.wrapDecorator( c2 ) ;
         // 1 sauce free, extra +.50
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" } ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( pc2 ) ;
        // Unlimited Toppings
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts" } ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( s2 ) ;
        // premium topping +1.00 - +3.00
        PremiumToppings pt2 = new PremiumToppings( "Premium Options" ) ;
        String[] pto2 = { "Sunny Side Up Egg*", "Marinated Tomatoes" } ;
        pt2.setOptions( pto2 ) ;
        pt2.wrapDecorator( t2 ) ;
        // Base price of bun included. Extra charges for specifications
        Bun bn2 = new Bun( "Bun Options" ) ;
        String[] bno2 = { "Gluten-Free Bun" } ;
        bn2.setOptions( bno2 ) ;
        bn2.wrapDecorator( pt2 ) ;
        // side +3.00
        Side sd2 = new Side( "Side Options" ) ;
        String[] sdo2 = { "Shoestring Fries" } ;
        sd2.setOptions( sdo2 ) ;
        sd2.wrapDecorator( bn2 ) ;
       
        
        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( sd2 ) ;
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( pc2 ) ;
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( pt2 ) ;
        customBurger2.addChild( bn2 ) ;
        customBurger2.addChild( sd2 ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger2 );
        return order ;
  
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/