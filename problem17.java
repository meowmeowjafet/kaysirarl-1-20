public class problem17 {
    public static void main(String[] args) {
        int[] numbers = {12, 90, 27, -3, 18, 9, 42, -7, 15};
        int max;
        int second;
        
        if (numbers[0] > numbers [1]) {
            max = numbers[0];
            second = numbers[1];
        } else {
            max = numbers[1];
            second = numbers[0];
        }
        
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > max) {
                second = max;
                max = numbers[i];
            } else if (numbers[i] > second && numbers[i] != max) {
                second = numbers[i];
            }
        }
        System.out.println("Largest number: " + max);
        System.out.println("Second largest number: " + second);
    }
}