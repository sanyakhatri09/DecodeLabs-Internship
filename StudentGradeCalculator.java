import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int subjects;
        int totalMarks = 0;
        double percentage;
        String grade;

        System.out.println(" Student Grade Calculator ");

        System.out.print("Enter number of subjects: ");
        subjects = input.nextInt();

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks of Subject " + i + " (out of 100): ");
            int marks = input.nextInt();
            totalMarks += marks;
        }

        percentage = (double) totalMarks / subjects;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("\n Result ");
        System.out.println("Total Marks : " + totalMarks);
        System.out.printf("Percentage  : %.2f%%\n", percentage);
        System.out.println("Grade       : " + grade);

        input.close();
    }
}