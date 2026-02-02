package stream_buzz;

import java.util.ArrayList;
import java.util.List;

public class CreatorStats {
	
	public String creatorName;
	public double[] WeeklyLikes= new double[4];
	
	public CreatorStats(String creatorName, double[] WeeklyLikes) {
		this.creatorName = creatorName;
		this.WeeklyLikes = WeeklyLikes;
	}
	
	public String getCreatorName() {
		return creatorName;
	}
	
	public double[] getWeeklyLikes() {
		return WeeklyLikes;
	}
	
	public static List<CreatorStats> EngagementBoard = new ArrayList<CreatorStats>();
	
}
