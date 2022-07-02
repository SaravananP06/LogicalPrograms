import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Reserve a Number Program");

        System.out.println("Please enter a number to reverse it");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(),reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
