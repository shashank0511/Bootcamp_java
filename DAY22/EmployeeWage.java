public class EmployeWage{
public static void main(String[] args) 
    {
     System.out.println("Welcome to the Employee wage computation program " );    	
       // decleartion
		
	    int isPartTime=1; 
		int isFullTime=2; 
		int empRatePerHr=20;
		int totalSalary=0;
		int empHrs=0;
		int numWorkingDays=20; 
		// checking the condition of working day of employee
		for(int day=1; day<=numWorkingDays;day++) 
		{
			// check attandance
			int attendance=(int)(Math.random()*3); 
			int salary=0;
			switch(attendance) 
			{
			case 1:
				empHrs=8; 
				break; 
			case 2:
				empHrs=4;
				break;
			default:
				empHrs=0;
				break;
			}
			//calculating salary of an employee for this month
			salary=empHrs*empRatePerHr ; totalSalary=(totalSalary+salary ); }
		System.out.println("Salary Of Employee= "+totalSalary );
     }
}