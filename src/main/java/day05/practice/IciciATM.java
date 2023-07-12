package day05.practice;

public class IciciATM implements ATM {
	
protected final double charge=10;
	

	@Override
	public boolean deposit(Account account, double amount) {
		
		double balance = account.getBalance()+amount;
		
		account.setBalance(balance);
		
		System.out.println("Icici banck deposit balance with deposit amoount "+balance);
		
		return true;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		
		double balance= (account.getBalance()-amount)-charge;
		
    if(balance<10000) {
	   throw new Exception("balance is very low");
   } 
    
   else {
	   account.setBalance(balance);
	   
	   System.out.println("Icici banck withrawal amount "+balance);
   }
    
		return true;
	}
	

	@Override
	public double getBalance(Account account) {
		
		System.out.println("Icici banck withrawal amount "+ account.getBalance());
		
		return account.getBalance();
	}
	
	

}
