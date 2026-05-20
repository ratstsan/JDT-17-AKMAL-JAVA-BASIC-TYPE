package org.example.data.number.convertion;

public class KonversiTipeDataNumber {

    public void getTipeData() {
        byte byteValue = 10;
        int intValue = byteValue;
        double doubleValue = intValue;

        System.out.println("Widening Casting:");
        System.out.println("byte -> int = " + intValue);
        System.out.println("int -> double = "+ doubleValue);

        //Narrowing casting normal
        double nilaiDouble = 9.78;
        int nilaiINt = (int) nilaiDouble;
        byte nilaiByte = (byte) nilaiINt;

        System.out.println();
        System.out.println("Narrowing Casting");
        System.out.println("double -> int = " + nilaiINt);
        System.out.println("int -> byte = " + nilaiByte);
    }
}
