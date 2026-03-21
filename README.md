# ☕ Java Learning Notes — W3Util

A structured collection of Java examples I built while learning through [W3Schools Java Tutorial](https://www.w3schools.com/java/).  
Each file focuses on a single concept, making it easy to look up and review specific topics.

---

## 📁 Project Structure

```
src/main/java/com/victor/utilities/
│
├── Tutorial/               # Entry-level syntax and for-each loops
├── Classes/                # Object-Oriented Programming (OOP) fundamentals
├── DataStructures/         # Java Collections Framework + Algorithms
├── Advanced/               # Threads, Generics, Lambda, Regex, Annotations
├── FileHandling/           # File I/O using java.io.File
└── IOStreams/              # Byte & character stream I/O
```

---

## 📚 Topics Covered

### 🔷 Classes (OOP)
Core object-oriented concepts with hands-on examples:
- **Inheritance** — `extends` keyword, parent/child class relationships
- **Polymorphism** — method overriding, runtime dispatch
- **Encapsulation** — `private` fields with getters/setters
- **Abstraction** — `abstract` classes and interfaces
- **`super` & `this`** — referencing parent class and current instance
- **Inner Classes** — static, non-static, anonymous inner classes
- **Interfaces** — `implements`, default methods

### 🔷 Data Structures
Java Collections Framework in depth:

| Category | Classes Covered |
|----------|----------------|
| **List** | `ArrayList`, `LinkedList`, sorting with `Comparator` |
| **Set** | `HashSet`, `LinkedHashSet`, `TreeSet` |
| **Map** | `HashMap`, `LinkedHashMap`, `TreeMap` |
| **Iterator** | Iterating and removing elements safely |
| **Algorithms** | Binary search, sorting via `Collections` utility |

### 🔷 Advanced
- **Threads** — extending `Thread`, implementing `Runnable`, concurrency basics
- **Generics** — type-safe methods and classes, bounded type parameters
- **Lambda Expressions** — functional interfaces and concise syntax
- **Regular Expressions** — pattern matching with `java.util.regex`
- **Wrapper Classes** — autoboxing/unboxing, `Integer`, `Double`, `Character`
- **Annotations** — built-in annotations (`@Override`, `@Deprecated`, etc.)

### 🔷 File Handling (`java.io.File`)
- Create, read, write, append, and delete files
- Delete folders, retrieve file metadata

### 🔷 I/O Streams
- `FileInputStream` / `FileOutputStream` — raw byte stream
- `BufferedReader` / `BufferedWriter` — efficient character stream
- File copy using byte-by-byte stream transfer

---

## 🛠 Tech Stack

- **Language**: Java
- **Build Tool**: Maven
- **IDE**: IntelliJ IDEA

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/VictorLu2/W3Util.git
   ```
2. Open the project in IntelliJ IDEA (or any Java IDE).
3. Navigate to any file under `src/main/java/` and run its `main` method directly.

> Each file is self-contained — no dependencies between files.

---

## 🎯 Purpose

This repository serves as my personal Java reference and learning log.  
Rather than keeping notes in a doc, I prefer writing runnable code — it's easier to revisit, test, and actually remember.

---

## 📌 What's Next

- [ ] Add examples for Java Streams API
- [ ] Add exception handling examples
- [ ] Build a small CLI project combining Collections + File I/O
