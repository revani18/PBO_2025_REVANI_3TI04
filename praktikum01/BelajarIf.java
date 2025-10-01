/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum01;

/**
 *
 * @author Pongo
 */
public class BelajarIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 1. Variabel segitiga 1
        double alas1 = 4.7;
        double tinggi1 = 3.8;
        double luas1 = 0.5 * alas1 * tinggi1;  // rumus luas segitiga

        // 2. Variabel segitiga 2
        double alas2 = 3.7;
        double tinggi2 = 4.8;
        double luas2 = 0.5 * alas2 * tinggi2;

        // Cetak nilai luas untuk memastikan
        System.out.println("Luas segitiga 1 = " + luas1);
        System.out.println("Luas segitiga 2 = " + luas2);

        // 3. Bandingkan dengan if-else
        if (luas1 > luas2) {
            System.out.println("Segitiga 1 lebih besar");
        } else if (luas1 < luas2) {
            System.out.println("Segitiga 1 lebih kecil");
        } else {
            System.out.println("Kedua segitiga sama luas");
        }
    }
    
}
