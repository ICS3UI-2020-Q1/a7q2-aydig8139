import java.util.Scanner;

/**
 * prints the factors of a given number on screen
 * @author Rose
 */
public class Main {

  //calculates the remainder of the integer divided by each number
  public static void factors(int integer){
    
    //declare a variable to store the remainder of the integer devided by another variable
    int rem = 0;

    //divides the given integer by every number upto the integer and stores the remainder
    for(int i = 1; i <= integer; i++){
      rem = integer % i;

      //create an if statement to check if the remainder is equal to 0 and if it is, it should print out the variable that the integer was divided by that resulted in 0
      if(rem==0){
        System.out.println(i);
      }
    }


  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user for a number
    System.out.println("Enter a positive integer to see its factors");
    int integer = input.nextInt();
    System.out.println("The factors of " + integer + " are:");

    factors(integer);
    
  }
}
