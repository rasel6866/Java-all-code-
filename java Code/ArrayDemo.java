import java.lang.*;

public class ArrayDemo
{
	public static void main(String []args)
	{
		int A[] = new int [5];
		A[0] = 10;
		A[3] = 20;
		
		for(int i=0; i<A.length; i++)
		{
			System.out.println("A["+i+"] : "+A[i]);	
		}
		
		for(int value : A)
		{
			System.out.println(value);
		}
		
		int []B;
		int size = (A[3] / A[0]) + 2;
		B = new int [size];
		
		B[0] = 11;
		B[1] = 22;
		B[2] = 33;
		B[3] = 44;
		
		for(int value : B)
		{
			System.out.println(value);
		}
		
		int []C = new int []{1,2,3};
		
		for(int i=0; i<C.length; i++)
		{
			System.out.println("C["+i+"] : "+C[i]);
		}
		
		int D[] = {1,2,3,4};
		
		int index = 0;
		
		while(index<D.length)
		{
			System.out.println(D[index]);
			index++;
		}
	}
}