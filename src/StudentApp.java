import java.util.Scanner;

class Student {

    String name;
    String courseName;
    int completedTopics;
    int questionsSolved;

    void setDetails(String name, String courseName) {
        this.name = name;
        this.courseName = courseName;
    }

    void setProgress(int completedTopics, int questionsSolved) {
        this.completedTopics = completedTopics;
        this.questionsSolved = questionsSolved;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Course Name: " + courseName);
    }

    void displayProgress() {
        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Questions Solved: " + questionsSolved);
    }

    // Add topics and return updated total
    int addTopics(int newCompletedTopics) {
        this.completedTopics = this.completedTopics + newCompletedTopics;

        return this.completedTopics;
    }

    // Add questions and return updated total
    int addQuestions(int newQuestionsSolved) {
        this.questionsSolved = this.questionsSolved + newQuestionsSolved;

        return this.questionsSolved;
    }
}

public class StudentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("=============================================");
        System.out.println("        STUDENT PRACTICE TRACKER");
        System.out.println("=============================================");

        System.out.print("Enter Student Name: ");
        student.name = sc.nextLine();

        System.out.print("Enter Course Name: ");
        student.courseName = sc.nextLine();

        System.out.print("Enter Completed Topics: ");
        student.completedTopics = sc.nextInt();

        System.out.print("Enter Questions Solved: ");
        student.questionsSolved = sc.nextInt();

        while (true) {

            System.out.println();
            System.out.println("=============================================");
            System.out.println("                  MENU");
            System.out.println("=============================================");

            System.out.println("1. View Student Details");
            System.out.println("2. View Progress");
            System.out.println("3. Add Completed Topics");
            System.out.println("4. Add Solved Questions");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    student.displayDetails();
                    break;

                case 2:
                    student.displayProgress();
                    break;

                case 3:
                    System.out.print("Enter New Completed Topics: ");
                    int topics = sc.nextInt();

                    int totalTopics = student.addTopics(topics);

                    System.out.println("Topics updated successfully.");
                    System.out.println("Total Completed Topics: "
                            + totalTopics);
                    break;

                case 4:
                    System.out.print("Enter New Questions Solved: ");
                    int questions = sc.nextInt();

                    int totalQuestions = student.addQuestions(questions);

                    System.out.println("Questions updated successfully.");
                    System.out.println("Total Questions Solved: "
                            + totalQuestions);
                    break;

                case 5:
                    System.out.println();
                    System.out.println(
                            "Thank you for using Student Practice Tracker.");
                    System.out.println("Keep Practicing!");

                    sc.close();
                    return;

                default:
                    System.out.println(
                            "Invalid Choice. Please try again.");
            }
        }
    }
}