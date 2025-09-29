/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class jadwalrest extends jadwal implements printable {
    public jadwalrest(String hari) {
        super("Rest Day", "-", hari);
    }

    @Override
    public String tampilkanInfo() {
        return "Hari " + getHari() + " adalah REST DAY!";
    }
    
    // Implementasi dari interface
    @Override
    public String print() {
        return "[Print Jadwal Rest] " + tampilkanInfo();
    }
}
