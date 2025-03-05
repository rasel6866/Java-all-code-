
import java.util.Scanner;
public class Sales1
{
	public static void main(String[] args)
	{
	
	double sales;
	double gross;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the amount for the sales in week= ");
	sales=input.nextInt();
	
	while(sales!=0)
	{
		System.out.println("Press Zero for end the program");
		double earn= 200 + (0.09*sales);
		System.out.println("Earning for this week : "+earn);
		System.out.print("Enter the amount for the sales in week= ");
		sales=input.nextInt();
	}
	}
}