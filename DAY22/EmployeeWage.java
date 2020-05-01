import java.util.Scanner;
public class EmployeeWage{


	public static final double days=20.0;
	public static void main(String[] args){
		System.out.println("Welcome to the Employee Wage Computation program");
		double totalWage;
		//Declare an Employee objects
		Employee dmart=new Employee("dMart",20,8,4);
		Employee Bigmarket=new Employee("Bigmarket",30,9,5);
	

		//Declare the Array list to store employee objects
		ArrayList<Employee> companyArrays=new ArrayList<Employee>();

		companyArrays.add(dMart);
		companyArrays.add(Bigmarket);


		//declare array for storing total wages.
		ArrayList<Double> totalWages=new ArrayList<Double>();

		//declare dictionary for storing values
		Map companyWagesMap = new HashMap();

		//Attandance
		for(int i=0; i<companyArrays.size(); i++)
		{
			Employee companyEmpWage=companyArrays.get(i);
			int presence=companyEmpWage.isPresent();
                	int fullTime=companyEmpWage.isFullTime();
			switch(presence){
			case 1:
				//Check if the employee works fulltime 
				switch(fullTime){
				case 1:
					//Display the wage calculated
					totalWage=days*companyEmpWage.FtWageCalculation();
					totalWages.add(totalWage);
					companyWagesMap.put(companyEmpWage.companyName,totalWage);

				break;
				case 0:
					//Display the wage calculated
                      totalWage=days*companyEmpWage.PtWageCalculation();
					totalWages.add(totalWage);
					companyWagesMap.put(companyEmpWage.companyName,totalWage);
				break;
				}
			break;

			case 0:
				companyWagesMap.put(companyEmpWage.companyName,"Employee absent");
			break;
			}
		}

		System.out.println(companyWagesMap);

		System.out.println("Enter the company you want to query");
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		System.out.println(companyWagesMap.get(s));
	}
}

