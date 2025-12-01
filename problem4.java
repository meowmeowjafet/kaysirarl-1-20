
public class problem4 {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 27, -3, 18, 9, 42, -7, 15};
        
        // Initialize min and max with first element
        int min = numbers[0];
        int max = numbers[0];
        
        // Single loop to find both min and max
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}