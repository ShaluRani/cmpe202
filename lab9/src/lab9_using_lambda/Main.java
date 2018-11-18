package lab9_using_lambda;

public class Main {
	
	public static void main(String args[])
	{
		PhoneNumStrategy USPhoneNum = (phoneNum) -> "Entered Num:" + phoneNum +"\n" + "You have entered a US number" ;
		PhoneNumStrategy UKPhoneNum = (phoneNum) -> "Entered Num:" + phoneNum +"\n" + "You have entered a UK number" ; ;
		System.out.println(USPhoneNum.displayPhoneNum("1 408 645 4112"));	
		System.out.println(UKPhoneNum.displayPhoneNum("44 408 645 4112"));	
		
	}

}
