package demo;
import java.util.Scanner;

public class CalculateArea {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
       
        int length,bredth,side;
        System.out.println("Enter Lenght");
        length = scan.nextInt();
        
        System.out.println("Enter Bregth");
        
        bredth = scan.nextInt();
        
        int arearect = length * bredth;
        System.out.println("Enter side");
        side = scan.nextInt();
        
        
		int area = side*side;
		System.out.println("Area of Square is: "+area);
		System.out.println("Area of rectangle: "+arearect);

	}

}
