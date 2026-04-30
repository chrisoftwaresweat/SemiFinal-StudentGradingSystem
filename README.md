# 🎓 Student Grading System (Java)

![Java](https://img.shields.io/badge/Language-Java-orange)
![Status](https://img.shields.io/badge/Status-Semifinal%20Exam-blue)
![Level](https://img.shields.io/badge/Level-Beginner-blue)
![Type](https://img.shields.io/badge/Type-Academic-lightgrey)
![Concept](https://img.shields.io/badge/Concept-Arrays%20%26%20Loops-yellow)

---

## 📌 Overview  
This project is a **Semifinal Major Coding Exam** in Java, where the objective is to build a **student grading system** using fundamental programming concepts.

It calculates the **average grade** of students based on three subjects: **English, Math, and Science**, using **arrays and loops**.

📍 **Purpose of this repository:**  
To serve as a **learning reference for classmates**, especially for those who struggled with the exam, and to demonstrate a clear and working solution.

---

## 🎯 My Goal  
- 💼 Apply my current programming skills in a real exam scenario  
- 🧠 Prove my understanding of **arrays, loops, and data handling**  
- 🚀 Build a foundation for more advanced systems in the future  

---

## ✨ Features  
- 👥 Dynamic number of students  
- 📚 Accepts grades for 3 subjects (English, Math, Science)  
- 🧮 Automatically computes average grade  
- 🔁 Uses loops for efficient data handling  
- 📊 Displays organized student report  
- 🧾 Clean and readable output  

---

## 🧠 How It Works  
1. User inputs number of students  
2. Store data using arrays:
   - `String[]` → student names  
   - `double[]` → subject grades  
3. For each student:
   - Input name  
   - Input grades (English, Math, Science)  
4. Compute average:
   - `(English + Math + Science) / 3`  
5. Display all student records  

---

## 🖥️ Demo (Sample Run)

```bash
Number of students: 2

Enter the name of student 1: Chris
English grade: 90
Math grade: 95
Science grade: 92

Enter the name of student 2: Rain
English grade: 88
Math grade: 91
Science grade: 87

---Student Grades---
Student 1
Name: Chris
English: 90.0
Math: 95.0
Science: 92.0
Average: 92.33

Student 2
Name: Rain
English: 88.0
Math: 91.0
Science: 87.0
Average: 88.67
```
---

## ⚙️ Code Structure

String[] studentName → stores student names
double[] englishGrade → stores English grades
double[] mathGrade → stores Math grades
double[] scienceGrade → stores Science grades
double[] averageGrade → stores computed averages
for loop → handles input and output
Scanner → user input handling

---

## 🧾 Core Formula

averageGrade[i] = (englishGrade[i] + mathGrade[i] + scienceGrade[i]) / 3;

---

## ⚠️ Limitations

❌ No input validation (accepts invalid values)
❌ Limited to 3 subjects only
❌ No grading remarks (e.g., pass/fail)
❌ Console-based only
❌ No data saving

---

## 🔮 Future Improvements

📊 Add grade remarks (Pass/Fail, With Honors)
📚 Allow dynamic number of subjects
🚫 Add input validation (0–100 only)
💾 Save student records to file (CSV/Text)
🖥️ GUI version (Java Swing / JavaFX)
📈 Ranking system (Top students)

---

## 🚀 How to Run
javac Main.java  
java Main

---

## 👨‍💻 Author
Christian A. Gulfan

Aspiring Software Developer 🚀

---

## 💡 Insight

This project represents more than just an exam — it shows how simple logic can be turned into a functional system, and how foundational skills like arrays and loops are essential in real-world programming.

---

## 💬 Quote

“Understanding the basics is what separates passing code from powerful code.” 💡
