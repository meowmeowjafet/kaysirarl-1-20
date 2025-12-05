public class problem13 {
    public static void main(String[] args) {
        int [] array = {75, 89, 60, 78, 90, 95, 76, 50, 65};
        int countfailed = 0;
        int countpassed = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < 75 ) {
                countfailed++;
            }
            if (array[i] >= 75) {
                countpassed++;
            }
        }
        System.out.println ("numbers of passers: " + countpassed);
    System.out.println ("numbers of retakers: " + countfailed);
    } 
}