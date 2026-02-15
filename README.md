# 🚀 Palindrome Checker App

The Palindrome Checker App is a console-based Java application designed to validate whether a given string is a palindrome using multiple approaches.
This project strengthens core Java fundamentals, string handling, and data structure concepts through progressive use cases.

---

## 🔹 UC8: Linked List Based Palindrome Check

### 🎯 Objective

To determine whether a given string is a palindrome using a LinkedList data structure.
This approach uses LinkedList’s ability to remove elements from both ends efficiently.

---

### 🔄 Application Flow

1. Program starts
2. Input string is declared and initialized
3. A LinkedList<Character> is created
4. Each character is added to the LinkedList
5. First and last characters are removed
6. Removed characters are compared
7. Process continues until all characters are checked
8. Result is displayed on the console
9. Program exits

---

### 🧠 Key Concepts Used

- LinkedList Data Structure  
  A dynamic structure that allows efficient insertion and deletion.

- add() Operation  
  Inserts characters into the LinkedList.

- removeFirst() Operation  
  Removes characters from the beginning.

- removeLast() Operation  
  Removes characters from the end.

- Bidirectional Comparison  
  Enables palindrome validation efficiently.

- Optimized Logic  
  No separate reversal needed.

- Time Complexity Awareness  
  Time Complexity: O(n)  
  Space Complexity: O(n)

- Console Output  
  System.out.println() is used to display results.

---

### 🧩 Data Structure Used

- LinkedList<Character>

---

### ▶️ Sample Input and Output

Input:
level

Output:
Input : level
Is Palindrome? : true

---

### ⚙️ How to Compile and Run

Compile:
javac UseCase8PalindromeCheckerApp.java

Run:
java UseCase8PalindromeCheckerApp

---

### 📚 Learning Outcome

- Understanding LinkedList structure
- Learning double-ended operations
- Efficient palindrome validation
- Strengthening Java collections knowledge
