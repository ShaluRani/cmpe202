

public class Main {

	public static void main(String[] args) {
		Machine1 gumballMachine1 = new Machine1();
		Machine2 gumballMachine2 = new Machine2();
		Machine3 gumballMachine3 = new Machine3();

		System.out.println(gumballMachine1);

		gumballMachine1.insertQuarter( 25 );
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine2);

		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine3);
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 10 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
	}
}
