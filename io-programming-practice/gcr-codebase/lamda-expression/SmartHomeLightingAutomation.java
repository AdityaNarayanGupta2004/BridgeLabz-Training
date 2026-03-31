package lamda_expression;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SmartLight{
	String name;
	public SmartLight(String name) {
        this.name = name;
    }

    interface LightBehavior {
        void execute();
    }

    public void performAction(LightBehavior behavior) {
        behavior.execute();
    }
}

public class SmartHomeLightingAutomation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SmartLight livingRoomLight = new SmartLight("Living Room");
        SmartLight bedroomLight = new SmartLight("Bedroom");
        Map<String, SmartLight.LightBehavior> triggers = new HashMap<>();

        triggers.put("motion", () -> System.out.println("Lights turn ON at full brightness due to motion"));
        triggers.put("night", () -> System.out.println("Lights dim to 20% for night time"));
        triggers.put("voice_on", () -> System.out.println("Lights turn ON via voice command"));
        triggers.put("voice_off", () -> System.out.println("Lights turn OFF via voice command"));
        
        System.out.println("Enter the Trigger you want: motion, night, voice_on, voice_off");
        
        String currentTrigger = sc.next(); 
        System.out.println("Living Room Light:");
        livingRoomLight.performAction(triggers.get(currentTrigger));

        currentTrigger = "night";
        System.out.println("Bedroom Light:");
        bedroomLight.performAction(triggers.get(currentTrigger));
	}
}
