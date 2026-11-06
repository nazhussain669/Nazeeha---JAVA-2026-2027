package javaPack;

import java.util.Scanner;

public class CollectGrades {
    
    static Scanner input = new Scanner(System.in);

    public CollectGrades() {
        processGrades();
    }

    public void processGrades() {
        System.out.print("Enter the number of grades: ");
        int numberOfGrades = input.nextInt();
        
        double totalSum = 0;

        for (int i = 1; i <= numberOfGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            double currentGrade = input.nextDouble();

            //passing or failing
            if (currentGrade >= 65.0) {
                System.out.println("Status: Passing");
            } else {
                System.out.println("Status: Failing");
            }

            totalSum = totalSum + currentGrade; // Add to total sum
        }

        // Calculate average
        double gradeAverage = 0;
        if (numberOfGrades > 0) {
            gradeAverage = totalSum / numberOfGrades;
        }

        int ratingScale = 0;
        if (gradeAverage >= 90 && gradeAverage <= 100) {
            ratingScale = 4;
        } else if (gradeAverage >= 80 && gradeAverage < 90) {
            ratingScale = 3;
        } else if (gradeAverage >= 70 && gradeAverage < 80) {
            ratingScale = 2;
        } else if (gradeAverage >= 65 && gradeAverage < 70) {
            ratingScale = 1;
        } else {
            ratingScale = 0;
        }

        // Print results
        System.out.println("\n--------------------------");
        System.out.println("Numeric Average: " + gradeAverage);
        System.out.println("Grade Rating Scale (0-4): " + ratingScale);
        System.out.println("--------------------------");
    }
}