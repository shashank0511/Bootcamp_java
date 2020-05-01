public class EmployeWage{
	System.out.println("Welcome to the Employee Wage Computation program");
	//decleartion 
   private static final int IS_PART_TIME=1; 
   private static final int IS_FULL_TIME=2; 
   private static final int MAX_HRS_IN_MONTH=10; 
   private static final int EMP_RATE_PER_HR=20; 
   private  static final int NUM_WORKING_DAYS=20;
	/*
	Method for calculating monthly wage of employee based on part time/ full time and 
	calculates salary according to the attendance of the employee as per
	company name, maximum woking days, wage per hour, maximum hours
	*/
	public static int caclEmpWageForCompany(String company,int empRate,int numOfDays,int maxHrs) {
		int empHrs=0, totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs <= maxHrs && totalWorkingDays < numOfDays) {
			 totalWorkingDays++; 
			 int attendance=(int)(Math.random()*3); 
			 switch(attendance) 
			 { case IS_FULL_TIME:empHrs=8;
			 break; 
			 case IS_PART_TIME:empHrs=4;
			 break;
			 default:empHrs=0; 
			 break; 
			 } 
			 totalEmpHrs=(totalEmpHrs+empHrs); 
			 System.out.println("Days= "+ totalWorkingDays+ " Emp Hr: "+empHrs);
		}
			 int totalEmpWage=(totalEmpHrs*empRate);
			  System.out.println("Total Emp Wage for Company "+company+" is ="+totalEmpWage );
			 
		return totalEmpWage;
		
	}
public static void main(String[] args) 
    {
    	//calculating monthly wage of employee of dmart
	   int totalWage=caclEmpWageForCompany("dmart",20,2,10);    
     }
}
