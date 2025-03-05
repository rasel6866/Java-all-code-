class Department{
int deptId;
String deptName;

public Department(){}

public Department(int deptId, String deptName){
this.deptId = deptId;
this.deptName = deptName;
}

void setDeptName(String deptName){
this.deptName = deptName;
}

String getDeptName() {
return this.deptName;
}

int getDeptId(){
return this.deptId;
} 
} 

class Employee {
String empName;
double salary;

public Employee() {};
public Employee(String empName, double salary){
this.empName = empName;
this.salary = salary;
}

void setEmpName(String empName){
this.empName = empName;
}
void setSalary(double salary){
this.salary = salary;
}

String getEmpName() {
return this.empName;
}
double getSalary(){
return this.salary;
}
} 

class Faculty extends Employee {
int teachingHour;
Department dept;

public Faculty(){};

public Faculty(String empName, double salary, int th, Department d){
super(empName, salary);
this.teachingHour = th;
this.dept = d;
}

void setTeachingHour(double th) {
this.teachingHour = (int)th;
}

double getTeachingHour() {
return (double)this.teachingHour;
}

Department getDepartment() {
return this.dept;
}

void showInfo() {
System.out.println("Name:"+ this.empName);
System.out.println("Salary: "+ this.salary);
System.out.println("Teaching Hour: "+ this.teachingHour);
System.out.println("Department Name: "+ this.dept.deptName);
}


}

public class Main1{
public static void main(String[] args) {
Department cs = new Department(1, "Computer Science");
Faculty f1 = new Faculty("Tony Stark", 10000, 12, cs);
f1.showInfo();
}
}