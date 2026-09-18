package org.classes;

public class Main {
    static void main() {

        Student[] students= {
                new Student("Ana", 20, 4.2F),
                new Student("Juan", 22, 3.8F),
                new Student("Carlos", 21, 4.5F)
        };

        System.out.println("--- Información Inicial ---");
        for (Student student : students) {
            student.print();
        }

        students[1].setAverege(3.1F);

        System.out.println("\n--- Después de modificar a Juan ---");
        students[1].print();
    }
}
