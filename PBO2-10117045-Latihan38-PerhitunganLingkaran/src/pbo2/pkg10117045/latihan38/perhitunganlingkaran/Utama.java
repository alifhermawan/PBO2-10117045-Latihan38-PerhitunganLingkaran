/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117045.latihan38.perhitunganlingkaran;

/**
 * @author 
 * NAMA     : Alif Hermawan
 * KELAS    : PBO2 
 * NIM      : 10117045
 * Deskripsi Program : Program ini bserisi perintah untuk menampilkan nilai 
 * jari-jari, luas, dan keliling lingkaran sesuai dengan diameter yang dimasukan
 *
 */
public class Utama {

    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
}
