package stream_buzz;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	public void RegisterCreator(CreatorStats record) {
		CreatorStats.EngagementBoard.add(record);
		System.out.println("Record Registered Successfully");
	}
	
	public Dictionary<String, Integer> GetTopPostCounts(List<CreatorStats> records, double likeThreshold){
		Dictionary<String, Integer> dic = new Hashtable<String, Integer>();
		int count = 0;
		
		for(int i = 0; i < records.size(); i++) {
			count = 0;
			for(int j = 0; j < records.get(i).WeeklyLikes.length; j++) {
				if(records.get(i).WeeklyLikes[j] >= likeThreshold) {
					count++;
				}
			}
			if(count > 0) {
				dic.put(records.get(i).creatorName, count);
			}
		}
		
		return dic;
	}
	
	public double CalculateAverageLikes() {
		double totalLikes = 0;
		int totalWeek = 0;
		for(int i =0; i < CreatorStats.EngagementBoard.size(); i++) {
			for(int j = 0; j < CreatorStats.EngagementBoard.get(i).WeeklyLikes.length; j++) {
				totalLikes += CreatorStats.EngagementBoard.get(i).WeeklyLikes[j];
				totalWeek++;
			}
		}
		if(totalWeek == 0) {
			return 0;
		}
		return totalLikes/totalWeek;
	}
	
	private static void showOptions() {
		System.out.println("\nSelect Option:");
		System.out.println("1. Register Creator");
		System.out.println("2. Show Top Posts");
		System.out.println("3. Calculate Average Likes");
		System.out.println("4. Exit");
		System.out.println("Enter your choice:");
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Program p = new Program();
		boolean status = true;
		while(status) {
			showOptions();
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("\nEnter Creator Name:\n");
				String name = sc.nextLine();
				double [] weeklyLikes = new double[4];
				System.out.println("\nEnter weekly likes (Week 1 to 4):\n");
				for(int i=0;i<weeklyLikes.length;i++) {
					weeklyLikes[i]=sc.nextDouble();
					System.out.println();
				}
				
				CreatorStats.EngagementBoard.add(new CreatorStats(name, weeklyLikes));
				System.out.println("Creator registered successfully");
				break;
			case 2:
				System.out.println("\nEnter like threshold:\n");
				double threshold = sc.nextDouble();
				Dictionary<String , Integer> d = p.GetTopPostCounts(CreatorStats.EngagementBoard,threshold);
				if(d.size()<=0)System.out.println(
						"\nNo top-performing posts this week."
						);
				else {
					Enumeration<String> keys = d.keys();

					while (keys.hasMoreElements()) {
					    String key = keys.nextElement();
					    System.out.println(key + " - " + d.get(key));
					}

				}
				
				break;
			case 3:
				System.out.println("Overall average weekly likes:"+p.CalculateAverageLikes());
				break;
				
			case 4:
				System.out.println("Logging off ----- Keep Creating with StreamBuzz!");
				status = false;
				

			default:
				break;
			}
		}
		
		
	}
}
