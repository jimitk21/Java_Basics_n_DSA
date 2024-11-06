import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = sc.nextInt();
        boolean isPrime = true;

        if (i <= 1) {
            isPrime = false; // 0 and 1 are not prime numbers
        } else {
            for(int n = 2; n <= i / 2; n++){  // check up to i/2 for efficiency
                if(i % n == 0){
                    isPrime = false; // Found a divisor, so it's not prime
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println(i + " is a prime number.");
        } else {
            System.out.println(i + " is not a prime number.");
        }
    }
}
