public class Account
{
	
	
		private String accName;
		private String acid;
		private int balance;
		
		public Account()
		{
		}
		public Account(String accName,String acid,int balance)
		{
			this.accName=accName;
			this.acid=acid;
			this.balance=balance;
		}
		void deposit(int amount)
		{
			System.out.println("Deposite : "+amount);
			
		}
		void withdraw(int amount)
		{
			System.out.println("Withdraw :"+amount);
		}
		void transfer(int amount,Account receiver)
		{
			this.balance=this.balance-amount;
			receiver.balance=receiver.balance + amount;
			System.out.println("Balance "+balance);
			System.out.println("Balance "+receiver.balance);
				
		}
		
		public static void main(String[] args)
		{
			Account a1=new Account();
			Account a2=new Account("Rasel","22",6000);
			
			a1.deposit(50000);
			a1.withdraw(500);
			a1.transfer(2000,a2);		
			
		}	
	}