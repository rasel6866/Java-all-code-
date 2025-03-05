public class Account
///public class Start
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public Account()
	{
		System.out.println("Empty Account");
	}
	public Account(int accountNumber, String accountHolderName, double balance)
	{
		System.out.println("Para Account");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public int getAccountNumber(){return accountNumber;}
	public String getAccountHolderName(){return accountHolderName;}
	public double getBalance(){return balance;}
	
	public void showDetails()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Balance: "+balance);
	}
    public class Start
{
	public static void main(String args[])
	{
		Account a1 = new Account();
		a1.setAccountNumber(11111111);
		a1.setAccountHolderName("OOP1 G");
		a1.setBalance(4000.0);
		
		System.out.println("Account Number: "+a1.getAccountNumber());
		System.out.println("Account Holder Name: "+a1.getAccountHolderName());
		System.out.println("Balance: "+a1.getBalance());
		
		Account a2 = new Account(22222222, "OOP1 C", 3500.0);
		a2.showDetails();
		
	}
}
} 