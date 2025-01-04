# Take User Input

In Java, you can take user input using the Scanner class, which is part of the java.util package. The Scanner class
allows you to read input from various sources, including the keyboard (standard input).

## Steps to Take User Input in Java:

1. **Import the Scanner class**: Before you can use the `Scanner` class, you need to import it at the beginning of your
   program:
   ```java
   import java.util.Scanner;
   ```
2. **Create a Scanner object**: You need to create an instance of the `Scanner` class to read input.
   ```java
   Scanner scanner = new Scanner(System.in);
   ```
3. **Read Input**: You can then use various methods of the `Scanner` class to read different types of input, such as
   strings,
   integers, or floating-point numbers.

## Example: Reading User Input

Here's an example of how to take different types of input from the user:

```java
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
```

- **Explanation**:
    - `scanner.nextLine()` reads a full line of text input (useful for strings that contain spaces).
    - `scanner.nextInt()` reads an integer.
    - `scanner.nextDouble()` reads a floating-point number (double).
    - `scanner.nextBoolean()` reads a boolean value (true or false).
- **Important Notes**:
    - **Handling input errors**: If the user enters invalid data (e.g., typing a letter when an integer is expected),
      Java
      will
      throw an exception. To handle such cases more gracefully, you can add error handling using `try-catch` blocks.

      Example for handling invalid input:

        ```java
        try {
            System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        ```

- **Skipping the newline character**: After calling methods like `nextInt()`, `nextDouble()`, etc., the `Scanner` might
  leave a
  newline character in the input buffer. This can cause issues when you call `nextLine()` after these methods. To avoid
  this, you can add an extra `scanner.nextLine()` to consume the leftover newline:
    ```java
    scanner.nextLine(); // Consume the newline character left after nextInt() or nextDouble()
    ```

## Practice:

Try creating a simple calculator program where the user inputs two numbers and selects an operation (addition,
subtraction, etc.). Here's a basic example to get you started:

```java
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return; // Exit the program if division by zero
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }

}
```

## In summary:

- `Scanner` is your go-to class for taking user input in Java.
- You can read strings, numbers, and boolean values using different methods like `nextLine()`, `nextInt()`,
  `nextDouble()`, and
  `nextBoolean()`.
- Always remember to close the `Scanner` when you're done with it.