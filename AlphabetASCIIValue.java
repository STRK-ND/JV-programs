import java.util.Scanner;

public class AlphabetASCIIValue {

   public static void main(String[] args) {

      // declare a char variable
      char ch ;
      // declare a int variable
      int value ;

      // create Scanner class object
      // to read input
      Scanner scan = new Scanner(System.in);

      // read alphabet
      System.out.print("Enter an alphabet:: ");
      ch = scan.next().charAt(0);

      // convert char to ascii value
      value = ch;

      // display ascii value
      System.out.println("ASCII value of "+
                     ch+" = "+value);

      // Or, 
      // we can directly display ASCII value
      // using type-casting (int)ch
      System.out.println("ASCII value of "+
                 ch+" = "+ (int)ch );

      // close Scanner class object
      scan.close();
     }
 }