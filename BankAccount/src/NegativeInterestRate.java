
public class NegativeInterestRate extends Exception{
	
	public NegativeInterestRate()
	   {
	      super("Error: Negative Interest Rate");
	   }
	
	public NegativeInterestRate(double interestRate)
	   {
	      super("Error: Negative starting balance: " +
	            interestRate);
	   }

}
