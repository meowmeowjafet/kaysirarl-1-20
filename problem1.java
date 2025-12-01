

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number;
        
        System.out.print("Enter a number between 1 and 100: ");
        number = scanner.nextFloat();
        
        while (number < 1 || number > 100) {
            System.out.print("Invalid input. Please enter a number between 1 and 100: ");
            number = scanner.nextFloat();
        }
        
        System.out.println("Thank you! You entered: " + number);
        scanner.close();
    }
}