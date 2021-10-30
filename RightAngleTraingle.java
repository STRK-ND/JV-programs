import java.util.Scanner;

public class RightAngleTraingle {

   public static void main(String[] args) {

       // declare variables
       double height = 0.0;
       double base = 0.0;
       double area = 0.0;

       // create Scanner class object
       Scanner scan = new Scanner(System.in);

       // read input
       System.out.print("Enter height of the triangle:: ");
       height = scan.nextDouble();
       System.out.print("Enter base of the triangle:: ");
       base = scan.nextDouble();

       // calculate area
       area = (0.5) * (base * height);

       // display result
       System.out.println("Area = "+ area);

       // close Scanner class object
       scan.close();

    }
 }