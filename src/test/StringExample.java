package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Fname="Deva";
		String Lname="Dharshni";
		String Fullname = Fname + " " + Lname;
	    System.out.println("Full name is "+ Fullname);
	    System.out.println("Full name is "+ Fullname.length());
	    System.out.println("Name in Uppercase "+ Fullname.toUpperCase());
	    
	    String NewName = Fullname.replace(" ",",");
	    System.out.println("New Name is "+ NewName);

	}

}
