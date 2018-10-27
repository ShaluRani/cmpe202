
public class CardNumDecorator extends MaskDecorator {
	
	public CardNumDecorator(IDisplayComponent keymask)
	{
		super(keymask) ;
	}
	
	public String display()
	{
		return msg();
	}
	
	private String msg()
	{
		String cardNum = keymask.display(), msg ;
		StringBuffer cardNumNew = new StringBuffer() ;
		int count, len = cardNum.length() ;
		if(!cardNum.equals("[4444 4444 4444 4444]  ")) {
			for(count = 0; count < len; count ++)
			{
				cardNumNew.append(cardNum.charAt(count)) ;
				if(count % 4 == 0 && count != 16 && count != 0)
					cardNumNew.append(" ") ;
			}
			msg = cardNumNew.toString() ;
		}
		else
			msg = cardNum ;
		
		return msg ;
	}

}
