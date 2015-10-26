
public class BankAccount extends NegativeStartingBalance{
	
	private double balance;
	private double interestRate;

	public BankAccount(double balance, double interestRate) throws NegativeStartingBalance, NegativeInterestRate{
		super();
		
		if(interestRate >= 0){
			this.interestRate = interestRate;
		}
		else{
			throw new NegativeInterestRate();
		}
		
		if(balance >= 0){
			this.balance = balance;
		}
		else{
			throw new NegativeStartingBalance();
		}
		
		
	}
	
	public BankAccount(){
		this.balance = 0;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getInterestRate(){
		return interestRate;
	}
	
	public void setInterestRate(double interestRate){
		this.interestRate = interestRate;
	}
	
	public void deposit(double amount){
		balance += amount;
	}
	
	public void withdrawl(double amount){
		balance -= amount;
	}
	
	
	

}
