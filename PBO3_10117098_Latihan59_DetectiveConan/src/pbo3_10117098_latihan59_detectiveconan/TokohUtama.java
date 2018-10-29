/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan59_detectiveconan;

/**
 *
 * @author 
 * NAMA     : SANTI SUSANTI
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan daftar tokoh
 *                     dan peran di detective conan
 */
public class TokohUtama extends Tokoh{
    public TokohUtama(String nama,String peran) {
        super(nama,peran);
    }
    
    public void tampilTokohUtama(){
        
        TokohUtama tokohutama = new TokohUtama("Kudo Shinichi/Edogawa Conan,"
                ,"Tokoh Utama");
        System.out.println(tokohutama.peran);
        System.out.println("1. "+tokohutama.nama+" Detective SMU terkenal yang "
                + "mengecil setelah dipaksa meminum APTX 4869 yang dibuat oleh "
                + "Black Organitation dan tinggal bersama Mouri Ran dan membantu"
                + " Mouri Kogoro dalam memecahkan sebuah kasus");
        System.out.println("2. Mouri Ran, teman "+tokohutama.nama+" sejak kecil");
        System.out.println("3. Mouri Kogoro, Detective Swasta. Ayah dari "
                + "Ran Mouri");
    }
}
