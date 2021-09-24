package test;

public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        int n1=436721;
        int count=0;
        while(n1>0) {
       	 int r= n1%10;
       	 System.out.println(r);
       	 count++;
       	 n1=n1/10;
        }
        System.out.println("Total digits are "+count);

	}

}
