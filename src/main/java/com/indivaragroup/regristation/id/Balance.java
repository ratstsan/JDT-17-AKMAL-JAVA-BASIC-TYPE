package com.indivaragroup.regristation.id;

public class Balance {

    //challenge
    // gw punya uang 10ribu
    // klo saya punya uang 10ribu berarti saya harus buat ktp
    //klo saya harus buat ktp brarti saya harus bayar uang sebesar 5ribu
    //buatkan kondisi if else nya yang terjadi dari poin 1 2 dan 3
    //hitung total pengurangan
    //hint gunakan aritmatika operator


    public void getMoney() {
        int uang = 10000;
        boolean buatKtp = false;


        if (uang == 10000) {
            buatKtp = true;
            System.out.println("Uang anda 10ribu Wajib buat KTP");
        } else {
            buatKtp = false;
            System.out.println("Anda tidak perlu buat KTP");
        }
        if (buatKtp) {
            int biayaKtp = 5000;
            uang = uang - biayaKtp;
            System.out.println("Biaya KTP: " + biayaKtp);
        }
        System.out.println("Sisa uang anda sekarang: " + uang);
    }
}
