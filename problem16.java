import java.util.Scanner;

class problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("enter a number: ");
        int number = sc.nextInt();
        
        String numberString = String.valueOf(number);
        int[] array = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
               array[i] = Character.getNumericValue(numberString.charAt(i));
            }
        
        System.out.println ("entered number has " + array.length + " digits");
    }
}