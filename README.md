# Learning Java

**Java** is a powerful, versatile, and widely-used programming language. It's used in everything from Android apps to
large-scale enterprise systems. Java has a strong community, so there are plenty of resources to help you along the way.

## Let's start with the basics of Java:

**1. Setting Up Java Development Environment**:

Before you can write and run Java programs, you'll need to set up your environment.

- **Install JDK (Java Development Kit)**:
    - Go to the [official Java website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) and
      download
      the latest version of the JDK for your operating system (Windows, macOS, or
      Linux).
- **Install an IDE (Integrated Development Environment)**:
    - A good IDE makes programming easier with features like code completion and debugging.
    - I recommend **IntelliJ IDEA** or **Eclipse** for Java development.
- **Set Up PATH (for Windows users)**:
    - Ensure that Java is accessible from the command line by setting the PATH environment variable. This allows you to
      run
      Java programs from anywhere on your computer.

**2. Your First Java Program**:

Now that you have Java set up, let's write your first Java program, a classic "Hello, World!" program. Here's how:

1. **Create a Java File**:
    - Open your IDE and create a new file named `HelloWorld.java`.
2. **Write the Code**:
    ```java
    // This is a comment. Java ignores everything after the '//' on a line.
  
    public class HelloWorld { // The class definition
        public static void main(String[] args) { // The main method, where the program starts
            System.out.println("Hello, World!"); // Prints "Hello, World!" to the console
        }
   }

   ```

**3. Understanding the Code**:

- `public class HelloWorld`: This defines a class named `HelloWorld`. In Java, every program is contained inside a
  class.
- `public static void main(String[] args)`: This is the entry point for the program. When you run your program, this
  method
  is executed first.
    - `public`: This means the method can be accessed from anywhere.
    - `static`: This means you can call the method without creating an instance of the class.
    - `void`: This means the method doesn't return anything.
    - `String[] args`: This is an array of strings passed to the program from the command line, though we won't use it
      in this
      simple example.
- `System.out.println("Hello, World!");`: This line outputs the text `Hello, World!` to the console.

**4. Running the Program**:

- If you're using an IDE (like IntelliJ IDEA or Eclipse), you can simply click the "Run" button to execute the program.
- If you're using the command line:
    1. Open the command line (Terminal on macOS/Linux, Command Prompt on Windows).
    2. Navigate to the folder where you saved HelloWorld.java.
    3. Compile the Java program using the following command:
       ```bash
       javac HelloWorld.java
       ```
       This creates a HelloWorld.class file (the bytecode version of your program).
    4. Run the program using:
       ```bash
       java HelloWorld
       ```
       This should output:
       ```
       Hello, World!
       ```

**5. Basic Java Concepts**:
Here are some important Java concepts that you'll need to understand as you get deeper into programming:

- **Variables**: Store data like numbers, text, or objects.
    ```java
    int age = 25; // Declares an integer variable 'age' and assigns it a value of 25

    String name = "Alice"; // Declares a string variable 'name' and assigns it "Alice"
    ```
- **Data Types**: Java has several primitive types (e.g., `int`, `float`, `char`, `boolean`), and you can also create
  custom types (
  like classes).
    - `int` – for integers (whole numbers).
    - `double` – for decimal numbers.
    - `char` – for single characters (e.g., 'a').
    - `boolean` – for true/false values.
- **Control Structures**:
    - **If-Else Statements**:
         ```java
         if (age >= 18) {
             System.out.println("You are an adult.");
         } else {
             System.out.println("You are a minor.");
         }
      ```
    - **For Loop**:
      ```java
      for (int i = 0; i < 5; i++) {
          System.out.println("Count: " + i);
      }
    - **While Loop**:
      ```java
      int i = 0;
      while (i < 5) {
          System.out.println("Count: " + i);
          i++;
      }
      ```

**6. Next Steps**:

Once you're comfortable with the basics, here are some topics you should explore next:

1. [**Functions/Methods**](method.md) – Reusable blocks of code that perform a specific task.
2. **Object-Oriented Programming (OOP)** – Java is an object-oriented language, meaning it focuses on organizing code
   around
   objects and classes.
3. **Arrays** – Store multiple values of the same type.
4. **Collections** – More advanced data structures like lists, sets, and maps.
5. **Exception Handling** – Managing errors and exceptions in your programs.
6. **Java Libraries/APIs** – Java has a large collection of built-in libraries for handling everything from file I/O to
   networking.

### Practice:

The best way to learn programming is by writing code. Start with simple projects and gradually move to more complex
ones. Here are some practice exercises:

1. **Simple Calculator** – Write a program that [takes two numbers from the user](take-user-input.md) and performs
   addition, subtraction,
   multiplication, and division.
2. **Guessing Game** – Create a game where the computer randomly selects a number, and the user has to guess it.
3. **To-Do List Application** – Implement a simple to-do list where you can add and remove tasks.
