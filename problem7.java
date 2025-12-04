

public class problem7
{
   public static void main (String [] args) {
       int arr [] = {-3, 4, -9, 7, 2, -5, -2, 1, 6};
       System.out.println ("Here r the negative numbers in ur array:");
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] < 0) {
               
               System.out.println (arr[i]);
               System.out.println ("converted to positive:" + (arr[i]*(-1)));
           }
       }
   }
}