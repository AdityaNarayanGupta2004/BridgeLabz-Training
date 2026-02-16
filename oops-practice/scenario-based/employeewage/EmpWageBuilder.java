package employeewage;

public interface EmpWageBuilder {
	void addCompanyEmpWage(String company, int WagePerHour,int WorkingDayperMonth, int maxhourinMonth);
	void computeEmpWage();
	int getTotalWage(String company);
}
