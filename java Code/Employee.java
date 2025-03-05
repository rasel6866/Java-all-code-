
public class Employee{

   
    private double salary;
    private double netSalary;
	
   public void managersalry(double s)
   {
	   salary=s;
   }
   public double managersalry()
   {
	   return salary;
   }
   public void adminsalary(double salary)
   {
	   this.salary=salary;
   }
   public double adminsalary()
   {
	   return salary;
   }
   public void sales_man_salary(double salary)
   {
	   this.salary=salary;
   }
   public double sales_man_salary()
   {
	   return salary;
    }
   
   void Manager()
   {
	   double mon=salary;
	   double year=salary*12;
	   System.out.println();
	   System.out.println();
	   System.out.println("Manager Salary");
	   System.out.println("Monthly Salary= "+salary);
	   System.out.println("Yearly salary= "+year);
	   System.out.println();
   }
   void admin()
   {
	   double mon=salary;
	   double year=salary*12;
	   System.out.println();
	   System.out.println("Admin Salary");
	   System.out.println("Monthly Salary= "+salary);
	   System.out.println("Yearly salary="+year);
	   System.out.println();
   }
   void salesman()
   { double mon=salary;
   double year=salary*12;
   System.out.println();
   System.out.println("Salesman Salary");
   System.out.println("Monthly Salary="+salary);
   System.out.println("Yearly Salary "+year);
   System.out.println();
   }
   
   
   
   
   
   public static void main(String[] args)
   {
	   Employee obj=new Employee();
	   obj.managersalry(5000);
	   obj.Manager();
	   obj.adminsalary(1000);
	   obj.admin();
	   obj.sales_man_salary(500);
	   obj.salesman();
	   
   }
		
}