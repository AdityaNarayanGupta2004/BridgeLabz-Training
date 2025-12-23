import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class DisplayTimeZone {
    public static void main(String[] args) {
        displayTime("GMT");
        displayTime("Asia/Kolkata");   // IST time
        displayTime("America/Los_Angeles"); // PST time
    }
    public static void displayTime(String zone) {
        ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(zone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println("Current time in " + zone + " : " + currentTime.format(formatter));
    }
}
