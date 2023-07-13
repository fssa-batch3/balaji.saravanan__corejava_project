package day05.practice;

public class AxisATM implements ATM{
	
	protected final double charge=5;
	
 
	@Override
	public boolean deposit(Account account, double amount) {
		
		double balance = account.getBalance()+amount;
		
		account.setBalance(balance);
		
		System.out.println("Axis banck deposit balance with deposit amoount "+balance);
		
		
		return true;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		
		double balance= (account.getBalance()-amount)-charge;
		
    if(balance<5000) {
	   throw new Exception("balance is very low");
   } 
    
   else {
	   System.out.println("Axis banck withdarawal"+balance);
		
	   account.setBalance(balance);
   }
    
		return true;
	}
	

	@Override
	public double getBalance(Account account) {
		
		System.out.println("your balance "+ account.getBalance());
		return account.getBalance();
		
	}
	
	

}
