Java OOP Lab - Week 10

Files:
- Student.java: Student class (fields and methods)
- StudentMain.java: ArrayList operations: add, list, average, sort, search
- Book.java: Book class with borrowing rule
- BookMain.java: creates two books and tests borrowing/returning


Compile:
    javac *.java

Run Part A:
    java StudentMain

Run Part B:
    java BookMain

Class diagrams to draw separately:

Student
--------------------
int PASS_MARK = 60
String name
int score
--------------------
boolean isPassing()
void print()
String toString()

Book
--------------------
String title
String author
boolean isBorrowed
--------------------
boolean borrowBook()
void returnBook()
void print()
