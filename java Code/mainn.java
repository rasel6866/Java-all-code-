class Department
{
	 public int deptID;
	public String DeptName;
	Department()
	{
		
	}	
	Department(int deptID,String DeptName)
	{
		this.deptID=deptID;
		this.DeptName=DeptName;
		
		
	}
	public void setDepartName(String DeptName)
	{
		this.DeptName=DeptName;
		
	}
	public String getDepartment()
	{
		return DeptName;
	}
	public void setdeptID(int deptID)
	{
		this.deptID=deptID;
	}
	public int getdeptID()
	{
		return deptID;
	}
}

class Employee extends Department
{
	 public double salary;
	public String empName;
	Employee()
	{
		
	}
	Employee(String empName,double salary)
	{
		this.salary=salary;
		this.empName=empName;
		
	}
	public void setempName(String empName)
	{
		this.empName=empName;
		
	}
	public String getempName()
	{
		return empName;
	}
	public void setsalary(double salary )
	{
		this.salary=salary;
	}
	public double getsalary()
	{
		return salary;
	}
	
}
	class Faculty extends Employee
	{
	int teachingHour;
	Department dept;
	
   Faculty(){}
   Faculty(String empName,double salary ,int th, Department d)
   {
   
   this.empName=empName;
   this.salary=salary;
   teachingHour=th;
   dept=d;
   }
   
   Department setTeachingHour(int th)
{
    teachingHour=th;
	return teachingHour;
	
	
}
public double getTeachingHour()
{
	return teachingHour;
}
public void setDepartment(Department d)   ///
{

}
public String getDepartment()
{
	
	 
} 
Department getDepartment()  ///
{
	
} 
void showInfo()
{



}
}
public class mainn
{
	public static void main(String[] args)
	{
		Department cs=new Department(1,"Computer Science");
		Faculty f1=new Faculty("Tony Stark",100000,12,cs);
		f1.showInfo();
		
	}
	
	
}






















