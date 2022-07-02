import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Perfect Number Program");

        //initialsing variables to use in the program
        int sum=0, number;
        String divisors = "";
        //taking in input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for perfect number: ");
        number = sc.nextInt();

        //initiating a for loop for times as inut by the user encomposing the logic
        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)    //if he number is divisible by i, then add to the sum and append that to the divisors string
            {
                sum += i;
                divisors = divisors + i + "+";
            }
        }
        divisors = divisors.substring(0,divisors.length()-1);
        System.out.println(divisors);


        System.out.println(sum);

        //To check if the number is perfect and log the output
        if (sum == number)
        {
            System.out.println("Thus , " + number + " Is A Perfect Number");
        }
        else
            System.out.println("Thus , " + number + " Is Not A Perfect Number");
    }
}
