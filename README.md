# 🚀 Palindrome Checker App

The Palindrome Checker App is a console-based Java application designed to validate whether a given string is a palindrome using multiple approaches.
This project strengthens core Java fundamentals, string handling, and data structure concepts through progressive use cases.

---

## 🔹 UC5: Stack-Based Palindrome Check

### 🎯 Objective

To determine whether a given string is a palindrome using a Stack data structure, leveraging its Last In First Out (LIFO) principle to reverse the string and compare characters.

---

### 🔄 Application Flow

1. Program starts
2. Input string is declared and initialized
3. A Stack<Character> is created
4. Each character of the string is pushed into the stack
5. Characters are popped from the stack in reverse order
6. Popped characters are compared with the original string
7. If all characters match, it is a palindrome
8. Result is displayed on the console
9. Program exits

---

### 🧠 Key Concepts Used

- Stack Data Structure  
  A linear data structure that follows the Last In First Out (LIFO) principle.

- Push Operation (stack.push())  
  Inserts characters into the stack.

- Pop Operation (stack.pop())  
  Removes characters from the stack in reverse order.

- String to Character Conversion  
  Using toCharArray() to iterate through individual characters.

- Palindrome Validation Logic  
  Stack reversal naturally helps compare the original and reversed sequence.

- Conditional Statements  
  Used to detect mismatched characters.

- Time Complexity Awareness  
  Time Complexity: O(n)  
  Space Complexity: O(n)

- Console Output  
  System.out.println() is used to display the result.

---

### 🧩 Data Structure Used

- Stack<Character>

---

### ▶️ Sample Input and Output

Input:
noon

Output:
Input : noon
Is Palindrome? : true

---

### ⚙️ How to Compile and Run

Compile:
javac UseCase5PalindromeCheckerApp.java

Run:
java UseCase5PalindromeCheckerApp

---

### 📚 Learning Outcome

- Understanding Stack and LIFO principle
- Applying push and pop operations
- Using Stack for reversal logic
- Strengthening Java fundamentals
- Practical implementation of data structures
