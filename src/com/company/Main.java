package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteVal = 7;
        short shortVal = 7;
        float floatVal = 3.0f;
        double doubleVal = 5.0d;
        long longVal = 5;


        short result = (short) longVal;
        short result2 = (short)(byteVal-longVal);
        float result3 = longVal - floatVal;
        long result4 =(long) (shortVal - longVal + floatVal + doubleVal);
        System.out.println("success");

    }
}
