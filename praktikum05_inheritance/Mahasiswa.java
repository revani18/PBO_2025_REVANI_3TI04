/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum05_inheritance;

/**
 *
 * @author Pongo
 */
public class Mahasiswa extends Person{
    private String nim;
    private String prodi;
    private int semester;
    private float ipk;

    public Mahasiswa() {
        super();
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    @Override
    public String toString() {
        return "Mahasiswa: " + super.toString() + ", Nim: " + nim + ", Prodi: " + prodi + ", Semester: " + semester + ", IPK: " + ipk ;
    }
    
    
}
