/*
Nama             : Nur Bakti Widjaya
Nim              : 13020220134
Kelas            : A4
Soal            : Modul 3, No 3.
Tanggal Pengerjaan : Sabtu, 30 Maret 2024
*/

package pertemuan2.modul3;

import java.util.Scanner;
public class TestNilai {
    public static void main(String[] args) {
        HitungRata hitung = new HitungRata();
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Data : ");
        int banyakData = input.nextInt();
        int nilai[] = new int[banyakData];
        int pilihan;
        
        System.out.println("Menu:");
        System.out.println("1. Input Nilai");
        System.out.println("2. Input Nilai Baru");
        System.out.print("Pilih menu: ");
        pilihan = input.nextInt();
        
        switch(pilihan) {
            case 1:
                System.out.println("Masukkan Nilai : ");
                hitung.inputNilai(nilai);
                System.out.println("\nDaftar Nilai : ");
                hitung.cetakNilai(nilai);
                System.out.println("Rata Nilai       : " + hitung.rataNilai(banyakData));
                break;
            case 2:
                System.out.println("Masukkan Nilai Baru : ");
                hitung.inputNilaiBaru(banyakData);
                System.out.println("Daftar Nilai Baru   : ");
                hitung.cetakNilaiBaru();
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
