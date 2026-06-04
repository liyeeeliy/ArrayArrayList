/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

public class Mahasiswa {
    // Atribut model
    private String nama;
    private String npm;
    private double nilai;

    // Constructor untuk menginisialisasi data mahasiswa
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    // Getter untuk mengakses atribut dari luar class
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilai() {
        return nilai;
    }

    // Method untuk mengecek status kelulusan (Nilai >= 60)
    public boolean lulus() {
        return this.nilai >= 60;
    }
}