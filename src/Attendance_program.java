import java.util.Scanner;

public class Attendance_program {
    public static void main(String[] args) {
//        if present += 1
//        else -= 1

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total no.of Student in class");
        int total_student = sc.nextInt();

        int present = 0;
        int absent = 0;

        for(int i=0; i< total_student; i++){
            System.out.println("Student Roll.no: " + (i+1) + " is Present ? 1: 0");
            int value = sc.nextInt();
            if(value == 1) {
                present += 1;
            }else {
                absent += 1;
            }
        }

        System.out.println("Present student: " + present + " Absent Student: " + absent);
        System.out.println("Percentage of student present: " + ((present/total_student) * 100));

        boolean x = true;
        if(x = false) {
            System.out.println("Hi");
        }
        if(x == true) {
            System.out.println("Hello");
        }
    }
}
