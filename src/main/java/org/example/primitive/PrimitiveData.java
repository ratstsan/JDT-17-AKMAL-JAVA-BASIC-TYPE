package org.example.primitive;

public class PrimitiveData {
    public void getPrimitive(){
        char huruf = 'A';
        char angka = '7';
        char simbol = '#';
        char spasi = ' ';

        System.out.println("Huruf : " + huruf);
        System.out.println("Angka : " + angka);
        System.out.println("Simbol : " + simbol);
        System.out.println("Spasi : [" + spasi + "]");

        char newline = '\n';
        char tab = '\t';
        char quote = '\'';

        System.out.println("Escape Sequence :");
        System.out.println("Baris 1 " + newline + "baris 2");
        System.out.println("kolom 1 " + tab + "kolom 2");
        System.out.println("tanda kutip" + quote);

    }
}
