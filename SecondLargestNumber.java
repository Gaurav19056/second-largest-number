import java.util.Arrays;
public class SecondLargestNumber {

    public static int secondLargest(int[] numbers) {
    Arrays.sort(numbers); // Array becomes [1, 3, 5, 7, 9]
    
    // Start from the end and find the first number smaller than the max
    int largest = numbers[numbers.length - 1];
    for (int i = numbers.length - 2; i >= 0; i--) {
        if (numbers[i] < largest) {
            return numbers[i];
        }
    }
    return largest; // Fallback if all numbers are the same
    }

    public static void main(String[] args) {
        System.out.println("[5, 1, 9, 3, 7] → " + secondLargest(new int[]{5, 1, 9, 3, 7}));     
        System.out.println("[2, 4] → " + secondLargest(new int[]{2, 4}));                       
        System.out.println("[10, 10, 5, 8] → " + secondLargest(new int[]{10, 10, 5, 8}));      
        System.out.println("[100, 99, 50, 1] → " + secondLargest(new int[]{100, 99, 50, 1}));  
        System.out.println("[-5, -1, -3] → " + secondLargest(new int[]{-5, -1, -3}));          
    }
}