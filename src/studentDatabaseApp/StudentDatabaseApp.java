package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        // To ask how many students to add
        System.out.print("Enter number of students to enroll: ");
        Scanner scan = new Scanner(System.in);
        int numberOfStudents = scan.nextInt();
        // creating an array of objects
        Student[] students = new Student[numberOfStudents];

        //create n number of new students
        for (int n = 0; n < numberOfStudents; n++){
            students[n] = new Student();     //students[n] to have access of specific student
            students[n].enroll();
            students[n].payTuition();
//            // because the showInfo() has a return type, it must be in a print statement
//            System.out.println(students[n].showInfo());
        }
        System.out.println();

        /**
         * the for loop below prints the list of every student
         * and their details just at the end of registering all of them
         */
        for (int n = 0; n < numberOfStudents; n++){
            System.out.println(students[n].showInfo());
        }
    }
}
