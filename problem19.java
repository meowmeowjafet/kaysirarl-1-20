import java.util.Scanner;
class problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] students = {"andrea", "anna", "michael", "chad", "lorena"};
        int[] grades = {89, 91, 79, 86, 95};
        
        System.out.println ("enter name of student: ");
        String name = sc.nextLine ();
        
        for (int i = 0; i < students.length; i++){
            
                if (name.equalsIgnoreCase (students[i])){
                    System.out.println (name + ": "+ grades [i]);
                    return;
                } 
        }
        System.out.println(name + " not found");
    }
}    