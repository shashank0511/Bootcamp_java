public class EmployeWage{
public static void main(String[] args) 
    {
     System.out.println("Welcome to the Employee wage computation program " );    	
       // decleartion
	//decleartion
	   private static int isPartTime=1; 
	   private static int isFullTime=2; 
	   private static int empRatePerHr=20; 
	   private static int empHrs=0;
	   private static int attendance=(int)(Math.random()*3); 
	   private static int salary=0;
		//checking attandance
		switch(attendance)
		{ 
		//checking part time /full rime
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
		//calculating salary of an employee
		salary=empHrs*empRatePerHr ;

		System.out.println("Salary Of Employee= "+salary );

     }
}
  