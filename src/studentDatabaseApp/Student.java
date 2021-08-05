package studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String  studentID = " ";
    private String courses = " ";
    private int tuitionBalance;
    private int costOfCourse = 600;
    private static int id = 1000;

    // constructor prompts students to enter name and year
    public Student(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = scan.nextLine().toUpperCase();

        System.out.print("Enter student last name: ");
        this.lastName = scan.nextLine().toUpperCase();

        System.out.print("1 = Freshmen\n 2 = Softmen\n 3 = Junior\n 4 = Senior\nEnter student class level: ");
        this.gradeYear = scan.nextInt();
        switch (this.gradeYear){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("INVALID GRADE");
                this.gradeYear = 0;
        }
        setStudentID();

    }

    // Generate an ID
    private void setStudentID(){
        // grade level + ID
        id++;      // increment id each time a student is created
        if(gradeYear != 0){
            this.studentID = gradeYear + "" + id;
        }
        else{
            this.studentID = "0";  //if an invalid grade level is selected, student ID is assigned 0
        }
    }

    // enroll in courses
    public void enroll(){
        // get inside a loop, user exit 0;
       do{
           System.out.print("Enter course to enroll ( Q  to Quit): ");
           Scanner scan = new Scanner(System.in);
           String course = scan.nextLine().toUpperCase();
           if(!course.equals("Q")) {
               courses = courses + "\n   " + course;
               tuitionBalance = tuitionBalance + costOfCourse;
           }
           else { break; }
       }while(1 != 0);      // infinite loop
    }

    //view balance
    public void viewBalance (){
        System.out.println("Your balance is $" + tuitionBalance);
    }

    // pay tuition
    public void payTuition() {
        //viewBalance();
        System.out.println("TOTAL COST: $" + tuitionBalance);
        System.out.print("Enter your payment: $");
        Scanner scan = new Scanner(System.in);
        int payment = scan.nextInt();
        if(payment < tuitionBalance){
            tuitionBalance = tuitionBalance - payment;
            System.out.println("Thank you for your payment of $" + payment);
        }
        else {
            tuitionBalance = 0;
            System.out.println("Thank you for your payment of $" + tuitionBalance);
        }
     //   viewBalance();
    }

    //show status
    public String showInfo (){
        return "NAME: " + firstName +" "+ lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
