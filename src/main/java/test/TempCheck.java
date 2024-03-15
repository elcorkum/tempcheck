package test;
import java.util.Scanner;



public class TempCheck {
    public static void getUserName () {
        Scanner stringScanner = new Scanner(System.in);

        do {
            System.out.println("Please enter valid username: ");
            String name = stringScanner.nextLine();
            if (name.equalsIgnoreCase("Bob")) {
                System.out.println("Welcome Bob!");
                break;

            } else if (name.equalsIgnoreCase("Alice")) {
                System.out.println("Welcome Alice!");
                break;
            }

        } while (true);




    }



    public static void main(String[] args) {
//        int studentScore = (int) (Math.random() * 101);
//
//
//        char letterGrade = (studentScore >= 60) ? (studentScore >= 70) ? (studentScore >= 80) ? (studentScore >= 90) ? 'A' : 'B' : 'C' : 'D' : 'F';
//
//        System.out.println("Your score is " + studentScore);
//        System.out.println("You got " + letterGrade);

//        if (studentScore >= 90) {
//            letterGrade = 'A';
//            System.out.println("You got an " + letterGrade);
//        } else if (studentScore >= 80) {
//            letterGrade = 'B';
//            System.out.println("You got a " + letterGrade);
//        } else if (studentScore >= 70) {
//            letterGrade = 'C';
//            System.out.println("You got a " + letterGrade);
//        } else if (studentScore >= 60) {
//            letterGrade = 'D';
//            System.out.println("You got a " + letterGrade);
//        } else {
//            System.out.println("You got an " + letterGrade);
//        }
//    }
        getUserName();





    }
}
