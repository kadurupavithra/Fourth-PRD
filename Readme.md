# Student Object Creation and Java Memory Management

## Project Overview

This Java program demonstrates:

* How a Java object is created using the `new` keyword.
* How methods are called.
* How instance variables are updated.
* How Stack and Heap memory are used.
* How user input is taken using the `Scanner` class.

## Understanding the Requirement

The program creates a `Student` object using the `new` keyword.

The student information includes:

* Student Name
* Course Name
* Completed Topics
* Questions Solved

The program uses separate methods to:

* Set student details
* Set student progress
* Display student details
* Display student progress
* Add completed topics
* Add solved questions

## Student Information Used

| Information          | Description                      |
| -------------------- | -------------------------------- |
| **Name**             | Student name entered by the user |
| **Course Name**      | Course name entered by the user  |
| **Completed Topics** | Number of completed topics       |
| **Questions Solved** | Number of questions solved       |

## Variables and Data Types

| Data Type | Variable          | Purpose                               |
| --------- | ----------------- | ------------------------------------- |
| `String`  | `name`            | Stores student name                   |
| `String`  | `courseName`      | Stores course name                    |
| `int`     | `completedTopics` | Stores number of completed topics     |
| `int`     | `questionsSolved` | Stores number of questions solved     |
| `Student` | `s1`              | Reference variable for Student object |
| `Scanner` | `sc`              | Reference variable for Scanner object |

## Object Creation

The Student object is created using:

```java
Student s1 = new Student();
```

When the `new` keyword is executed:

1. A `Student` object is created in the **Heap memory**.
2. `s1` is a **reference variable**.
3. `s1` refers to the Student object.
4. Instance variables are created as part of the Student object.
5. Instance variables receive their default values.

### Default Values

```text
name = null
courseName = null
completedTopics = 0
questionsSolved = 0
```

## Scanner Object Creation

The Scanner object is created using:

```java
Scanner sc = new Scanner(System.in);
```

Here:

* The `Scanner` object is created in the **Heap memory**.
* `sc` is the reference variable.
* The `sc` reference is used to take input from the user.

## Methods Used

### 1. setDetails()

Method call:

```java
s1.setDetails(name, courseName);
```

This method receives `name` and `courseName` as parameters and updates the corresponding instance variables.

```java
this.name = name;
this.courseName = courseName;
```

The `this` keyword refers to the **current object**, which is `s1`.

### 2. setProgress()

Method call:

```java
s1.setProgress(completedTopics, questionsSolved);
```

This method updates the student's progress.

```java
this.completedTopics = completedTopics;
this.questionsSolved = questionsSolved;
```

The `this` keyword is used to distinguish between:

* Instance variables
* Method parameters

### 3. displayDetails()

Method call:

```java
s1.displayDetails();
```

This method displays:

* Student name
* Course name

When the method is called, a **stack frame (activation record)** is created.

After the method finishes execution, its stack frame is removed from the Stack.

### 4. displayProgress()

Method call:

```java
s1.displayProgress();
```

This method displays:

* Completed topics
* Questions solved

The values are read from the Student object stored in the Heap.

### 5. addTopics()

Method call:

```java
int totalTopics = s1.addTopics(topics);
```

This method:

1. Takes the number of new completed topics as a parameter.
2. Adds it to the existing `completedTopics`.
3. Updates the value in the Student object.
4. Returns the new total.

### 6. addQuestions()

Method call:

```java
int totalQuestions = s1.addQuestions(questions);
```

This method:

1. Takes the number of new questions as a parameter.
2. Adds it to the existing `questionsSolved`.
3. Updates the value in the Student object.
4. Returns the new total.

## Stack Memory

Stack memory is mainly used for:

* Method calls
* Local variables
* Method parameters
* Reference variables

Important points:

* The Student object is **not stored in the Stack**.
* The reference variable `s1` is stored in the Stack.
* `s1` contains a reference to the Student object in the Heap.
* Every method call creates a **stack frame**.
* The stack frame is removed when the method finishes.
* Stack follows the **LIFO (Last In, First Out)** principle.

## Heap Memory

Heap memory is used for dynamically created objects.

In this program:

* The `Student` object is created in the Heap.
* The `Scanner` object is created in the Heap.
* Instance variables are stored inside the Student object.
* Objects remain in Heap memory until they are no longer reachable.
* Java's **Garbage Collector** automatically manages unused objects

## Object and Reference Relationship

```text
Student s1 = new Student();
```

This can be understood as:

```text
Stack                         Heap

s1  ----------------------->  Student Object
                              ----------------
                              name = null
                              courseName = null
                              completedTopics = 0
                              questionsSolved = 0
```

After calling `setDetails()` and `setProgress()`:

```text
Stack                         Heap

s1  ----------------------->  Student Object
                              ----------------
                              name = "Pavithra"
                              courseName = "Java"
                              completedTopics = 5
                              questionsSolved = 20
```

## Conclusion

This project demonstrates the basic concepts of **Object-Oriented Programming and Java Memory Management**.

It explains:

* Object creation using `new`
* Reference variables
* Instance variables
* Method calls
* Method parameters
* `this` keyword
* Scanner object creation
* Stack memory
* Heap memory
* Stack frames
* Garbage Collection

The program helps understand how Java objects are created, how their data is updated through methods, and how Stack and Heap memory work together during program execution.
