/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bmicalculatorapp;

import java.util.Scanner;

class BMIRecord {

    private double weight;
    private double height;
    private double bmiValue;

    // Constructor
    public BMIRecord(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.bmiValue = calculateBMI();
    }

    
    public double calculateBMI() {
       
        return weight / (height * height);
    }

    
    public String getCategory() {
        if (bmiValue < 18.5) {
            return "Underweight";
        } else if (bmiValue >= 18.5 && bmiValue < 24.9) {
            return "Normal Weight";
        } else if (bmiValue >= 25 && bmiValue < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public double getBmiValue() {
        return bmiValue;
    }
}

public class BMICalculatorApp {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        double[] sessionHistory = new double[10];
        int count = 0;
        String choice;

        System.out.println("=== Java BMI Calculator Application ===");

        do {
            System.out.println("\n--- New Calculation ---");

            System.out.print("Enter Weight (in Kilograms): ");
            double weight = scanner.nextDouble();

            System.out.print("Enter Height (in Meters): ");
            double height = scanner.nextDouble();

            BMIRecord record = new BMIRecord(weight, height);

            double bmi = record.getBmiValue();
            String category = record.getCategory();

            System.out.printf("Result: Your BMI is %.2f\n", bmi);
            System.out.println("Category: " + category);

            if (count < sessionHistory.length) {
                sessionHistory[count] = bmi;
                count++;
            } else {
                System.out.println("Warning: Session history is full.");
            }

            System.out.print("\nCalculate for another person? (YES/NO): ");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("yes"));

        displaySessionSummary(sessionHistory, count);

        System.out.println("\nThank you for using the BMI Calculator.");
        scanner.close();
    }

    public static void displaySessionSummary(double[] history, int count) {
        System.out.println("\n=========================================");
        System.out.println("       SESSION SUMMARY REPORT");
        System.out.println("=========================================");
        System.out.println("Total Calculations Performed: " + count);

        if (count > 0) {
            System.out.print("Recorded BMIs: [ ");
           
            for (int a = 0; a < count; a++) {
                System.out.printf("%.2f ", history[a]);
                if (a < count - 1) {
                    System.out.print("| ");
                }
            }
            System.out.println("]");
        }
    }
}
