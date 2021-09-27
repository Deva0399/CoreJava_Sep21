package javaoppsconcept;

import sep27.Account;
import sep27.Employee;
import sep27.PoymorphismExample;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		
		emp1.EmpId=35;
		emp1.salary=3000;
		//Employee.department="ECE";
		
		emp1.display();
		
		Employee emp2= new Employee(30,35000);
		
		emp2.display();
		
		Employee emp3= new Employee("Deva",22,"Chennai",31,7000);
		
		emp3.display();
		
		PoymorphismExample obj1 = new PoymorphismExample();
		obj1.add(2,3);
		obj1.add(2,3,4);
		obj1.add(2.5,3.567);
		
		Account obj = new Account();
		obj.setBalance(12000);
		obj.setName("Devadharshni");
		System.out.println(obj.getName());
		System.out.println(obj.getBalance());
		

	}

}
