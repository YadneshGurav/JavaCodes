package interfaces;


interface Calculator
{
	void add();
	void sub();
	
	default void display()
	{
		System.out.println("Default"); 
	}
	
	static void ststicmehod()
	{
		System.out.println("Ststic mthod");
	}
}

class MyCalculator implements Calculator
{
	@Override
	public void add()
	{
		System.out.println("add method");
	}
	
	@Override
	public void sub()
	{
		System.out.println("Sub method");
	}
}
public class ExeInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator m= new MyCalculator();
		m.display();
		m.add();
		m.sub();

		
	}

}
