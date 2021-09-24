package demo;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {11,23,55,32,12,89};
		System.out.println(array1[5]);
        array1[0]=50;
		System.out.println(array1[5]); //it will print 5th index value
		System.out.println(array1.length);
		System.out.println(array1[array1.length-1]);
		for(int i=0; i <= (array1.length-1); i++ )
        {
            System.out.println(array1[i]);
        }

	}

}
