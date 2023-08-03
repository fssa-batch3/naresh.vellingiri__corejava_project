package day01.solved;

/**
 * Solved Example for day 1
 * @author BharathwajSoundarara
 *
 */
class Movie {
	public String title;
	
}

public class TestBookComparison {
	public static void main(String[] args) {
		
		Movie movie1 = new Movie();
		
		movie1.title = "Harry Potter";
		
		Movie movie2 = new Movie();
		
		movie2.title = new String("Harry Potter");
		
		// Each object will be Stored in a separate memory location
		// so it will print false
		System.out.println(movie1.title == movie2.title);
		System.out.println(movie1.title.equals(movie2.title));


		
		
		
	}
}
