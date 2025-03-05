import java.util.Scanner;
public class ScannerDemo1
{
	public static void main (String [] args )
	{
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("Enter your Name             : ");
		String name = sc.nextLine();
		System.out.print("Enter your Gender           : ");
		char gender =sc.next().charAt(0);
		System.out.print("Enter your Age              : ");
		int age =sc.nextInt();
		System.out.print("Enter your MobileNo         : ");
		long mobileNo=sc.nextLong();
		System.out.print("Enter your Cgpa             : ");
		double cgpa=sc.nextDouble();
		System.out.print("Enter your Blood Group      : ");
		String blood=sc.next();
		System.out.print("Enter your Univercity Name  : ");
		String uvname=sc.next();
		System.out.print("Enter your Faculty          : ");
		String faculty=sc.next();
		
	    System.out.println();
	    System.out.println();
	    System.out.println();
		
		
		
		
		
      System.out.println("Name                          :"+name);
	  System.out.println("Gender                        :"+gender);
	  System.out.println("Age                           :"+age);
	  System.out.println("MobileNo                      :0"+mobileNo);
	  System.out.println("Cgpa                          :"+cgpa);
	  System.out.println("Blood Group                   :"+blood);
	  System.out.println("Univercity Name               :"+uvname);
	  System.out.println("Faculty                       :"+faculty);
	}
	
}