package edu.jcourse.lesson3;

public class ArrayDemo2 {

    public static void main(String[] args) {

        int arraySize = 10;
        int a[] = new int [arraySize];

        int c = 7;

        for (int i = 0; i < a.length; i++) {
            a[i] = i * c;
        }

        for (int i = 0; i < a.length; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 7) {
                break;
            }
            System.out.println(a[i]);
        }
    }
}
