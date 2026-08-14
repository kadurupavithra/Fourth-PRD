# Project Overview

This program demonstrates how a Java object is created, how methods are called, how instance variables are updated, and how Stack and Heap memory are involved.

## Understanding of the Requirement

The program creates a `Student` object using the `new` keyword.

The student information includes:

- Student Name
- Course Name
- Completed Topics
- Questions Solved

The program uses separate methods to:

- Set student details
- Set student progress
- Display student details
- Display student progress
- Add completed topics
- Add solved questions

## Student Information Used

- **Name:** Student name entered by the user
- **Course Name:** Course name entered by the user
- **Completed Topics:** Number of completed topics
- **Questions Solved:** Number of questions solved

## Variables and Data Types Used

| Data Type | Variable | Purpose |
|---|---|---|
| `String` | `name` | Student name |
| `String` | `courseName` | Course name |
| `int` | `completedTopics` | Number of completed topics |
| `int` | `questionsSolved` | Number of questions solved |
| `Student` | `s1` | Reference variable |
| `Scanner` | `sc` | Reference variable |

## Object Creation

The Student object is created using:

```java
Student s1 = new Student();
## Object Creation The Student object is created using:
Student s1 = new Student();
When the new keyword is executed: - A Student object is created in the Heap. - s1 is a reference variable. - s1 refers to the Student object. - Instance variables are created as part of the object and receive default values. ### Default Values
name = null 
courseName = null 
completedTopics = 0 
questionsSolved = 0
## Scanner Object Creation The Scanner object is created using:
Scanner sc = new Scanner(System.in);
- The Scanner object is created in the Heap. - sc is the reference variable. - The sc reference is used to take input from the user. ## Methods Used ### setDetails()
s1.setDetails(name, courseName);
This method receives name and courseName as parameters and updates the corresponding instance variables.
this.name = name; 
this.courseName = courseName;
The this keyword refers to the current object, which is s1. ### setProgress()
s1.setProgress(completedTopics, questionsSolved);
This method receives completedTopics and questionsSolved as parameters and updates the corresponding instance variables.
this.completedTopics = completedTopics; 
this.questionsSolved = questionsSolved;
The this keyword is used to distinguish the instance variables from the parameters. ### displayDetails()
s1.displayDetails();
This method displays the student's name and course name. When the method is called, a stack frame (activation record) is created. After the method finishes execution, its stack frame is removed. ### displayProgress()