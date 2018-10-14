public class Main{
    public static void main(String[] args)
    {
        Burger b =  new Burger();
        Fries f = new Fries();
        Receipt receipt = new Receipt();
        receipt.addChild(b);
        receipt.addChild(f);
        Receipt custReceipt = new Receipt();
        custReceipt.addChild(receipt);
        custReceipt.printReceiptDescription();
        
        
        
        
    }
}