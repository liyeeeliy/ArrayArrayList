/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Nama : Mauliya Rahmi
 * NPM  : 2410010267
 */
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        // --- Array String berisi minimal 3 Mata Kuliah ---
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Struktur Data", "Basis Data"};
        
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // Membuat objek pengelola kelas
        KelasKuliah kelas = new KelasKuliah();

        // --- Menambahkan minimal 5 Mahasiswa ---
        kelas.tambahMahasiswa(new Mahasiswa("Kawai Ruka", "23100101", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Pharita", "23100102", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Jung Ahyeon", "23100103", 72.0));
        kelas.tambahMahasiswa(new Mahasiswa("Lee Haram", "23100104", 45.5));
        kelas.tambahMahasiswa(new Mahasiswa("Aliya Liy", "23100105", 90.0));

        // Menampilkan data mahasiswa awal
        System.out.println("=== DATA MAHASISWA AWAL ===");
        kelas.tampilkanSemua();
        System.out.println("Jumlah mahasiswa awal: " + kelas.getJumlahMahasiswa());
        System.out.println();

        // --- Menampilkan Rata-rata dan Jumlah Lulus ---
        System.out.println("=== STATISTIK KELAS ===");
        System.out.printf("Rata-rata Nilai Kelas   : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus  : " + kelas.jumlahLulus() + " orang");
        System.out.println();

        // --- Menambahkan 1 Mahasiswa Baru & Tampilkan Jumlah Terbaru ---
        System.out.println("=== UPDATE DATA KELAS ===");
        System.out.println("-> Menambahkan 1 mahasiswa baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "23100106", 65.0));
        
        // Tampilkan kembali jumlah data terbaru
        System.out.println("Jumlah data mahasiswa terbaru: " + kelas.getJumlahMahasiswa() + " orang");
        System.out.println();
        
        // Cetak ulang tabel untuk memastikan data baru masuk
        System.out.println("=== DATA MAHASISWA TERBARU ===");
        kelas.tampilkanSemua();
    }
}