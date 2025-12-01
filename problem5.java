
import java.util.Scanner;
class problem5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println ("Enter specific value to stop: ");
    int specificval = scanner.nextInt();
    boolean ewanko = true;
    
    int numbers [] = {9, 8, 7, 2, 3, 6, 5, 0, 2};
    for (int find = 0; find < numbers.length; find++ ) {
        if (numbers[find] != specificval) {
            System.out.println (numbers[find]);
            
        } else if (numbers[find] == specificval){
            break;
        }
    }
    
    
}
    
}