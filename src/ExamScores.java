import java.util.Scanner;

public class ExamScores {
    public static void main(String[] args) {

        int A_grades = 0;
        int B_grades = 0;
        int C_grades = 0;
        int D_grades = 0;
        int F_grades = 0;
        int grade = 0;
        String again = "yes";

        Scanner grades = new Scanner(System.in);

        while (again.equalsIgnoreCase("yes")||again.equalsIgnoreCase("Y")){
            System.out.print("Enter an exam score: ");
            grade = grades.nextInt();

            if (grade <= 60) {
                System.out.println("Go back to School. Your grade is F. ");
            }
            if (grade <= 69 && grade >= 60)
                System.out.println("Bad job. Your grade is D. ");

            if (grade <= 79 && grade >= 70)
                System.out.println("Good job. Your grade is C.");

            if (grade <= 89 && grade >= 80)
                System.out.println("Good job. Your grade is B.");

            if (grade <= 100 && grade >= 90)
                System.out.println("Good job. Your grade is A.");

            System.out.println( "Do you want to enter another score (Y/N): ");
            again = grades.next();

            }
        }
    }




