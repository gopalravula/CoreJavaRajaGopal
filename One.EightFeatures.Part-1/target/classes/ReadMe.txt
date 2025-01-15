1. Normal Interface Implementation
Steps:

Define the interface with methods.
Create a separate class that implements the interface.
Override the interface methods in the class.
Create an object of the class and call the method.


// Step 1: Define the interface
interface Animal {
    void sound();
}

// Step 2: Create a class that implements the interface
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

// Step 4: Use the class in the main method
public class NormalInterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Creating an object of Dog class
        dog.sound(); // Output: Dog says: Woof Woof!
    }
}




2. Anonymous Class Implementation :-
Steps:

Define the interface with methods.
Directly create an instance of the interface using an anonymous class.
Override the methods inside the anonymous class.
Use the object to call the method.


3 . Lambda Expressions :-
Steps to Use Lambda Expressions
Define a functional interface (an interface with one abstract method).
Use a lambda expression to provide the implementation for the abstract method.
Call the method through the interface.

4. Method References ?
Where are Method References Used?
Method references are primarily used with functional interfaces, like:

Consumer: When you want to consume data (e.g., printing). --no return type.
Supplier: When you want to supply data. --no input value only give return type.
Function: When you map input to output. --Take input and give the output.
Predicate: When you evaluate a condition. --take input and give Boolean.


Consumer :-

Single-Line Definitions
What is a Consumer?
A Consumer is a functional interface in Java that accepts a single input and performs an action on it without returning a result.
 void accept(T t);
Why is it used?
It is used to perform operations like printing, updating, or logging on input data without needing a return value.

When is it used?
It is used in scenarios like iterating over collections (forEach), chaining operations, or applying actions where the result is not required.

BiConsumer :-

A BiConsumer is a functional interface in Java that accepts a Two input and performs an action on it without returning a result.
 void accept(T t, K y);

-------------------------------------------------------------------------------

Predicate in Java 8
What is a Predicate?
A Predicate is a functional interface in Java 8 (java.util.function.Predicate) that represents a condition or test on an input, returning a boolean result (true or false).

Why was Predicate introduced?
It was introduced to simplify and enhance the filtering of data or conditions by enabling functional programming constructs like lambda expressions.

When is Predicate used?
It is used when you need to test or evaluate a condition on an input, such as checking if a number is even, if a string is empty, or if an object matches a criteria.

Where is Predicate used?

Commonly used in filtering operations with streams.
Used in conditional checks and validation logic.

BiPredicate
What is it?
A functional interface that evaluates a condition involving two inputs and returns a boolean result.

Why use it?
It simplifies testing conditions involving two objects or arguments.

When to use it?
Use BiPredicate when testing relationships between two inputs, such as comparing, validating, or filtering data.

------------------------------------------------------------------------------------------------------------------------

Function in Java 8 - Single-Line Definitions
What is Function?
Function ReturnType Apply(String name)
A Function is a functional interface that takes one input, transforms it, and returns one output.

Why is it used?
To simplify data transformations or mappings.

When is it used?
When converting or processing data (e.g., calculating squares, converting types).

Where is it used?
Commonly in streams (map()), data processing, or business logic.


BiFunction ?
What is BiFunction?
Function ReturnType Apply(String name)
A BiFunction is a functional interface that takes two inputs, processes them, and returns one output.

Why is it used?
To define operations or transformations involving two inputs and a single result.

When is it used?
When combining or transforming two inputs into a single output (e.g., adding two numbers or concatenating strings).

Where is it used?
Commonly in complex data transformations, combining two objects, or stream processing.

-----------------------------------------------------------------------------------------------------------------
What is Supplier?
Supplier ReturnType get();
A Supplier is a functional interface in Java 8 that represents a supplier of results, producing a value without taking any input.

Why is it used?
To provide values or objects lazily (when required) without taking any input.

When is it used?
When you need to generate or supply data, such as default values, factory methods, or lazy initialization.

Where is it used?

Factory methods to create new objects.
Caching or on-demand computation.
Supplying data for stream operations.

-------------------------------------------------------------------------------------------------------------------

