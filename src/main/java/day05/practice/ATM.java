package day05.practice;

class Account  {
	
	String accNo;
	double balance;
	
	public String getAccNo() {
		
		return accNo;
	}   
	public void setAccNo(String accNo) {
		
		this.accNo = accNo;
	}
	public double getBalance() {
		
		return balance;
	}
	public void setBalance(double balance) {
		
		this.balance = balance;
		
	}
	
	public Account(String accNo, double balance) {
		
		this.accNo=accNo;
		
		this.balance=balance;
	}
	
}


//Create an implementation of the below Interface
public interface ATM {
	
    boolean deposit(Account account, double amount);
    
    boolean withdraw(Account account,double amount) throws Exception;
    
    double getBalance(Account account);
}
