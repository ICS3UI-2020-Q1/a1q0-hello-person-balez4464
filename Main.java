import java.util.Scanner;
/**This program greets the user and calculates their aprox
 *
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   // Creates a Scanner used for input
   Scanner input = new Scanner(System.in);


   // delcare a variable that will sotre a name
   String username;


   //Ask user for their name
   System.out.println("Please enter your name:");
   // Initialize the users name
   username = input.nextLine();
   // Say hello to the user
   System.out.println("Hello " + username + "!");
   
   
   // declare and initialize a constant for the current year
   final int CURRENT_YEAR = 2020;
   // Ask the user for the year they were born
   System.out.println("Please enter the year you were born:");
   //birth year
   int birthYear = input.nextInt();
   

   // declare and calculate their age 
   int age = CURRENT_YEAR - birthYear;
   //Tell the user their age
   System.out.println("You are " + age + " years old");
  }

}
