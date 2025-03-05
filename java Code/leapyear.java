public class leapyear
{ 

public static void main(String[] args)
{    
    int year=2012;
  
    if((year%4==0 && year%100!=0) ||  year%400==0)

	    System.out.println(" 2012 is  Leap Year");
	else
	      System.out.println(" Not Leap Year");
}
}