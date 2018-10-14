public class Main{
    public static void main(String[] args)
    {
        Receipt receipt = new Receipt("CustReceipt");
        receipt.addChild(new Leaf("LBB",5.59));
        receipt.addChild(new Leaf("LTL CAJ",2.79));
        Receipt receipt2 = new Receipt("KitchenReceipt");
        receipt2.addChild(new Leaf("LBB",5.59));
        receipt2.addChild(new Leaf("LTL CAJ",2.79));
        receipt.printDescription();
        receipt2.printDescription();       
    }
}