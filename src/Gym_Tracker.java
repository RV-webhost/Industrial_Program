import java.util.Scanner;

public class Gym_Tracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int total_exercises = 0;
         int total_sets = 0;
         int total_reps = 0;

         while(true) {
             total_exercises ++;
             System.out.println("Enter the total no. of sets for exercise " + total_exercises);
             int sets = sc.nextInt();
             total_sets += sets;
             int curr_set = 1;
             int curr_rep = 1;
             System.out.println("Enter the total no. of reps per set: ");
             int reps = sc.nextInt();
             total_reps += reps * sets;
             while(curr_set <= sets && curr_rep <= reps) {
                 System.out.println("for curr_set " + curr_set + " curr_rep is : " + curr_rep++);
                 if(curr_rep > reps) {
                     curr_set += 1;
                     curr_rep = 1;
                 }
             }
             System.out.println("Log another exercise? (Y/N)");
             char log = sc.next().charAt(0);
             if(log == 'N') {
                 break;
             }
         }

        System.out.println("Total Exercise: " + total_exercises);
        System.out.println("Total sets: " + total_sets);
        System.out.println("Total reps: " + total_reps);

    }
}
