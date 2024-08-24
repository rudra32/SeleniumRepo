package Week1day2;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the desired range
        System.out.print("Enter the range for Fibonacci series: ");
        int range = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Initialize the first two Fibonacci numbers
        int first = 0, second = 1;

        // Print the first Fibonacci number
        System.out.print("Fibonacci Series: " + first);

        // Use a loop to generate the Fibonacci series within the specified range
        while (second <= range) {
            System.out.print(", " + second);

            // Calculate the next Fibonacci number
            int next = first + second;

            // Update the previous two numbers
            first = second;
            second = next;
        }
	}

}
