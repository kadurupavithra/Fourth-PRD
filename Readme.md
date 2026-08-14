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