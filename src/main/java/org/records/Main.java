package org.records;

public class Main {
    static void main() {
        Student[] students= {
                new Student("Ana", 20, 4.2F),
                new Student("Juan", 22, 3.8F),
                new Student("Carlos", 21, 4.5F)
        };

        Student.print(students);
    }
}
