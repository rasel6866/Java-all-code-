public class Accountt
 {
	private String accName;
	private String acid;
	private int balance;
	
	public Accountt()
		{
		System.out.println(" ");
		}
		public Accountt(String accName,String acid,int balance)
		{
		this.accName=accName;
		this.acid=acid;
		this.balance=balance;
		}
	
	public int deposit(int amount)
	{
		
	}
	public int withdraw(int amount)
	{
		
	}
	int transfer(int amount,Accountt receiver)
	{
		this.balance=this.balance-amount;
		receiver.balance=receiver.balance+amount;
		System.out.print(balance);
	}
	public static void main(String args [])
	{
		Accountt A1=new Accountt ();
		Accountt A2=new Accountt ();
        A1.transfer(50000,A1);		
		
	}
	
}