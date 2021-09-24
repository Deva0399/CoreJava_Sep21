package demo24;

public class SwitchExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=19;
		switch (age) {
		case 18:
		case 19:
			System.out.println("Eligible to vote");
			break;
		case 17:
			System.out.println("Sorry,You are eligible by next year");
			break;
		case 15:
			System.out.println("not eligible");
			break;
		default:
			System.out.println("default block");
		}

	}

}
