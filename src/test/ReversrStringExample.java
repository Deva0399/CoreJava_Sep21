package test;

public class ReversrStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="Deva  Dharshni BE ";
				for(int i=0;i<=x.length()-1;i++) {
					System.out.println(x.charAt(i));
				}
				for(int i=x.length()-1;i>=0;i--) {
					System.out.println(x.charAt(i));
				}
				
				String[] words = x.trim().split(" ");
		         System.out.println("Total words are "+ words.length);
		         

	}

}
