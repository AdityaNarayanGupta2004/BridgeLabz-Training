package employeewage;

import java.util.ArrayList;
import java.util.List;

public class CompanyEmpWage {
	String company;
    int WagePerHour;
    int WorkingDayperMonth;
    int maxhourinMonth;
    int totalwage;
    
    List<Integer> dailyWageList;
    
	public CompanyEmpWage(String company, int wagePerHour, int workingDayperMonth, int maxhourinMonth) {
		this.company = company;
		WagePerHour = wagePerHour;
		WorkingDayperMonth = workingDayperMonth;
		this.maxhourinMonth = maxhourinMonth;
		this.dailyWageList = new ArrayList<>();
	}
	
	public int getTotalwage() {
		return totalwage;
	}
	public void setTotalwage(int totalwage) {
		this.totalwage = totalwage;
	}	
}
