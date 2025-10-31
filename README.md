
# Lab: Student Grade Calculator

This simple Java program asks the user for a student’s name and three test scores, 
calculates the average score, and displays the letter grade (A–F) based on the average.


## Learning Objectives
- Practice using variables, input/output, and basic arithmetic operations.
- Apply conditional statements (`if–else`) for grade evaluation.
- Reinforce user interaction using the `Scanner` class.


## How to Run
1. Open your IDE (e.g., IntelliJ or Eclipse).
2. Create a new Java project named **Lab_StudentGradeCalculator**.
3. Add the file **Main.java** to your project.
4. Run the program and enter:
   - The student’s name  
   - Three test scores (e.g., 85, 90, 78)


## Example Output
```text
Enter student name: Bob
Enter first score: 85
Enter second score: 90
Enter third score: 78


--- Student Report ---
Name: Bob
Average Score: 84.33
Letter Grade: B
```

##  Starter Code
Here’s the starter template you can use before adding the logic for calculations:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO: Ask the user for name and three scores

        // TODO: Calculate the average score

        // TODO: Determine the letter grade based on the average

        // TODO: Display the results

        input.close();
    }
}
```
## Author
Naz  
CISC 190 – Java Programming  
San Diego Miramar College

