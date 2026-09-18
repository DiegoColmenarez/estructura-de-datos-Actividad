package org.classes;

public class Student {
    private String name;
    private int age;
    private float averege;

    public Student(String name, int age, float averege){
        this.name = name;
        this.age = age;
        this.averege = averege;
    }

    public void print() {
        System.out.println(name + " | Edad: " + age + " | Promedio: " + averege);
    }

    public void setAverege(float averege) {
        this.averege = averege;
    }
}
