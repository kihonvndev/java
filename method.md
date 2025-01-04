# Methods

In Java, **methods** are blocks of code designed to perform a particular task. They are essential building blocks of any
Java program, and understanding how to define and use them is crucial for structuring and organizing your code.

## What is a Method?

A **method** is a collection of statements that are executed when the method is called. Methods allow you to **reuse
code**, and
they make your program more modular and organized.

## Basic Syntax of a Method

Here is the basic syntax for defining a method in Java:

```java
returnType methodName(parameter1, parameter2, ...) {
    // Method body
    // Statements to perform the task
    return value; // Optional: only if the returnType is not void
}
```

- `returnType`: Specifies what type of value the method will return (e.g., `int`, `double`, `String`). If the method
  doesn't
  return anything, the return type is `void`.
- `methodName`: The name of the method. Method names follow the same rules as variable names (e.g., start with a letter,
  no
  spaces).
- `parameters`: These are the values the method needs to perform its task. They are optional and enclosed in
  parentheses. If
  there are no parameters, the parentheses are empty.
- `return`: If the method is supposed to return a value, the return keyword is used to send back the result.

## Types of Methods in Java

1. **Void Method**: A method that doesn't return any value. The return type is `void`.
2. **Non-Void Method**: A method that returns a value. The return type could be any data type, such as `int`, `String`,
   etc.

---

## Examples of Methods in Java

### 1. Void Method (Does Not Return a Value)

```java
public class Example {
    // A void method that prints a message
    public static void printMessage() {
        System.out.println("Hello, this is a simple message!");
    }

    public static void main(String[] args) {
        // Calling the method
        printMessage();
    }

}
```

- Explanation:
    - `public static void printMessage()`: This is a void method because it doesn't return anything.
    - Inside the method, we have a simple statement that prints a message.
    - We call the method in the `main` method to execute it.

### 2. Non-Void Method (Returns a Value)

```java
public class Example {
    // A method that returns the sum of two integers
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling the add method and printing the result
        int result = add(10, 5);  // The result is assigned to the 'result' variable
        System.out.println("The sum is: " + result);
    }

}
```

- Explanation:
    - `public static int add(int a, int b)`: This method takes two parameters (`a` and `b`), adds them, and returns an
      `int` value (
      the sum).
    - `return a + b;`: The method returns the sum of the two integers passed to it.
    - In the `main` method, we call `add(10, 5)` and store the `result` in the variable result, which is then printed.

### 3. Method with Multiple Parameters

```java

public class Example {
    // A method that multiplies three numbers
    public static double multiply(double x, double y, double z) {
        return x * y * z;
    }

    public static void main(String[] args) {
        // Calling the multiply method and printing the result
        double result = multiply(2.5, 3.5, 4.0);
        System.out.println("The product is: " + result);
    }

}
```

- Explanation:
    - The `multiply` method accepts three parameters (`x`, `y`, and `z`) and multiplies them together.
    - The method returns the result as a `double`.
    - In the `main` method, we call `multiply(2.5, 3.5, 4.0)` and print the result.

### 4. Method with Return Type of String

```java

public class Example {
    // A method that returns a greeting message
    public static String getGreeting(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        // Calling the getGreeting method and printing the result
        String greeting = getGreeting("Alice");
        System.out.println(greeting);
    }

}
```

- Explanation:
    - The `getGreeting` method takes a `String` parameter (`name`) and returns a greeting message that includes the
      name.
    - In the `main` method, we call `getGreeting("Alice")` and store the result in the `greeting` variable, which is
      then printed.

---

## Method Overloading

In Java, you can define multiple methods with the same name, as long as they have different **parameters** (either in
number, type, or order). This is called **method overloading**.

Example:

```java

public class Example {
    // Overloaded method with one parameter
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // Overloaded method with two parameters
    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        // Calling the first version of the method
        printMessage("Hello!");

        // Calling the overloaded version of the method
        printMessage("Hello!", 3);
    }

}
```

- Explanation:
    - Both methods are named `printMessage`, but one accepts only a `String` and the other accepts both a `String` and
      an `int` (
      number of times to print the message).
    - This is an example of method overloading: the method name stays the same, but the parameter list changes.

---

## Method Scope & Access Modifiers

- **Access Modifiers**:
    - `public`: The method can be called from any other class.
    - `private`: The method can only be called within the same class.
    - `protected`: The method can be called within the same package or subclasses.
    - `default` (no modifier): The method can only be called within the same package.
- **Method Scope**:
    - A method’s scope refers to where the method can be accessed or used.
    - Methods defined as `static` can be called without creating an instance of the class (as we did in all examples).
    - Non-static methods require an instance of the class to be called.

---

## Recap of Key Concepts

1. **Void Method**: Does not return a value (e.g., `void printMessage()`).
2. **Non-Void Method**: Returns a value (e.g., `int add(int a, int b)`)
3. **Parameters**: Methods can accept input via parameters to work with different data.
4. **Return Type**: The type of value a method will return (e.g., `int`, `String`, `void`).
5. **Method Overloading**: Multiple methods with the same name but different parameters.

---

## Practice

To master methods, you should practice writing and calling them in different scenarios. Try creating methods that:

- Perform mathematical operations (addition, subtraction, etc.).
- Return values based on certain conditions (e.g., a method that returns the larger of two numbers).
- Use different data types for parameters and return values.