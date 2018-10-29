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
public class DetectiveCilik extends Tokoh{
    public DetectiveCilik(String nama, String peran) {
       super(nama,peran);
    }
  
    
    public void tampilDetective(){
        
        DetectiveCilik dc = new DetectiveCilik("Conan Edogawa","Detective Cilik");
        System.out.println(dc.peran);
        System.out.println("1. "+dc.nama);
        System.out.println("2. Yoshida Ayumi, teman dari "+dc.nama);
        System.out.println("3. Tsuburaya Mitsuhiko, teman Conan Edogawa yang"
                + " pintar dan juga menyukai teknologi ");
        System.out.println("4. Haibara Ai, seorang anggota Black Organitation"
                + " yang berkhianat pada organisasi tersebut setelah kakaknya"
                + " dibunuh oleh Black Organitation. Pencipta APTX 4869. "
                + "Setelah meminum APTX 4869, Haibara Ai tinggal bersama"
                + "Professor Agasa. Mengetahui identitas asli Conan");
        System.out.println("5. Kojima Genta, pendiri "+dc.peran);     
        
    }
}
