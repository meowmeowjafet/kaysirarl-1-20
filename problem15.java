import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array [] = new int [5];
        System.out.println ("enter value: ");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
             
        }
        System.out.println ("values above 50: ");
        for (int i = 0; i < array.length; i++){
             if (array [i] > 50) {
              System.out.println (array[i]);  
            }
        }
    } 
}