import java.util.ArrayList;
import java.util.Scanner;

public class MovieClass{

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String choice = "y";
		//create movie list;
		ArrayList<Movies> list = new ArrayList<Movies>();
		list.add(new Movies("Star Wars","Scifi"));
		list.add(new Movies("Harry Potter","Scifi"));
		list.add(new Movies("Secret Life Of Pets","Animated"));
		list.add(new Movies("Purge","Horror"));
		list.add(new Movies("Batman","Fantasy"));
		list.add(new Movies("Xman","Fantasy"));
		list.add(new Movies("Batman","Fantasy"));
		list.add(new Movies("Mission Impossible","Action"));
		list.add(new Movies("Saw","Horror"));
		list.add(new Movies("Scream","Horror"));
		
		System.out.println("Welcome to the Movie List Application");
		System.out.println("There are 10 movies in this list");
		//System.out.print("Your category are:" );
		
		while (choice.equalsIgnoreCase("y"))
		{
			System.out.println("What category are you interested in?");
			String name = scan1.nextLine();
			for (int i = 0; i < list.size(); i++) {
				if ((list.get(i).getCategory().equalsIgnoreCase(name))){
					System.out.println(list.get(i).getTitle());
				}
			}
			
			
			System.out.println("Continue? Y or N");
		     choice = scan1.nextLine();
			

		}//end of while
scan1.close();
	}//end of main

}
