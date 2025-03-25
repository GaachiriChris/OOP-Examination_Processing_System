# OOP-Examination_Processing_System
This project was carried out by:
1. **Gachiri Chris** - 175851,
2. **Bennedict Muchiri** - ,
3. **Francis Njoki**- 130999, 
- The code is designed to meet the specified requirements while following object-oriented programming principles.

## Overview
This project is an Examination Processing System developed in Java for a university department. It processes the details of 10 students, including their names, IDs, and scores in 5 subjects. The program calculates the average grade based on the Strathmore University grading system and generates a report card for each student, showing their name, ID, subject scores, average score, grade, recommendation, and the date the report is viewed.

## Project Requirements
This project was developed as a semester project with the following requirements:
1. **Read Student Details**: Collect the name and ID of at least 10 students.
2. **Record Scores**: Allow score entry for at least 5 subjects per student.
3. **Calculate Grades**: Compute the average grade using the Strathmore University grading system.
4. **Generate Report Card**: Display a report card for each student, including:
   - Name of the student
   - ID number of the student
   - All subjects and their scores
   - Average score and the grade attained
   - A recommendation (e.g., good, poor, excellent)
   - The date the report is viewed
5. **Use Methods**: Implement each task (1 to 4) using separate methods.

## Strathmore University Grading System 
The grading system used in this project is based on the following scale:
- 70–100: A (Excellent)
- 60–69: B (Good)
- 50–59: C (Satisfactory)
- 40–49: D (Pass)
- Below 40: F (Fail)

Recommendations are provided as follows:
- A: Excellent
- B: Good
- C: Satisfactory
- D: Poor
- F: Very Poor

## How to Run the Program
1. **Run the program**
2. **Follow the prompts to enter student details and scores.**
3. **The program will generate a report card for each student.**

## Project Structure
- `ExaminationProcessingSystem.java`: The main Java file containing the program logic, including the `Student` and `ExaminationSystem` classes.
- `README.md`: This file, providing an overview of the project.

## Notes
- The date displayed in the report card is set to the current date (e.g., March 25, 2025, as per the project context).
- The program includes input validation to ensure scores are between 0 and 100.
