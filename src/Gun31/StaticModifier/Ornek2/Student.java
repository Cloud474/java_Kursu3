package Gun31.StaticModifier.Ornek2;

import java.util.Scanner;

public class Student {
    int id;
    static String name;
    static String surName;

    static int sayac=0;

    public Student(String name, String surName) {
        this.id = ++sayac;
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

}
