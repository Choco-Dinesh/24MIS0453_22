import java.math.BigInteger;
import java.util.Random;

public class RandomPrimeChecker {
    public static void main(String[] args) {
        // Built-in utility to generate random numbers
        Random random = new Random();
        
        // Generate a random positive integer between 1 and 1000
        int randomNumber = random.nextInt(1000) + 1;
        
        // Convert to BigInteger to use the built-in prime check function
        BigInteger number = BigInteger.valueOf(randomNumber);
        
        // Check if the random number is prime (100 certainty = 99.9999% accurate)
        boolean isPrime = number.isProbablePrime(100);
        
        // Output the result
        System.out.println("Generated Random Number: " + number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is a composite number.");
        }
    }
}
