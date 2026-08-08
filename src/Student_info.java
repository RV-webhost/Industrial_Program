import java.util.Scanner;

public class Student_info {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        String name = "Viraj Raut";
        int age = 19;
        double gpa = 9.092;

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int temp;

        System.out.println("n1: " + n1 + " " + "n2: " + n2);

        temp = n1;
        n1 = n2;
        n2 = temp;

//        without temp
//        a = a^b;
//        b = a^b;
//        a = a^b;

        System.out.println("n1: " + n1 + " " + "n2: " + n2);



        System.out.println("Student Name: " + name);
        System.out.println("Student age: "+ age);
        System.out.println("Student GPA: " + gpa);
    }
}
