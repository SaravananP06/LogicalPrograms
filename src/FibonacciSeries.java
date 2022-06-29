import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci Series Program");

        // initializing variables
        int n1 = 0, n2 = 1, n3 , i;
        // taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();

        System.out.println(n1+ " " + n2);

        for (i=2; i<num; i++){
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
