import java.util.Scanner;

public class NaturalNumberSum {

  // method to find sum of N natural numbers
  public static int naturalNumberSum(int number){

     int i = 1; // iterator variable
     // variable to store sum value
     int sum = 0;

     // loop to repeat the process
     while (i<=number) {

        // add into sum value
        sum = sum + i;
        // increase iterator variable
        i++;
     }

     // return sum value
     return sum;
  }

  public static void main(String[] args) {

     // declare variables
     int number = 0;
     int sum = 0;

     // create Scanner class object
     Scanner scan = new Scanner(System.in);

     // read input
     System.out.print("Enter N value:: ");
     number = scan.nextInt();

     // Calculate the sum value
     sum = naturalNumberSum(number);

     // display result
     System.out.println("Sum = "+sum);

     // close Scanner class objects
     scan.close();
  }
}