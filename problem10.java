import java.util.Scanner;
                          
public class problem10
{
   public static void main (String [] args) {
     
      int array [] = {3, 7, 8, 5, 4, 2, 0, 10};
      for (int i = 0; i < array.length; i++) {
          if (array[i] % 2 == 0) {
              System.out.println ("first even number: " + array[i]);
              System.out.println ("The index: " + i);
              break;
          }
      }
     
   }
}