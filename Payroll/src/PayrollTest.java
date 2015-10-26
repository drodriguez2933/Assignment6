
public class PayrollTest {
	
	public static void main(String Args[]){
		try{
		Payroll a = new Payroll("Danny", "123456789");
		a.setHoursWorked(84);
		a.setHrRate(25);
		System.out.println("             Employee             ");
		System.out.println("----------------------------------");
		System.out.println("Employee name: " + a.getName());
		System.out.println("ID number: " +a.getId());
		System.out.println("----------------------------------");
		System.out.println("Hours worked: " + a.getHoursWorked());
		System.out.println("Hourly Rate is: " + a.getHrRate());
		System.out.println("----------------------------------");
		System.out.println("Gross Pay: " + a.grossPay(a.getHoursWorked(), a.getHrRate()));
		System.out.println("----------------------------------");
		}
		catch(InvalidNameException | InvalidIdException | InvalidHourWorkedException | InvalidHourlyPayException e){
			System.out.println(e.getMessage());
		}
	}

}