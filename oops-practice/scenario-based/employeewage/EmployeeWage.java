package junit.demo.employeewage;

import java.util.*;

public class EmployeeWage implements EmpWageBuilder {

    // UC1
    private static final int isAbsent = 0;

    // UC2
    private static final int fulltime = 1;
    private static final int parttime = 2;

    // UC3
    private static final int FullDayHour = 8;
    private static final int partTimehour = 4;

    // UC10
    private List<CompanyEmpWage> companyList;
    private Map<String, CompanyEmpWage> compMap;

    private Random random = new Random();

    public EmployeeWage() {
        companyList = new ArrayList<>();
        compMap = new HashMap<>();
    }

    // UC8
    public void addCompanyEmpWage(String company,int WagePerHour,int WorkingDayperMonth, int maxhourinMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, WagePerHour,WorkingDayperMonth,maxhourinMonth);
        companyList.add(companyEmpWage);
        compMap.put(company, companyEmpWage);
    }

    // UC4
    private int getWorkingHour() {
        int emptype = random.nextInt(3);
        switch (emptype) {
            case fulltime:
                return FullDayHour;
            case parttime:
                return partTimehour;
            default:
                return 0;
        }
    }

    // UC5 and UC6
    private void computeEmpWage(CompanyEmpWage companyEmpWage) {
        int hrs = 0;
        int workkdays = 0;
        companyEmpWage.dailyWageList.clear();
        while (hrs < companyEmpWage.maxhourinMonth && workkdays < companyEmpWage.WorkingDayperMonth) {
            workkdays++;

            int empHrs = getWorkingHour();
            if (hrs + empHrs > companyEmpWage.maxhourinMonth) {
                empHrs = companyEmpWage.maxhourinMonth - hrs;
            }
            hrs += empHrs;
            int dailyWage = empHrs * companyEmpWage.WagePerHour;
            companyEmpWage.dailyWageList.add(dailyWage);
        }

        int totalwage = companyEmpWage.dailyWageList
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

        companyEmpWage.setTotalwage(totalwage);

        System.out.println("Total Wage for Company: "
                + companyEmpWage.company + " = " + totalwage);
    }

    // UC14
    public void computeEmpWage() {
        companyList.forEach(this::computeEmpWage);
    }

    // UC13
    public int getTotalWage(String company) {
        CompanyEmpWage companyEmpWage = compMap.get(company);
        if (companyEmpWage != null)
            return companyEmpWage.getTotalwage();
        return 0;
    }
}
