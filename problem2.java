


public class problem2 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 7, 9, 7, 1, 4, 7, 8};
        int count = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 7) {
                count++;
            }
        }
        
        System.out.println("The number 7 appears " + count + " times.");
    }
}