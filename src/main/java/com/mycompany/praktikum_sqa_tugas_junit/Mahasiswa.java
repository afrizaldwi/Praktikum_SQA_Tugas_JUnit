/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.praktikum_sqa_tugas_junit;

/**
 *
 * @author afrizal
 */
public class Mahasiswa {

    private String nama;
    private int nilai;

    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public boolean isLulus() {
        return this.nilai >= 60;
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }
}
