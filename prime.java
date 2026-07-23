import java.math.BigInteger;
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check: ");
        String input = scanner.next();
        
        // Convert the input string into a BigInteger object
        BigInteger number = new BigInteger(input);
        
        // Use the built-in function to check if it's prime
        // Passing 100 ensures a 99.9999% accuracy rate
        boolean isPrime = number.isProbablePrime(100);
        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is a composite number.");
        }
        
        scanner.close();
    }
}

