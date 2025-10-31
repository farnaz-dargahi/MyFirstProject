import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("grades.txt");
        Scanner input = new Scanner(myFile);

        System.out.println("Student Grades:");
        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);
        }
    }
}

