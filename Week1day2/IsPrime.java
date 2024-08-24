package Week1day2;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

     // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Assume the number is prime
        boolean isPrime = true;

        // Iterate from 2 to n-1
        for (int i = 2; i < n; i++) {
            // Check if i divides n
            if (n % i == 0) {
                isPrime = false; // n is not prime if i divides n
                break;
            }
        }

        // Check the result and print whether n is prime or not
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
		
	}

}
