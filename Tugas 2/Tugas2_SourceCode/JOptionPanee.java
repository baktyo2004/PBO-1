/*Nama : Nur Bakti Widjaya
Nim : 13020220134
 */

import javax.swing.*;
public class JOptionPanee {
    public static void main(String[] args) {

       //input data oleh user
       String Nim = JOptionPane.showInputDialog("Nim: ");
       String Nama = JOptionPane.showInputDialog("Nama: ");
       String Jurusan = JOptionPane.showInputDialog("Jurusan: ");
       String Fakultas = JOptionPane.showInputDialog("Fakultas: ");

       // Output dari inputan oleh user
       System.out.println("--Data Mahasiswa--");
       System.out.println("Nim      : " + Nim);
       System.out.println("Nama     : " + Nama);
       System.out.println("Jurusan  : " + Jurusan);
       System.out.println("Fakultas : " + Fakultas);
    }
}