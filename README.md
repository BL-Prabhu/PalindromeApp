# 🚀 Palindrome Checker App

The Palindrome Checker App is a console-based Java application designed to validate whether a given string is a palindrome using multiple approaches.
This project strengthens core Java fundamentals, string handling, and data structure concepts through progressive use cases.

---

## 🔹 UC7: Deque-Based Optimized Palindrome Check

### 🎯 Objective

To determine whether a given string is a palindrome using a Deque (Double Ended Queue).
This approach compares characters from both ends efficiently without reversing the string.

---

### 🔄 Application Flow

1. Program starts
2. Input string is declared and initialized
3. A Deque<Character> is created
4. Each character is inserted into the deque
5. First and last characters are removed
6. Removed characters are compared
7. Process continues until all characters are checked
8. If all characters match, it is a palindrome
9. Result is displayed on the console
10. Program exits

---

### 🧠 Key Concepts Used

- Deque Data Structure  
  A Double Ended Queue that allows insertion and deletion from both front and rear.

- addLast() Operation  
  Inserts characters at the rear of the deque.

- removeFirst() Operation  
  Removes characters from the front of the deque.

- removeLast() Operation  
  Removes characters from the rear of the deque.

- Bidirectional Comparison  
  Enables direct comparison of first and last characters efficiently.

- Optimized Approach  
  Eliminates the need for separate reversal structures like Stack.

- Time Complexity Awareness  
  Time Complexity: O(n)  
  Space Complexity: O(n)

- Console Output  
  System.out.println() is used to display results.

---

### 🧩 Data Structure Used

- Deque<Character>

---

### ▶️ Sample Input and Output

Input:
refer

Output:
Input : refer
Is Palindrome? : true

---

### ⚙️ How to Compile and Run

Compile:
javac UseCase7PalindromeCheckerApp.java

Run:
java UseCase7PalindromeCheckerApp

---

### 📚 Learning Outcome

- Understanding Deque and Double Ended Queue concept
- Learning bidirectional traversal
- Comparing front and rear elements efficiently
- Writing optimized palindrome validation logic
- Strengthening Java collections knowledge
