package demo;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String str1="Devadharshni Kathirvel ECE";
	    String revStr1="";
		int j;
	
		int[] array= {11,12,13,14,15};
		for( i=1; i<=10;i++)
		{
			System.out.println(i);
		}
		for (i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		for(i=array.length-1; i> 0 ; i--)
        {
            System.out.println(array[i]);
        }
		for (int values:array) {
			System.out.println(values);
		}
		for(j=0;j<str1.length();j++) {
			System.out.println(str1.charAt(j));
		}
		for (int k=str1.length()-1;k>=0;k--) {
			revStr1 += str1.charAt(k);
		}
         System.out.println("Reversed String is:"+ revStr1);
         String[] words = str1.split(" ");
         System.out.println("Total words are "+ words.length);
         
         
         //====================
         
         int x=1;
        
         
         while(x<=10) {
        	 System.out.println(x);
        	 x=x+1;
         }
         int n1=436721;
         int count=0;
         while(n1>0) {
        	 int r= n1%10;
        	 System.out.println(r);
        	 count++;
        	 n1=n1/10;
         }
         System.out.println("Total digits are "+count);
         
         //========================
         int n2=10;
         do {
        	 System.out.println(n2);
        	 n2--;
         }while(n2>0);         
         
         
         
	}

}
