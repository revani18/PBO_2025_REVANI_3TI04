/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum01;

/**
 *
 * @author Pongo
 */
public class HitungGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 1. Data nilai numerik dalam array
        int[] nilai = {88, 26, 67, 92, 55, 49};

        // 2. Loop untuk cek setiap nilai
        for (int i = 0; i < nilai.length; i++) {
            int n = nilai[i];
            String grade;

            if (n >= 90 && n <= 100) {
                grade = "A";
            } else if (n >= 80 && n <= 89) {
                grade = "B";
            } else if (n >= 56 && n <= 79) {
                grade = "C";
            } else if (n >= 40 && n <= 55) {
                grade = "D";
            } else if (n >= 0 && n <= 39) {
                grade = "E";
            } else {
                grade = "Nilai tidak valid"; // jika di luar 0–100
            }

            // Cetak hasil
            System.out.println("Nilai " + n + " = Grade " + grade);
        }
    }
    
}
