class A
{
	A()
	{
		System.out.println("I am from class A constructor");
	}
	void show()
	{
		System.out.println("I am from class A");
	}
}
class B extends A
{
	B()
	{   //super();
		System.out.println("I am from class B constructor");
	}
	int num = 10;
	void show()
	{
		super.show();
		System.out.println("I am from class B");
	}
}
class C extends B
{
	C()
	{
		//super();
		System.out.println("I am from class C constructor");
	}
	int num = 20;
	void print(int num)
	{
		
		System.out.println(num); 
		System.out.println(this.num);
		System.out.println(super.num);
	}
	void show()
	{
		super.show();
		System.out.println("I am from class C");
	}
   	
}
public class superex
{
	public static void main(String[]args)
	{
		C obj = new C();
		obj.print(30);
		obj.show();
	}
}