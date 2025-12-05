public class problem12 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2,2};
        
        // Check if value 3 appears at least 3 times
        int targetValue = 3;
        boolean result = appearsAtLeastThreeTimes(array, targetValue);
        
        for (int i = 1; i <= 9; i++) {
            boolean appears = appearsAtLeastThreeTimes(array, i);
            System.out.println("Value " + i + ": " + (appears ? "YES (≥ 3 times)" : "NO (< 3 times)"));
        }
    }
    
    public static boolean appearsAtLeastThreeTimes(int[] array, int targetValue) {
        int count = 0;
        for (int num : array) {
            if (num == targetValue) {
                count++;
                if (count >= 3) {
                    return true; // Early exit
                }
            }
        }
        return false;
    }
}