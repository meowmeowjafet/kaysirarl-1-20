
import java.util.Scanner;
                          
public class problem9
{
   public static void main (String [] args) {
     
       int sum = 0;
       int count = 0;
       
       for (int i = 0; i >=  0; i++ ){
           Scanner scanner = new Scanner (System.in);
           System.out.println ("enter number to add(enter [0] to view sum):");
           int array = scanner.nextInt();
           sum += array;
           count++;
           if (array == 0) {
               System.out.println (sum);
               break;
           }
           
       }
     
   }
}