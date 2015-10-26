
public class InvalidIdException extends Exception{
	
	public InvalidIdException(){
		super("Error: Invalid ID");
	}

	public InvalidIdException(String id){
		super("Error: Invalid ID " + id);
	}
}
