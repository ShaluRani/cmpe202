

public class Main {

	public static void main(String[] args) {
		GumballMachine1 gumballMachine1 = new GumballMachine1();
		GumballMachine2 gumballMachine2 = new GumballMachine2();
		GumballMachine3 gumballMachine3 = new GumballMachine3();

		System.out.println(gumballMachine1);

		gumballMachine1.insertQuarter();
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine2);

		gumballMachine2.insertQuarter();
		gumballMachine2.insertQuarter();
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine3);
		
		gumballMachine3.insertQuarter(25);
		gumballMachine3.insertQuarter(10);
		gumballMachine3.insertQuarter(10);
		//gumballMachine3.insertQuarter(5);
		gumballMachine3.turnCrank();
		
		System.out.println(gumballMachine1);

		gumballMachine1.insertQuarter();
		gumballMachine1.turnCrank();
	}
}
