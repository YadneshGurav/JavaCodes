package co;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee{
	
	private int E_id;
	private String E_name;
	private double E_salary;
	private String E_location;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int e_id, String e_name, double e_salary, String e_location) {
		super();
		E_id = e_id;
		E_name = e_name;
		E_salary = e_salary;
		E_location = e_location;
	}
	public int getE_id() {
		return E_id;
	}
	public void setE_id(int e_id) {
		E_id = e_id;
	}
	public String getE_name() {
		return E_name;
	}
	public void setE_name(String e_name) {
		E_name = e_name;
	}
	public double getE_salary() {
		return E_salary;
	}
	public void setE_salary(double e_salary) {
		E_salary = e_salary;
	}
	public String getE_location() {
		return E_location;
	}
	public void setE_location(String e_location) {
		E_location = e_location;
	}
	@Override
	public String toString() {
		return "Employee [E_id=" + E_id + ", E_name=" + E_name + ", E_salary=" + E_salary + ", E_location=" + E_location
				+ "]";
	}
	
	
	
	
	
	
	
	
}

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> e= new ArrayList<Employee>();
		
		Employee E= new Employee(1111,"A",50000,"Sangli");
		Employee E1= new Employee(2222,"B",60000,"Pune");
		Employee E2= new Employee(3333,"C",40000,"Pune");
		
		e.add(E);
		e.add(E1);
		e.add(E2);
		
		Iterator<Employee> ei=e.iterator();
		
		System.out.println("E_id\tE_name\tE_Salary\tE_Location");
		System.out.println("----------------------------------------------------------------");
		
		while(ei.hasNext())
		{
			Employee sob=ei.next();
//			System.out.println(sob);
			System.out.println(sob.getE_id()+"\t"+sob.getE_name()+"\t"+sob.getE_salary()+"\t\t   "+sob.getE_location());
		}
		
	}

}
