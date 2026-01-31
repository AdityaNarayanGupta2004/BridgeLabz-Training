package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Movie{
	private String movieName;
	private double rating;
	private int releaseYear;
	
	Movie(String movieName,double rating,int releaseYear){
		this.movieName = movieName;
		this.rating = rating;
		this.releaseYear = releaseYear;
	}
	
	public String getmovieName() {
		return movieName;
	}
	
	public Double getrating() {
		return rating;
	}
	
	public int getreleaseYear() {
		return releaseYear;
	}
	
	@Override
    public String toString() {
        return movieName + " | Rating: " + rating + " | Year: " + releaseYear;
    }
}


public class Top5TrendingMovies {
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(
				new Movie("Border2", 9.4, 2026),
				new Movie("Laapataa Ladies", 8.5, 2024),
				new Movie("Chandu Champion", 8.2, 2025),  
				new Movie("Dune: Part Two", 7.6, 2022),
				new Movie("RajaSahab", 8.6, 2025),  
				new Movie("Singham", 8.8, 2024),
				new Movie("Kantara", 9.2, 2025),  
				new Movie("AirLift", 8.1, 2024)
				);
		List<Movie> top5 = movies.stream()
				.filter(m -> m.getreleaseYear() >= 2024)
				.sorted((m1, m2) -> {
					if(Double.compare(m2.getrating(), m1.getrating()) != 0) {
						return Double.compare(m2.getrating(), m1.getrating());
					}
					return Integer.compare(m2.getreleaseYear(), m1.getreleaseYear());
				})
				.limit(5)
				.collect(Collectors.toList());
				
				System.out.println("Top 5 trending movies are");
				top5.forEach(System.out::println);
				
	}
}
