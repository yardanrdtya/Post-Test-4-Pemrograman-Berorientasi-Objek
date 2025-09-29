/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class jadwalolahraga extends jadwal implements printable {
    private String intensitas;
    
    public jadwalolahraga(String jenis, String durasi, String hari, String intensitas) {
        super(jenis, durasi, hari);
        this.intensitas = intensitas;
    }

    public String getIntensitas() { return intensitas; }
    public void setIntensitas(String intensitas) { this.intensitas = intensitas; }

    @Override
    public String tampilkanInfo() {
        return getJenis() + " | " + getDurasi() + " | " + getHari() + " | Intensitas: " + intensitas;
    }
    
     // Implementasi dari interface
    @Override
    public String print() {
        return "[Print Jadwal Olahraga] " + tampilkanInfo();
    }
}
