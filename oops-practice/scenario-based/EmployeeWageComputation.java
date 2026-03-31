import java.util.*;
public class EmployeeWageComputation {
    String EmpName;
    public Random random = new Random();
    private static final int isAbsent = 0;
    private static final int fulltime = 1;
    private static final int parttime = 2;

    private static final int WagePerHour = 20;
    private static final int FullDayHour = 8;
    private static final int partTimehour = 8;
    private static final int WorkingDayperMonth = 20;
    private static final int maxhourinMonth = 100;
    private static final int maxdayinMonth = 20;

    public boolean isEmployeePresent(){
        int att  = random.nextInt(2);
        return att == 1;
    }

    public int getWorkingHour(){
        int emptype = random.nextInt(3);
        int hrs;
        switch (emptype){
            case fulltime:
                hrs = FullDayHour;
                break;
            case parttime:
                hrs = partTimehour;
                break;
            default:
                hrs = 0;
        }
        return hrs;
    }
    public int CalculateDailyWage(){
        int emphrs = getWorkingHour();
        return emphrs*WagePerHour;
    }

    public int calculateWageperMonth(){
        int totalwage = 0;
        for(int i = 0; i < WorkingDayperMonth; i++){
            int dailywage = CalculateDailyWage();
            totalwage += dailywage;
        }
        return totalwage;
    }
    public int calculatewageWithlimits(){
        int hrs = 0;
        int workkdays = 0;
        int totalwage = 0;
        while (hrs < maxhourinMonth && workkdays < maxdayinMonth) {
            workkdays++;

            int empType = random.nextInt(3); // 0,1,2
            int empHrs;

            switch (empType) {
                case fulltime:
                    empHrs = FullDayHour;
                    break;
                case parttime:
                    empHrs = partTimehour;
                    break;
                default:
                    empHrs = 0;
            }

            hrs += empHrs;
            int dailyWage = empHrs * WagePerHour;
            totalwage += dailyWage;
        }
        return totalwage;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println("Enter the name of the employee of which you want the details");
        String Empname = sc.nextLine();

        EmployeeWageComputation wage = new EmployeeWageComputation();
        boolean present = wage.isEmployeePresent();
        if(present){
            System.out.println(Empname +" -> Employee  is present");
        }else{
            System.out.println(Empname+ " -> Employee is Absent");
            return;
        }
        int dailyWage = wage.CalculateDailyWage();
        System.out.println("Daily Employee Wage: " + dailyWage);
        int monthlyWageFixed = wage.calculatewageWithlimits();
        System.out.println("Monthly Employee Wage for " + WorkingDayperMonth + " days: " + monthlyWageFixed);

        int monthlyWageWithLimit = wage.calculatewageWithlimits();
        System.out.println("Monthly Wage with 100 hours or 20 days limit is: " + monthlyWageWithLimit);
    }
}
