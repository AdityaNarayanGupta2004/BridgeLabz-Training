package Functional_Interface;
import java.util.*;
public class BackgroundJobExecution {
	public static void main(String[] args) {
		Runnable backgroundJob = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background job finished.");
        };
        Thread thread = new Thread(backgroundJob);
        thread.run();

        System.out.println("Main thread continues execution...");
	}
}
