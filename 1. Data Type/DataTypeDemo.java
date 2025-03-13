import java.lang.*;

public class DataTypeDemo
{
	boolean b1;
	char c1, c2;
	float f1, f2, f3, f4;
	double d1, d2, d3, d4;
	byte bt1, bt2;
	short s1, s2;
	int i1, i2;
	long l1, l2;
	
	public static void main(String args[])
	{
		DataTypeDemo dtd = new DataTypeDemo();
		
		System.out.println("");
		System.out.println("Default Value of boolean: "+dtd.b1);
		
		System.out.println("");
		System.out.println("Default Value of char: "+dtd.c1);
		
		dtd.c1 = '\u0000';
		System.out.println("Lowest Range of char: "+dtd.c1);
		dtd.c2 = '\uFFFF';
		System.out.println("Highest Range of char: "+dtd.c2);
		//you can see the whole list in this link https://unicode-table.com/en/
		 
		System.out.println("");
		System.out.println("Default Value of float: "+dtd.f1);
		
		dtd.f1 = -99999999999999999999999999999999999999.0F*3.40F; 
		System.out.println("Lowest Range of Negetive float: "+dtd.f1);
		dtd.f2 = -0.000000000000000000000000000000000000000000001F;
		System.out.println("Highest Range of Negetive float: "+dtd.f2);
		dtd.f3 = 0.000000000000000000000000000000000000000000001F;
		System.out.println("Lowest Range of Positive float: "+dtd.f3);
		dtd.f4 = 99999999999999999999999999999999999999.0F*3.40F; 
		System.out.println("Highest Range of Positive float: "+dtd.f4);
		
		System.out.println("");
		System.out.println("Default Value of double: "+dtd.d1);
		
		dtd.d1 = -99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.0*1.79;
		System.out.println("Lowest Range of Negetive double: "+dtd.d1);
		dtd.d2 = -0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000025;
		System.out.println("Highest Range of Negetive double: "+dtd.d2);
		dtd.d3 = 0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000025;
		System.out.println("Lowest Range of Positive double: "+dtd.d3);
		dtd.d4 = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.0*1.79;
		System.out.println("Highest Range of Positive double: "+dtd.d4);
		
		System.out.println("");
		System.out.println("Default Value of byte: "+dtd.bt1);
		
		dtd.bt1 = -128;
		System.out.println("Lowest Range of byte: "+dtd.bt1);
		dtd.bt2 = 127;
		System.out.println("Highest Range of byte: "+dtd.bt2);
		//the next two lines will give error
		//dtd.bt1= -129;
		//dtd.bt2 = 128;
		
		System.out.println("");
		System.out.println("Default Value of short: "+dtd.s1);
		
		dtd.s1 = -32768;
		System.out.println("Lowest Range of short: "+dtd.s1);
		dtd.s2 = 32767;
		System.out.println("Highest Range of short: "+dtd.s2);
		//the next two lines will give error
		//dtd.s1= -32769;
		//dtd.s2 = 32768;
		
		System.out.println("");
		System.out.println("Default Value of int: "+dtd.i1);
				
		dtd.i1 = -2147483648;
		System.out.println("Lowest Range of int: "+dtd.i1);
		dtd.i2 = 2147483647;
		System.out.println("Highest Range of int: "+dtd.i2);
		//the next two lines will give error
		//dtd.s1= -2147483649;
		//dtd.s2 = 2147483648;
		
		System.out.println("");
		System.out.println("Default Value of long: "+dtd.l1);
		
		dtd.l1 = -9223372036854775808L;
		System.out.println("Lowest Range of int: "+dtd.l1);
		dtd.l2 = 9223372036854775807L;
		System.out.println("Highest Range of int: "+dtd.l2);
		//the next two lines will give error
		//dtd.s1= -9223372036854775809L;
		//dtd.s2 = 9223372036854775808L;
		
	}
}