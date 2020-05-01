public class EmployeWage{
  //constants
    private static final int IS_PART_TIME=1; 
  private static final int IS_FULL_TIME=2; 

  private int numOfCompany=0;
  private CmpnyEmpWage[] compnyEmpWageArray;

  public EmployeWage() {
    compnyEmpWageArray=new CmpnyEmpWage[5];
  }

  private void addCompnyEmpWage(String company, int empRatePerHour, int maxHoursPerMonth, int numOfWorkingDays)
  {
    // declare an array for multiple company
    compnyEmpWageArray[numOfCompany]=new CmpnyEmpWage(company,empRatePerHour,maxHoursPerMonth,numOfWorkingDays);

    numOfCompany++; 
  }
  private void computeEmpWage() {
    //calculating Total employee wage and storing it in to array
    for(int i=0;i<numOfCompany;i++) {
      int totalEmpWage=this.computeEmpWage(compnyEmpWageArray[i]);
      System.out.println("Total emp wage for company "+compnyEmpWageArray[i].company+"  is:"+totalEmpWage);

    }

  }
  private int computeEmpWage(CmpnyEmpWage cmpnyEmpWage) {
    //  initalize the value and checking condition
    int empHrs=0, totalEmpHrs=0,totalWorkingDays=0;
    while(totalEmpHrs <= cmpnyEmpWage.maxHoursPerMonth&& totalWorkingDays < cmpnyEmpWage.numOfWorkingDays) {
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


    return totalEmpHrs*cmpnyEmpWage.empRatePerHour;

  }

  public static void main(String[] args) {
    //creating object and call the object
    EmployeWage employeWage=new EmployeWage();
    employeWage.addCompnyEmpWage("Dmart", 20, 8, 28);
    employeWage.addCompnyEmpWage("Reliance", 30, 8, 28);
    employeWage.addCompnyEmpWage("BigMarket", 10, 8, 28);
    employeWage.computeEmpWage();
  }
}

public class CmpnyEmpWage {
  // declaration
  protected final String company;
  protected final int empRatePerHour; 
  protected final int maxHoursPerMonth; 
  protected final int numOfWorkingDays;


  public CmpnyEmpWage (String company, int empRatePerHour, int maxHoursPerMonth, int numOfWorkingDays) 
  {
    // calling constructor
    this.company = company;
    this.empRatePerHour = empRatePerHour;
    this.maxHoursPerMonth = maxHoursPerMonth;
    this.numOfWorkingDays = numOfWorkingDays;
  }

} 