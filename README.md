# JavaFinalProject_Talingting_Kenneth_Lancee
Java BMI Calculator Application

Project Title BMI Calculator with Session History

Problem StatementCalculating Body Mass Index (BMI) manually can be tedious and prone to calculation errors. Furthermore, simply knowing the raw BMI number is often insufficient; users need to immediately understand their specific health category (e.g., Underweight, Normal, Overweight, or Obese) to make informed health decisions.

-The Problem Solved: This application automates the mathematical computation of BMI, immediately categorizes the user's health status based on standard metrics, and solves the data tracking problem by maintaining a history log of multiple calculations within a single session using arrays.

Program FeaturesThis application includes the following features implemented using Java: Automated Calculation: Instantly computes BMI using the formula $weight / height^2. Health Categorization: Uses logic to classify the result into standard health categories (Underweight, Normal Weight, Overweight, Obese). Session History (Array Implementation): Stores the results of up to 10 different users in a single session without needing to restart the program.Summary Report: Generates and displays a list of all BMIs calculated during the session upon exit.Object-Oriented Design: Utilizes a custom BMIRecord class to manage user data securely. Interactive Interface: Uses a console-based menu system that allows continuous usage.

How to Run the Program

Accepting User Inputs: The program uses the Scanner class to pause the console and wait for you to type your weight (in kilograms) and height (in meters).
*Object-Oriented Processing: Once you enter the data, the program creates a new BMIRecord object which automatically performs the calculation using a specific math formula within its class. +1

*Logical Evaluation: The application uses if-else decision structures to compare your calculated BMI against standard health scales to determine if you are "Normal," "Overweight," etc.

*Data Storage: Your result is automatically saved into an Array, allowing the program to remember your score even if you perform multiple calculations in one go.

*The "Proceed" Loop: After displaying your result, a do-while loop triggers a prompt asking if you want to calculate for another person.

*Handling User Choice: If you type 'yes' or 'YES' (Yes): The loop restarts from the beginning, clearing the temporary inputs and asking for a new weight and height.
If you type 'no' or 'NO' (No): The loop breaks, and the program executes a final method to display a summary of all the stored BMI results from the array before closing.

Sample Output:
=== Java BMI Calculator Application ===

--- New Calculation ---
Enter Weight (in Kilograms): 55
Enter Height (in Meters): 1.7
Result: Your BMI is 19.03
Category: Normal Weight

Calculate for another person? (YES/NO): yes

--- New Calculation ---
Enter Weight (in Kilograms): 80
Enter Height (in Meters): 3.2
Result: Your BMI is 7.81
Category: Underweight

Calculate for another person? (YES/NO): no

=========================================
       SESSION SUMMARY REPORT
=========================================
Total Calculations Performed: 2
Recorded BMIs: [ 19.03 | 7.81 ]

Thank you for using the BMI Calculator.
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  37.058 s
Finished at: 2025-12-30T13:58:04+08:00
------------------------------------------------------------------------
