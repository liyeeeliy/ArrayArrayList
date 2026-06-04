/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // Menampung banyak objek Mahasiswa
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // Method menambah mahasiswa baru ke koleksi
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // Method mengembalikan jumlah mahasiswa saat ini
    public int getJumlahMahasiswa() {
        return daftarMahasiswa.size();
    }

    // Method untuk menghitung rata-rata nilai kelas
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // Method untuk menghitung jumlah mahasiswa yang lulus
    public int jumlahLulus() {
        int hitung = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                hitung++;
            }
        }
        return hitung;
    }

    // Method menampilkan semua data mahasiswa dalam tabel sederhana
    public void tampilkanSemua() {
        System.out.println("--------------------------------------------------");
        System.out.printf("%-15s %-12s %-8s %-10s\n", "NPM", "Nama", "Nilai", "Status");
        System.out.println("--------------------------------------------------");
        for (Mahasiswa mhs : daftarMahasiswa) {
            String status = mhs.lulus() ? "LULUS" : "TIDAK LULUS";
            System.out.printf("%-15s %-12s %-8.1f %-10s\n", 
                    mhs.getNpm(), mhs.getNama(), mhs.getNilai(), status);
        }
        System.out.println("--------------------------------------------------");
    }
}