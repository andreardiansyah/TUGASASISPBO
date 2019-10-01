/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Buku {
private String namaPengarang;
private String judulBuku;
private int tahunTerbit;
private int cetakanKe;
private double hargaJual;

Buku(){    
}

public String getnamaPengarang(){
return namaPengarang;    
}

public void setnamaPengarang(String namaPengarang){
this.namaPengarang = namaPengarang;    
}

public String getjudulBuku(){
return judulBuku;    
}

public void setjudulBuku(String judulBuku){
this.judulBuku = judulBuku;    
}

public int gettahunTerbit(){
return tahunTerbit;    
}

public void settahunTerbit(int tahunTerbit){
this.tahunTerbit = tahunTerbit;    
}

public int getcetakanKe(){
return cetakanKe;    
}

public void setcetakanKe(int cetakanKe){
this.cetakanKe = cetakanKe;    
}

public double gethargaJual(){
return hargaJual;    
}

public void sethargaJual(double hargaJual){
this.hargaJual = hargaJual;    
}

Buku(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanKe, double hargaJual){
this.namaPengarang = namaPengarang;
this.judulBuku = judulBuku;
this.tahunTerbit = tahunTerbit;
this.cetakanKe = cetakanKe;
this.hargaJual = hargaJual;
}

public void info(){
    System.out.println("______________________________________________________________________");    
    System.out.println("INFORMASI BUKU :");
    System.out.println("Nama Pengarang :" + this.getnamaPengarang());
    System.out.println("Judul Buku     :" + this.getjudulBuku());
    System.out.println("Tahun Terbit   :" + this.gettahunTerbit());    
    System.out.println("Cetakan Ke     :" + this.getcetakanKe());
    System.out.println("Harga Jual     :" +this.gethargaJual());
    System.out.println("______________________________________________________________________");
}
}

