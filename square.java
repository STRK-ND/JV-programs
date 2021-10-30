import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        int num, square;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number to calculate square=");
        num = keyboard.nextInt();
        square = num * num;
        System.out.print("Square=" + square);
    }
}
