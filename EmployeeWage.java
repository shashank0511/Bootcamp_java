public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to the Employee wage computation");
		
	System.out.println("Welcome to the Employee wage computation");
		  int IS_PART_TIME=1;
		int IS_FULL_TIME=2;
		int MAX_HRS_IN_MONTH=10; 
		int EMP_RATE_PER_HR=20; 
		int NUM_WORKING_DAYS=20;
		int totalEmpHr=0; 
		int totalWorkingDays=0;

		while(totalEmpHr <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS)
		{
			totalWorkingDays++; 
			int attendance=(int)(Math.random()*3); 
			int empHrs=0;
			switch(attendance) 
			{ case 1:
				empHrs=8; 
				break; 
			case 2:
				empHrs=4;
				break;
			default:
				empHrs=0;
				break; 
			} 
			totalEmpHr=(totalEmpHr+empHrs); 
		} 
		int totalSalary=(totalEmpHr*EMP_RATE_PER_HR);
		System.out.println("Salary Of Employee= "+totalSalary );

     }
}

