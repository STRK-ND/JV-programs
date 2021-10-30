import java.util.Scanner;

public class bmi {

    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.println("Enter next person's infomation:");
        System.out.print("height (in inches)? ");
        double height = console.nextDouble();

        System.out.print("weight (in pounds)? ");
        double weight = console.nextDouble();
        System.out.println();

        double bmi = weight / Math.pow(height, 2) * 703;
        System.out.println("BMI:"+bmi);

        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi < 25) {
            System.out.print("nornal");
        } else if (bmi < 30) {
            System.out.print("overweight");
        } else {
            System.out.print("obese");
        }
    }

}
