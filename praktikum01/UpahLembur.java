/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum01;

/**
 *
 * @author Pongo
 */
public class UpahLembur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Salahnya karena menggunakan int sehingga hasil pembagian 15/8 dibulatkan jadi 1.
        // Selisihnya adalah Rp 1.050.000.
        double jam_kerja_perhari = 8;
        double gaji_perhari = 1200000;
        double jam_lembur = 15;

        double upah_lembur = jam_lembur / jam_kerja_perhari * gaji_perhari;

        System.out.println("Upah lembur: Rp " + upah_lembur);
    }
    
}
