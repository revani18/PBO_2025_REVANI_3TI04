/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum02;

/**
 *
 * @author Pongo
 */
public class Belanja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi dan inisial variabel
        String pelanggan = "Budi Santoso";
        double totalBelanja = 150000;
        String keterangan;
        // struktur kendali if
        if (totalBelanja > 100000){
            keterangan = "Selamat Anda mendapat Hadiah";
        }else{
            keterangan = "Terima kasih sudah berbelanja";
        }
        System.out.println(keterangan);
    }
    
}
