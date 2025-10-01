/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum01;

/**
 *
 * @author Pongo
 */
public class Operasi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 2. Deklarasi variabel rad1 bertipe float bernilai 14.0
        float rad1 = 14.0f;
        
        // 3. Deklarasi variabel luas1 dan luas2 bertipe float
        float luas1, luas2;
        
        // 4. Hitung luas1 dengan rumus 22f/7 * rad1 * rad1
        luas1 = 22f / 7 * rad1 * rad1;
        
        // 5. Hitung luas2 dengan rumus rad1 * rad1 * 22 / 7
        luas2 = rad1 * rad1 * 22 / 7;
        
        // 6. Cetak luas1 dan luas2
        System.out.println("Luas1 = " + luas1);
        System.out.println("Luas2 = " + luas2);
        
        // 7. Deklarasi variabel kecilDari sebagai hasil perbandingan luas1 < luas2
        boolean kecilDari = luas1 < luas2;
        
        // Cetak hasil perbandingan
        System.out.println("Apakah luas1 < luas2? " + kecilDari);
    }
    
}
