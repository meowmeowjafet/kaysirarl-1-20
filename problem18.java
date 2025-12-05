public class problem18 {
    
     public static void main (String [] args ){
        int[] numbers = {1, 2, 3, 2, 4, 4, 2, 5};
        boolean result = duplicates(numbers, 2); 
        for (int i = 1; i <= 5; i++) {
            boolean appears = duplicates(numbers, i);
            System.out.println("Value " + i +(appears ? " duplicates" : " none" ) );
            } 
    }
     public static boolean duplicates(int[] array, int targetValue) {
    int count = 0;
    for (int num : array) {
        if (num == targetValue) {
            count++;
            if (count > 1) {
                return true; 
            }
        }
    }
    return false;
}

}

