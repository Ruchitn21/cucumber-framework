package org.example;

public class Main
{

    public static int add(int n1, int n2)
    {
        return n1+n2;
    }

    public static void main(String[] args)
    {

        System.out.println("Hello world!");
        String url = System.getProperty("user.dir");
        System.out.println(url);

        Student s1 = new Student("Ruchit",23);
        s1.admitStudent();
    }
}