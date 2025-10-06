/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum02;

/**
 *
 * @author Pongo
 */
public class Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nilai = 59.99f;
        String keterangan = (nilai >= 60) ? "Lulus" : "Gagal";
        System.out.println("Nilai " + nilai +
                ", dinyatakan " + keterangan);
    }
    
}
