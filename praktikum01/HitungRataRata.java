/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum01;

/**
 *
 * @author Pongo
 */
public class HitungRataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 1. Simpan data bilangan bulat dalam array
        int[] bilangan = {1, 2, 3, 5, 6, 7, 9, 10, 23};

        // Variabel untuk menghitung jumlah total
        int jumlah = 0;

        // Gunakan loop for untuk menjumlahkan semua elemen array
        for (int i = 0; i < bilangan.length; i++) {
            jumlah += bilangan[i];
        }

        // 2. Hitung rata-rata, gunakan tipe data pecahan (double)
        double rata2 = (double) jumlah / bilangan.length;

        // Cetak hasil
        System.out.println("Jumlah elemen = " + jumlah);
        System.out.println("Banyak data = " + bilangan.length);
        System.out.println("Rata-rata = " + rata2);
    }
    
}
