package test;

public class ConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		for (int i=0;i<=50;i++) {
			if(i % 2 ==0) {
			System.out.println("Evennumbers" +i);
			}
			else {
				System.out.println("Oddnumbers" + i);
			}
		}
//=================================
		int age=21;
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}
		else if(age==17) {
			System.out.println("sorry, you will be eligible by next year");
		}
		else {
			System.out.println("you are not eligible");
		}
		
	}

}
