
public class problem6
{
    public static void main (String [] args) {
        int [] arr = {3, 5, 9, 6, 7, 2, 8};
        int sum = 0;
        int count = 0;
        
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                 System.out.println (arr[i]);
                 
                 sum += arr[i];
                 count++;  
            }
        }
        
        if (count > 0) {
            float average = sum / count;
            System.out.println (average);
        }
    }
}