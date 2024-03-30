/*
Nama             : Nur Bakti Widjaya
Nim              : 13020220134
Kelas            : A4
Soal            : Modul 4, No 3.
Tanggal Pengerjaan : Sabtu, 30 Maret 2024
*/
package Evaluasi.HitungNilai;

public class HitungNilaiAkhir {
    public class NilaiMahasiswa {
    private int tugas1;
    private int tugas2;
    private int mid;
    private int uas;

    // Method untuk menghitung nilai rata-rata tugas
    public double nilaiTugas(int tugas1, int tugas2) {
        return (tugas1 + tugas2) / 2.0; // Menggunakan 2.0 untuk memastikan hasilnya bertipe double
    }

    // Method untuk menghitung nilai akhir
    public double nilaiAkhir(double tugas, int mid, int uas) {
        return (tugas * 0.4) + (mid * 0.3) + (uas * 0.3);
    }

    // Getter dan setter lainnya...
}

}
