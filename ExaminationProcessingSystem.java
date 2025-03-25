               //Examination processing System
               //Carried out by: 175851, 
import java.time.LocalDate;
import java.util.Scanner;

class Student {
    private String name;
    private String id;
    private double[] scores; // Array to store scores for 5 subjects
    private static final int NUM_SUBJECTS = 5;

    // Constructor
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.scores = new double[NUM_SUBJECTS];
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double[] getScores() {
        return scores;
    }

    // Method to set scores
    public void setScore(int subjectIndex, double score) {
        if (subjectIndex >= 0 && subjectIndex < NUM_SUBJECTS) {
            scores[subjectIndex] = score;
        }
    }
}

class ExaminationSystem {
    private Student[] students;
    private static final int NUM_STUDENTS = 10;
    private static final int NUM_SUBJECTS = 5;
    private static final String[] SUBJECTS = {"OOP", "Database System", "Calculus I", "Data Structures & Algorithm", "Web Development"};
    private Scanner scanner;

    // Constructor
    public ExaminationSystem() {
        students = new Student[NUM_STUDENTS];
        scanner = new Scanner(System.in);
    }

    // Task 1: Read details of 10 students
    public void readStudentDetails() {
        System.out.println("Enter details for " + NUM_STUDENTS + " students:");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter ID: ");
            String id = scanner.nextLine();
            students[i] = new Student(name, id);
        }
    }

    // Task 2: Read scores for 5 subjects for each student
    public void readScores() {
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Enter scores for " + students[i].getName() + " (ID: " + students[i].getId() + "):");
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                System.out.print("Enter score for " + SUBJECTS[j] + " (0-100): ");
                double score = scanner.nextDouble();
                // Validate score
                while (score < 0 || score > 100) {
                    System.out.print("Invalid score! Enter score for " + SUBJECTS[j] + " (0-100): ");
                    score = scanner.nextDouble();
                }
                students[i].setScore(j, score);
            }
            scanner.nextLine(); // Clear buffer
        }
    }

    // Task 3: Calculate average grade based on Strathmore University grading system
    public double calculateAverage(Student student) {
        double total = 0;
        for (double score : student.getScores()) {
            total += score;
        }
        return total / NUM_SUBJECTS;
    }

    public String getGrade(double average) {
        if (average >= 70) return "A";
        else if (average >= 60) return "B";
        else if (average >= 50) return "C";
        else if (average >= 40) return "D";
        else return "F";
    }

    public String getRecommendation(String grade) {
        switch (grade) {
            case "A": return "Excellent";
            case "B": return "Good";
            case "C": return "Satisfactory";
            case "D": return "Poor";
            default: return "Very Poor";
        }
    }

    // Task 4: Display report card
    public void displayReportCard() {
        LocalDate currentDate = LocalDate.now(); // Current date (March 25, 2025)
        for (Student student : students) {
            System.out.println("\n===== REPORT CARD =====");
            System.out.println("a. Name: " + student.getName());
            System.out.println("b. ID: " + student.getId());
            System.out.println("c. Subjects and Scores:");
            for (int i = 0; i < NUM_SUBJECTS; i++) {
                System.out.println("   " + SUBJECTS[i] + ": " + student.getScores()[i]);
            }
            double average = calculateAverage(student);
            String grade = getGrade(average);
            System.out.println("d. Average Score: " + average);
            System.out.println("   Grade: " + grade);
            System.out.println("e. Recommendation: " + getRecommendation(grade));
            System.out.println("f. Date Viewed: " + currentDate);
            System.out.println("======================\n");
        }
    }

    // Main method to run the system
    public void run() {
        readStudentDetails(); // Task 1
        readScores();         // Task 2
        displayReportCard();  // Task 4 (Task 3 is called within this)
    }
}

public class ExaminationProcessingSystem {
    public static void main(String[] args) {
        ExaminationSystem system = new ExaminationSystem();
        system.run();
    }
}