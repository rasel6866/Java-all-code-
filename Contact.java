public class contact{
	private String personName;
    private String personId;
    private int age;
    private String mobileNumber;
    private char gender ;

public String  getName(){
	return this.personName;
}

public void setName(String name){
	this.personName =name;
	
}

public String getId(){
	return this.personId;
}
public void personId(String id){
	this.personId=id;
}

public int  getage(){
	return this.age;
}

public void setage(int  age){
	this.age=age;
}
public String getNumber(){
	return this.mobileNumber;
}
public void mobileNumber(String number){
	this.mobileNumber =number;
}
public  char getgender(){
	return this.gender;
}
public void setName(char gender){
	this.gender =gender;
}

public contact() {
   	this.personName = "default";
	this.personId ="000";
	this.age=21;
	this.mobileNumber= "0000";
	this.gender='M';
	
}
public contact( String personName,String personId,int age,String mobileNumber,char gender){ // parameterized
	this.personName=personName;
	this.personId = personId;
	this.age= age;
	this.mobileNumber= mobileNumber;
	this.gender=gender;
}
public void showPersonInfo()
{
	System.out.println("Person name:  " + this.getName());
	System.out.println("Person Id: " + this.getId());
	System.out.println("Person age: " + this.getage());
	System.out.println("Mobile Number: " + this.getNumber());
	System.out.println("Person age: " + this.getgender());
}

public void detectMobileOperator() {
	if (this.mobileNumber.contains("017")) {
		System.out.println("Grameen phone(GP)");
	}
	else if (this.mobileNumber.contains("016"))
	{
		System.out.println("Airtel");
	}
	else {
		System.out.println("This is invalid mobileNumber");
	}
}
}
