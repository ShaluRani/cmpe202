
public class CardExpDecorator extends MaskDecorator {
	
	public CardExpDecorator(IDisplayComponent keymask)
	{
		super(keymask) ;
	}
	
	public String display()
	{
		return msg();
	}
	
	private String msg()
	{
		String cardExp = keymask.display(), msg ;
		StringBuffer cardExpNew = new StringBuffer() ;
		int count, len = cardExp.length() ;
		if(!cardExp.equals("[MM/YY]  ")) {
			for(count = 0; count < len; count ++)
			{
				if(count == 3 && len > 5)
					cardExpNew.append("/") ;
				cardExpNew.append(cardExp.charAt(count)) ;
			}
			msg = cardExpNew.toString() ;
		}
		else
			msg = cardExp ;
		
		return msg ;
	}
}
