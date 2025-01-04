import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read a string (next line input)
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Read an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        // Read a floating-point number
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();
        System.out.println("Your height is " + height + " meters.");

        // Read a boolean value
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Student status: " + isStudent);

        // Close the scanner (it's a good practice to close it when you're done)
        scanner.close();
    }
}