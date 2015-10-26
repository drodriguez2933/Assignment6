
public class InvalidNameException extends Exception{

	public InvalidNameException(){
		super("Error: Invalid Name");
	}
	
	public InvalidNameException(String name){
		super("Error: Invalid Name " + name);
	}
}
