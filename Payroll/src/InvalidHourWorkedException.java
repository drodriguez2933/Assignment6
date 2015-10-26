
public class InvalidHourWorkedException extends Exception{
	
	public InvalidHourWorkedException(){
		super("Error: Invalid Hours Worked");
	}
	
	public InvalidHourWorkedException(int hr){
		super("Error: Invalid Hours Worked " + hr);
	}

}
