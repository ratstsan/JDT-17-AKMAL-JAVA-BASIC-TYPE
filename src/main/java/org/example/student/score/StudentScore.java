package org.example.student.score;

public class StudentScore {



    public void getScore() {

            String[] nama = {
                    "Andi", "Budi", "Cici", "Dedi", "Eka", "Fani", "Gita", "Hadi",
                    "Indah", "Joko", "Kiki", "Lani", "Mega", "Niko", "Oki", "Putri"
            };


            int[] nilai = {
                    95, 88, 76, 65, 91, 41, 64, 86, 42, 39, 100, 100, 76, 34, 89, 94
            };


            for (int i = 0; i < nilai.length; i++) {
                String status;

                if (nilai[i] == 100) {
                    status = "jago banget";
                } else if (nilai[i] >= 90) {
                    status = "belum jago banget tapi jago aja";
                } else if (nilai[i] >= 70) {
                    status = "b aja";
                } else {
                    status = "perlu belajar lagi";
                }

                System.out.println(nama[i] + " -> Nilai: " + nilai[i] + " (" + status + ")");

        }
    }
}