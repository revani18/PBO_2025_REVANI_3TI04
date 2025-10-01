/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum01;

/**
 *
 * @author Pongo
 */
public class Piramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tinggi = 12;

        for (int i = 1; i <= tinggi; i++) {
            // Hitung jumlah bintang tiap baris (ganjil: 1,3,5,...)
            int jumlahBintang = 2 * i - 1;

            // Cetak spasi di depan agar berbentuk piramid
            for (int spasi = tinggi - i; spasi > 0; spasi--) {
                System.out.print(" ");
            }

            // Cetak bintang sesuai jumlahBintang
            for (int b = 1; b <= jumlahBintang; b++) {
                System.out.print("*");
            }

            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
    
}
