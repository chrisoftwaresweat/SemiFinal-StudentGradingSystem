import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*
        ask user how many student/s instead of hardcoding it like:
        int numberOfStudents = 3;
         */
        System.out.print("Number of students: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); //newline fix

        String[] studentName = new String[quantity];
        double[] englishGrade = new double[quantity];
        double[] mathGrade = new double[quantity];
        double[] scienceGrade = new double[quantity];
        double[] averageGrade = new double[quantity];

        //user input
        for (int i = 0; i<quantity; i++){
            System.out.printf("Enter the name of student %d: ", i+1);
            studentName[i] = scanner.nextLine();
            System.out.print("English grade: ");
            englishGrade[i] = scanner.nextDouble();
            System.out.print("Math grade: ");
            mathGrade[i] = scanner.nextDouble();
            System.out.print("Science grade: ");
            scienceGrade[i] = scanner.nextDouble();
            scanner.nextLine(); //newline fix

            //average grade computation
            averageGrade[i] = (englishGrade[i] + mathGrade[i] + scienceGrade[i]) / 3;
        }
        System.out.println();

        //output
        System.out.println("---Student Grades---");
        for (int i = 0; i<quantity; i++){
            System.out.printf("Student %d\n", i+1);
            System.out.printf("Name: %s\n", studentName[i]);
            System.out.printf("English: %.1f\n", englishGrade[i]);
            System.out.printf("Math: %.1f\n", mathGrade[i]);
            System.out.printf("Science: %.1f\n", scienceGrade[i]);
            System.out.printf("Average: %.2f\n\n", averageGrade[i]);
        }

        scanner.close();
    }
}