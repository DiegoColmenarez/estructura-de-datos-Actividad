package org.records;

public record Student(String name, int age, float averege ) {

    public static void print(Student[] students){
        System.out.println("--- Datos Iniciales ---");
        for (Student student : students) {
            System.out.println(student.name+ " | Edad: " + student.age + " | Promedio: " + student.averege);
        }
    }
}
