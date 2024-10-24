# FlexisafWeek6

# Phone Inheritance Example with Nested Classes and Anonymous Class

This program is to demostrate my knwolegde of **nested classes**, **access modifier**, and **anonymous classes**. The example models different types of phones (`Samsong` and `Tecno`) as subclasses of a base class `Phone`. Additionally, it shows how to use an **anonymous class** to override the `toString()` method for a one-off object.

## Table of Contents
- [Project Structure](#project-structure)
- [Key Concepts](#key-concepts)
- [Usage](#usage)
- [Output](#output)
- [Detailed Explanation](#detailed-explanation)
  - [1. Nested Classes](#1-nested-classes)
  - [2. Inheritance](#2-inheritance)
  - [3. Anonymous Class](#3-anonymous-class)
  - [4. Overriding Methods](#4-overriding-methods)
  - [5. Access Modifiers](#5-access-modifiers)

## Project Structure
The program is contained within a single file, `phoneNestedClass.java`, which consists of:
- A `Main` class that contains nested classes (`Phone`, `Samsong`, `Tecno`).
- Subclasses `Samsong` and `Tecno` which extend the `Phone` class to represent different phone models.

## Key Concepts
The program demonstrates the following key concepts:
- **Nested Classes**: Classes defined inside other classes.
- **Inheritance**: How subclasses (`Samsong`, `Tecno`) inherit from a base class (`Phone`).
- **Anonymous Classes**: A class with no name that overrides methods on the fly.
- **Method Overriding**: The `toString()` method is overridden to provide custom output.
- **Access Modifiers**: Control the visibility of class members and methods (in this case, `public` members).

## Usage

### Prerequisites:
- A Java Development Kit (JDK) must be installed on your machine to compile and run the program.
  
### Steps to Run:
1. Copy the `Main.java` code into your IDE or text editor.
2. Compile the code using the following command in your terminal or command prompt:
   ```
   javac Main.java
   ```
3. Run the compiled Java program:
   ```
   java Main
   ```

## Output
After running the program, the expected output will be:

```
Phone info {
Model = Samsong A21
Ram = 8GB
Storage = 120GB
Battery = 7000MaH
}
___________

Phone info {
Model = Camon CX Air
Ram = 4GB
Storage = 64GB
Battery = 5000MaH
}
___________

This is an anonymous class for a phone with custom toString()
Model: Anonymous Phone
Ram: 6GB
Storage: 128GB
Battery: 6000MaH
```

## Detailed Explanation

### 1. Nested Classes
- The program contains **static nested classes** defined inside the `Main` class:
  - `Phone` is a static nested class that models a generic phone with attributes like `Model`, `Ram`, `Storage`, and `Battery`.
  - `Samsong` and `Tecno` are static nested classes that extend the `Phone` class and provide specific details for two phone models.
  
  These classes are static, meaning they do not require an instance of the outer class (`Main`) to be instantiated.

### 2. Inheritance
- The classes `Samsong` and `Tecno` inherit from the `Phone` class. They utilize the `super()` constructor to pass phone-specific values (such as model name, RAM, storage, and battery capacity) to the `Phone` constructor. This allows the child classes to reuse the structure and behavior of the parent class.

  ```java
  public Samsong() {
      super("Samsong A21", 8, 120, 7000);  // Inherits from Phone
  }
  ```

### 3. Anonymous Class
- The program demonstrates the use of an **anonymous class** to override the `toString()` method for a specific `Phone` object. Anonymous classes are useful when you need to create an instance with slightly modified behavior or functionality without creating a named subclass.

  ```java
  Phone anonymousPhone = new Phone("Anonymous Phone", 6, 128, 6000) {
      @Override
      public String toString() {
          return "This is an anonymous class for a phone with custom toString()";
      }
  };
  ```

  This allows a one-off `Phone` instance with a custom `toString()` implementation without having to define a separate subclass.

### 4. Overriding Methods
- The `Phone` class overrides the `toString()` method (inherited from `Object`) to provide a formatted string representation of the phone’s attributes. This overridden method is called whenever a `Phone` object (or its subclasses) is passed to `System.out.println()`.

  ```java
  @Override
  public String toString() {
      return "Phone info {" + "\n" +
             "Model = " + Model + "\n" +
             "Ram = " + Ram + "GB" + "\n" +
             "Storage = " + Storage + "GB" + "\n" +
             "Battery = " + Battery + "MaH" + "\n" +
             "}";
  }
  ```

### 5. Access Modifiers
- The program uses the `public` access modifier for class fields (`Model`, `Ram`, `Storage`, `Battery`) and methods, making them accessible throughout the program. However, in real-world applications, fields should typically be **private** to ensure encapsulation, with **public getter and setter methods** provided for controlled access.

  Example improvement:
  ```java
  private String Model;
  private int Ram;
  
  public String getModel() {
      return Model;
  }
  
  public void setModel(String model) {
      this.Model = model;
  }
  ```
