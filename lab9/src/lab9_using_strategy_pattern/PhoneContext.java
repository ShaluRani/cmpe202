package lab9_using_strategy_pattern;

public class PhoneContext {
	PhoneNumStrategy strategy ;
	
	public PhoneContext(PhoneNumStrategy strategy)
	{
		this.strategy = strategy ;
	}
	
	public void getNum(String num)
	{
		System.out.println("Entered Num:"+num);
		strategy.displayPhoneNum();
	}

}
