
public class InvalidHourlyPayException extends Exception{
	
	public InvalidHourlyPayException(){
		super("Error: Invalid Hourly Pay");
	}
	
	public InvalidHourlyPayException(double pay){
		super("Error: Invalid Hourly Pay " + pay);
	}

}
