
public class Payroll {
	
	String name;
	String id;
	double hrRate = 0;
	double hoursWorked = 0;
	
	public Payroll(String name, String id) throws InvalidNameException, InvalidIdException{
		super();
		
		if(name != null && !name.isEmpty()){
		this.name = name;
		}
		else{
			throw new InvalidNameException();
		}
		
		if(id != null && !id.isEmpty()){
			this.id = id;
			}
			else{
				throw new InvalidIdException();
			}
	}
	
	public Payroll(){
		this.name = null;
		this.id = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getHrRate() {
		return hrRate;
	}

	public void setHrRate(double hrRate) throws InvalidHourlyPayException{
		if(hrRate >= 0 && hrRate <= 25){
		this.hrRate = hrRate;
		}
		else{
			throw new InvalidHourlyPayException();
		}
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) throws InvalidHourWorkedException{
		if(hoursWorked >= 0 && hoursWorked <= 84){
		this.hoursWorked = hoursWorked;
		}
		else{
			throw new InvalidHourWorkedException();
		}
	}
	
	public double grossPay(double hours, double rate){
		return hours * rate;
	}
	
	

}
