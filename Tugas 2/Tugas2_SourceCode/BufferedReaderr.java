/*Nama : Nur Bakti Widjaya
Nim : 13020220134
 */

import java.io.*;
public class BufferedReaderr {
    public static void main(String[] args)throws IOException {

        BufferedReader Bufrdr = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\n");

        //input data oleh user
        System.out.println("--Silahkan Input Data Mahasiswa--");
        System.out.print("Nim      : ");
        String Nim = Bufrdr.readLine();
        System.out.print("Nama     : ");
        String Nama = Bufrdr.readLine();
        System.out.print("Jurusan  : ");
        String Jurusan = Bufrdr.readLine();
        System.out.print("Fakultas : ");
        String Fakultas = Bufrdr.readLine();
        
        System.out.println("\n");

        //output dari inputan oleh user
        System.out.println("--Data Mahasiswa--");
        System.out.println("Nim      : "+ Nim);
        System.out.println("Nama     : "+ Nama);
        System.out.println("Jurusan  : "+ Jurusan);
        System.out.println("Fakultas : "+ Fakultas);

        Bufrdr.close();
    }
}