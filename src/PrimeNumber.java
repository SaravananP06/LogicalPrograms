import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to prime number Program");

        System.out.println("Enter the number to check for prime : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int flag = 0;

        //logic to mete out the check for prime number on the given input
        for (int i = 2; i < number/2; i++)
        {

            if (number % i == 0)
            {
                System.out.println(number + " is not a prime number");
                flag = 1;
                break;
            }
        }

        if (flag==0)
        {
            System.out.println(number+ " is a prime number");
        }

    }
}
