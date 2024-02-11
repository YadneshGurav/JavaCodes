package p;

import java.util.Scanner;

public class LiftProblem {

	public void selectFloor()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Options: (s)elect a floor, (f)ire alarm, (q)uit");
		char op = sc.next().charAt(0);
		
		switch(op)
		{
		case 'q':
			System.out.println("Now you go");
			break;
			
		case 'f':
			System.out.println("Empty the building now...");
			break;
			
		case 's':
			System.out.println("Select the floor");
			int newfloor = sc.nextInt();
			if(newfloor < 1 || newfloor > 10)
			{
				System.out.println("Invalid selection");
			}
			else
			{
				int	currentFloor= 0;
				for(int i=currentFloor; i <= newfloor; i++)
					{
						System.out.print("... "+i);
					}
				System.out.println("\nDinggg....");
			}
			
			break;
			
			default :
				System.out.println("Invalid selection Re-Enter your option ");
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LiftProblem l =new LiftProblem();
		while(true)
		{
			l.selectFloor();
		}
	}

}
