
	import java.util.Scanner;

	//required class
	public class MovieDriver {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        //declaring other required variables
	        String name, rating;
	        int ticketsSold;

	        //creating the "Movie" object
	        //loop to keep taking input until user inputs "n" as a choice
	        while(true){

	            //Asking user to input the name of the movie
	            System.out.println("Enter the name of a movie");
	            //taking "name" input
	            name = sc.nextLine();

	            //Asking user to input the rating of the movie
	            System.out.println("Enter the rating of the movie");
	            rating = sc.nextLine();

	            //Asking user to input the number of tickets of the movie sold
	            System.out.println("Enter the number of tickets sold of this movie");
	            ticketsSold = sc.nextInt();
	    
	            //initialising the "movie" object (declared earlier outside the while) with the values input by the user using the parameterised construtor
	            //caling "toString()" using the object "obj" and then displaying the value returned by it
	            System.out.println(obj.toString());

	            //asking the user if they want to continue
	            System.out.println("Do you want to continue? (y or n)");
	             char input = sc.next().charAt(0);
	            
	            //clearing the stray newline character ('\n') from the input buffer
	            sc.nextLine();

	            //checking if user pressed 'n' or 'N'
	            //and if so, terminating the loop using "break" statement
	            if(input == 'n' || input == 'N'){
	                System.out.println("Goodbye");
	                break;
	            }
	        }
	    }
	}

