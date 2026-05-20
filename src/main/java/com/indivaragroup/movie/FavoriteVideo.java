package com.indivaragroup.movie;

import java.util.ArrayList;

public class FavoriteVideo {

    public void getMovies() {

        ArrayList<String> listCode = new ArrayList<>();

        String code1 = "STAR-4124";
        String date1 = "2025-05-04";

        String code2 = "MIDE-8211";
        String date2 = "2026-02-14";

        String code3 = "IPP-2941";
        String date3 = "2023-08-15";

        int tahun1 = Integer.parseInt(date1.substring(0, 4));
        if (tahun1 < 2026) {
            listCode.add(code1);
        }

        int tahun2 = Integer.parseInt(date2.substring(0, 4));
        if (tahun2 < 2026) {
            listCode.add(code2);
        }

        int tahun3 = Integer.parseInt(date3.substring(0, 4));
        if (tahun3 < 2026) {
            listCode.add(code3);
        }

        System.out.println(listCode);
    }
}