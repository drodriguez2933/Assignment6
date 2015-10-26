
public class AccountTest {
	
	public static void main(String Args[]){
		
		try{
		BankAccount ba = new BankAccount(-100,5);
		}
		catch(NegativeStartingBalance e){
			System.out.println(e.getMessage());
		}
		catch(NegativeInterestRate e){
			System.out.println(e.getMessage());
		}
	}

}
