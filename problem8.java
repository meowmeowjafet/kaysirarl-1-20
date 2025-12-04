public class problem8
{
   public static void main (String [] args) {
       int arr [] = {-3, 4, -9, 7, 2, -5, -2, 1, 6};
       System.out.println ("Here is ur arrayA:");
       for (int i = 0; i < arr.length; i++ ){
           System.out.println (arr[i]);
       }
       
       int arrB [] = arr;
       System.out.println ("Here is ur arrayB with the same values:");
       for (int i = 0; i < arrB.length; i++ ){
           System.out.println (arrB[i]);
       }
       
     
   }
}