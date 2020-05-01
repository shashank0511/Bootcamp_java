public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to the Employee wage computation");
		
		int IS_PRESENT=1;
		double wagePerHour=20;
		double fullDay=8;	
		double empWage;
		double empCheck=Math.floor(Math.random() * 10 ) %2;
		

		if (empCheck==IS_PRESENT){
			System.out.println("Employee is present");
			empWage=wagePerHour*fullDay;
			System.out.println("Employee wage is: "+ empWage);
		}
		else{
			System.out.println("Employee is absent");
		}
	}
}



