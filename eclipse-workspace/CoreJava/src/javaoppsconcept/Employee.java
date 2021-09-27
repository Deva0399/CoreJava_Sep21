package javaoppsconcept;

import javaoppsconcept.Employee;
import javaoppsconcept.Person;

public class Employee extends Person {

	    public int EmpId;
		public int salary;
	    static String department;
		
		public Employee() {
			super();
			System.out.println("Inside the empty constructor");
		}
		public Employee(int empid,int sal) {
			this();
			this.EmpId=empid;
			this.salary=sal;
	
		}
		public Employee(String name,int age,String city,int empid,int sal) {
			super(name,age,city);
			
			this.EmpId=empid;
			this.salary=sal;
			
		}
		
		public void display() {
			super.display();
			
			System.out.println("Emp ID is :" + EmpId);
			System.out.println("salary is :" + salary);
			System.out.println("Dep is :" + Employee.department);
			//System.out.println("Name is :" + Name);
			//System.out.println("Age is :"+ age);
			//System.out.println("city is :"+ city);
		}

	}


