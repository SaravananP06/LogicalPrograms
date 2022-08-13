
/*
Program for measuring the time that elapses between the start and end clicks
 */

public class Stopwatch {
    public static void main(String[] args) {
        /*
        The code being measured starts
        */
        long startTime = System.nanoTime();
        /*
        The code being measured ends
         */
        long endTime = System.nanoTime();
        /*
         get the difference between the two nano time valuess
         */
        long timeElapsed = endTime - startTime;

        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
    }
}
