package org.example;

public class Student
{
    int age;
    String name;

    public Student(String name, int age)
    {
        this.age = age;
        this.name = name;
    }

    public void admitStudent()
    {
        System.out.println(name + " of age "+age+" is admitted to top school");
    }
}
