package com.proftelran.org.lessonten;

public class CompareExample {
    public static void main(String[] args) {
        int a = 7;
        int b = 7;
        boolean isEqual = a == b;

        System.out.println("primitive a == b " + isEqual);

        int c = 7;
        Integer d = new Integer(7); //Integer.valueOf(d);
        boolean isEqualsWithObject = c == d;

        System.out.println("Object and primitive c == d " + isEqualsWithObject);

        Integer e = Integer.valueOf(100);
        Integer w = Integer.valueOf(100);
        // -128 - 127
        System.out.println("Object == object " + (e == w));

    }
}
