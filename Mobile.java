public class mobile
   {
	private  String mobileOwnerName;
	private String mobileNumber ;
    private double mobileBalance;
    private String mobileOSName;
    private boolean lock;
	
	
	public String getName()
	{
		return this.mobileOwnerName;
	}
	
	public void setName(String name){
		 this.mobileOwnerName = name;
	}
	public String getNumber(){
		return this.mobileNumber;
	}
	public void setNumber( String number ){
		this.mobileNumber = number ;
	}
	
	public double getBalance(){
		 return this.mobileBalance;
	}
	public void setBalance(double Balance){
		 this.mobileBalance = Balance;
	}
	
	public String getOSName(){
		return this.mobileOSName;
	}
	public void setOSName(String OSName){
		this.mobileOSName = OSName;
	}
	
	
	public boolean getlock(){
		return this.lock;
	}
	
 public void setlock(boolean lock){
	 this.lock=lock;
 } 	
 public mobile(){
	this.mobileOwnerName ="S.M.Rasel";
	this.mobileNumber = "017196***";
	this.mobileBalance = 54.76;
	this.mobileOSName = "Samsung A71";
	this.lock= false;
 }
	
	public mobile( String mobileOwnerName,String mobileNumber,double mobileBalance,String mobileOSName,boolean lock)
	{ 
	this. mobileOwnerName = mobileOwnerName;
	this.mobileNumber = mobileNumber;
	this.mobileBalance =mobileBalance;
	this.mobileOSName = mobileOSName;
	this.lock= lock;
	}
	
	public void showInfo()
{
	System.out.println("Owner name:  " + this.getName());
	System.out.println("Mobile Number: " + this.getNumber());
	System.out.println("Mobile Balance: " + this.getBalance());
	System.out.println("Mobile OS: " + this.getOSName());
	System.out.println("lock: " + this.getlock());
}

public void recharge(int amount)
{
	if (this.getlock() == false) {
		double total = this.getBalance();
		total = total + amount;
		this.setBalance(total);
		System.out.println("Mobile Balance after recharge: " + this.getBalance());
	}
	else {
		System.out.println("Mobile is locked");
	}
}

public void callSomeone(int timeDuration) 
{
	if (this.getlock() == false) {
		double cost = timeDuration * 1.0;
		double bal = this.getBalance();
		double newBalance = bal - cost;
		this.setBalance(newBalance);
		System.out.println("Mobile Balance after call: " + this.getBalance());
	}
	else {
		System.out.println("Mobile is locked");
	}
}

}
