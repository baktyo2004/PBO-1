/*Nama : Nur Bakti Widjaya
Nim : 13020220134
 */

import java.util.Scanner;
public class Scannerr {
    public static void main(String[] args) {

        String Nim, Nama, Jurusan, Fakultas;
        Scanner Scan = new Scanner(System.in);

        System.out.println("\n");

        //input data oleh user
        System.out.println("--Silahkan Input Data Mahasiswa--");
        System.out.print("Nim      : ");
        Nim = Scan.nextLine();
        System.out.print("Nama     : ");
        Nama = Scan.nextLine();
        System.out.print("Jurusan  : ");
        Jurusan = Scan.nextLine();
        System.out.print("Fakultas : ");
        Fakultas = Scan.nextLine();

        System.out.println("\n");

        //output dari inputan oleh user
        System.out.println("--Data Mahasiswa--");
        System.out.println("Nama     : "+ Nim);
        System.out.println("Nim      : "+ Nama);
        System.out.println("Jurusan  : "+ Jurusan);
        System.out.println("Fakultas : "+ Fakultas);

        Scan.close();
    }
}