package lab9_using_strategy_pattern;


public class Main {
	
	public static void main(String args[])
	{
		PhoneContext pc ;
		String phoneNum = "1 408 645 4112" ;
		if(phoneNum.charAt(0) == '1') {
			pc = new PhoneContext(new USPhoneNum()) ;
			pc.getNum(phoneNum);
		}
		phoneNum = "44 408 645 4112" ;
		if(phoneNum.charAt(0) == '4' && phoneNum.charAt(1) == '4') {
			pc = new PhoneContext(new UKPhoneNum()) ;
			pc.getNum(phoneNum);	
		}
		
	}

}
