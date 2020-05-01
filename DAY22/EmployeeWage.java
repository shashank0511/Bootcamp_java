public interface IComputeEmpWage {
  public void addCompanyEmpWage(String company, int empRatePerHour, int numofWorkingDays, int maxHoursPerMonth);
  public void computeEmpWage();
  public int getTotalWage(String company);
}
public class CompanyEmpWage {
  public final String company;
  public final int empRatePerHour;
  public final int numofWorkingDays;
  public final int maxHoursPerMonth;
  public int totalEmpWage;

  public CompanyEmpWage(String company, int empRatePerHour, int numofWorkingDays, int maxHoursPerMonth){
    //constructor calling
    this.company = company;
    this.empRatePerHour = empRatePerHour;
      this.maxHoursPerMonth = maxHoursPerMonth;
      this.numOfWorkingDays = numOfWorkingDays;
  }

  public void setTotalEmpWage(int totalEmpWage) {
    // set total employee wage
    this.totalEmpWage = totalEmpWage;
  }
  @Override
  //override tostring method
  public String toString() {
    return "Total Emp Wage for Company: " +company+ "is: "+ totalEmpWage;
  }
}
  public class EmpWageBuilder implements IComputeEmpWage{
    public static final int IS_PART_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private int numOfCompany = 0;
    private LinkedList<computeEmpWage> CompanyEmpWageList;
    private Map<String,CompanyEmpWage> companyToEmpWageMap;

    public EmpWageBuilder{} {
      CompanyEmpWageList  = new LinkedList<>();
      CompanyToEmpWageMap =new HashMap<>();
    }

    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
      CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
      companyEmpWageList.add(companyEmpWage);
      companyToEmpWageMap.put(company, companyEmpWage);
    }

    public void computeEmpWage() {
      for (int i = 0; i < CompanyEmpWageList.size(); i++) {
        CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
        CompanyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
        System.out.println(companyEmpWage);
      }
    }
     @Override
     public int getTotalWage(Stringcompany) {
      return companyToEmpWageMap.get(company).totalEmpWage;
     }
     public int computeEmpWage(CompanyEmpWage companyEmpWage) {...} 

      public static void main(String[]args) {
        IComputeEmpWage empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage(company: "DMART", empRatePerHour:20, numOfWorkingDays:2, maxHoursPerMonth:10);
        empWageBuilder.addCompanyEmpWage(company: "Realince", empRatePerHour:10, numOfWorkingDays:4, maxHoursPerMonth:20);
        empWageBuilder.computeEmpWage();
        System.out.println("Total Wage for Dmart compnay: " + empWageBuilder.getTotalWage(company: "Dmart"));
      } 
  }






