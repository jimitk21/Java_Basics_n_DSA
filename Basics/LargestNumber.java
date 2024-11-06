import java.util.*;

public class LargestNumber {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        
        for(int i = 0; i < numbers.length; i++) { // Iterate until i < numbers.length
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int[] numbers = {1, 2, 3, 4, 5, 6}; // Define the array correctly
        System.out.println(getLargest(numbers));
    }
}
