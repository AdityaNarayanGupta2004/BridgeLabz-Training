package lamda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    public Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFiltering {
	public static void main(String[] args) {
		 List<Alert> alerts = new ArrayList<>();
	     alerts.add(new Alert("Medication", "Patient A needs medication"));
	     alerts.add(new Alert("Vitals", "Patient B has abnormal vitals"));
         alerts.add(new Alert("Appointment", "Patient C has appointment tomorrow"));
	     alerts.add(new Alert("Emergency", "Patient D requires immediate attention"));
	     Predicate<Alert> userPreference = alert -> 
	     alert.type.equalsIgnoreCase("Medication") || alert.type.equalsIgnoreCase("Emergency");
	     List<Alert> filteredAlerts = new ArrayList<>();
	     for(Alert alert : alerts){
	         if(userPreference.test(alert)){
              filteredAlerts.add(alert);
	         }
	     }
	     System.out.println("Filtered Alerts based on user preference:");
	     for(Alert alert : filteredAlerts){
	         System.out.println(alert);
	     }
	}
}
