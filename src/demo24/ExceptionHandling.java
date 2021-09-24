package demo24;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		
		int b[]= {12,1,3};
		try {
			//System.out.println(a/0);
			System.out.println(b[1]);
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Inside nullpoint exception");
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Inside arithmetic exception");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Inside generic exception");
		}finally {
			System.out.println("Inside finally");
		}
		System.out.println("AfterException");

	}

}
