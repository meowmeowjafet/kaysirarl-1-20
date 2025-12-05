public class problem11 {
    public static void main (String[]args) {
        int array [] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        for (int i = 1; i < array.length; i++){
            if (i % 2 == 0){
                System.out.println (i);
            }
        }
    }
}