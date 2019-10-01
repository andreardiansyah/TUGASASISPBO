/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.util.Scanner;
public class TesBuku {
public static void main(String[]args){    


Scanner input = new Scanner(System.in);
    System.out.println("______________________________________________________________________");    
    System.out.println("Nama Pengarang :");
    String namaPengarang = input.nextLine();
    System.out.println("Judul Buku\t\t :");
    String judulBuku = input.nextLine();
    System.out.println("Tahun Terbit\t :");
    int tahunTerbit = input.nextInt();
    System.out.println("Cetakan Ke\t\t :");
    int cetakanKe = input.nextInt();
    System.out.println("Harga Jual\t\t :");
    double hargaJual = input.nextDouble();
    System.out.println("______________________________________________________________________");    

Buku B1 = new Buku();
B1.setnamaPengarang(namaPengarang);
B1.setjudulBuku(judulBuku);
B1.settahunTerbit(tahunTerbit);
B1.setcetakanKe(cetakanKe);
B1.sethargaJual(hargaJual);
    B1.info();
}    
}
