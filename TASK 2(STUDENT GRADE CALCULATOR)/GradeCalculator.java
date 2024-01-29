import java.util.Scanner;

public class GradeCalculator {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking input from user for number of subjects and marks per subjects.
        System.out.println("Enter the number of subjects:");
        int numberOfSubjects = sc.nextInt();

        int totalMarks = 0;
        
        for (int i = 1; i <= numberOfSubjects; i++) {
            
            System.out.println("Enter the marks obtained in subject " + i + " (out of 100):");
            int marksObtained = sc.nextInt();
            
            totalMarks += marksObtained;
        }

        //Calculating the grade based on percentage.
        double averagePercentage = (double) totalMarks / (numberOfSubjects * 100) * 100;
        
        String grade = "";
        
        if (averagePercentage >= 95) {
            grade = "A+";
        } else if (averagePercentage >= 90) {
            grade = "A";
        }else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks);
        
        System.out.println("Average Percentage: " + averagePercentage + "%");
        
        System.out.println("Grade: " + grade);

            sc.close();
    }
}