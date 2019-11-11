package edu.jcourse.lesson3;

public class MassiveArrayDemo {

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i+1);
//        }

        int arraySize = 10;
        int a[] = new int [arraySize];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
//        int myArray[] = new int[3];
//        myArray[0] = 10;
//        myArray[1] = 20;
//        myArray[2] = 30;
//
//        System.out.println(myArray[1]);

    }
}
