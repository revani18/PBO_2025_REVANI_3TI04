/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum03_array;

/**
 *
 * @author Pongo
 */
public class Siswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object[][] data = {
            {"Fawwaz", 19, 55.5f}, // String, int, float 
            {"Inaya", 13, 40.2f},
            {"Firda", 11, 45.3f}
        };
        System.out.println("Nama\tUmur\tBerat Badan");
        System.out.println("----------------------------");
        for (int i = 0; i < data.length; i++) {
            String nama = (String) data[i][0];
            int umur = (int) data[i][1];
            float berat_badan = (float) data[i][2];
            System.out.println(nama + "\t" + umur + "\t" + berat_badan);
        }
    }    
}
