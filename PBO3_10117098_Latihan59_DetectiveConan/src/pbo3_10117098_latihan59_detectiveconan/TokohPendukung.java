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
public class TokohPendukung extends Tokoh{
    public TokohPendukung(String nama,String peran) {
        super(nama,peran);
    }
    
    public void tampilTokohPendukung(){
        
        TokohPendukung tokpen = new TokohPendukung("Hiroshi Agasa,"
                ,"Tokoh Pendukung");
        System.out.println(tokpen.peran);
        System.out.println("1. "+tokpen.nama+" Seorang Professor yang tinggal "
                + "disebelah rumah Shinichi. Menciptakan beberapa alat yang "
                + "membantu conan dalam memecahkan kasus. Mengetahui identitas "
                + "asli Conan");
        System.out.println("2. Kisaki Eri, Seorang Pengacara. Ibu dari Ran Mouri"
                + " dan istri dari Kogoro Mouri");
        System.out.println("3. Hattori Heiji, Detective SMU dari Barat. Rival "
                + "sekaligus teman dari Shinichi. Mengetahui identitas asli"
                + "Conan");
        System.out.println("4. Toyama Kazuha, berteman dengan Hattori Heiji "
                + "sejak kecil");
        System.out.println("5. Kaito Kid, seorang pencuri yang ahli sulap dan"
                + " penyamaran yang mengincar permata berharga. Mengetahui "
                + "identitas asli Conan");
        System.out.println("6. Suzuki Sonoko, bersahabat dengan Mouri Ran "
                + "sejak kecil");
        System.out.println("7. Kudo Yusaku, ayah Shinichi dan suami Kudo Yukiko");
        System.out.println("8. Kudo Yukiko, ibu Shinichi Kudo dan istri Kudo"
                + " Yusaku");
        System.out.println("9. Sera Masumi, Detective SMU. Satu kelas dengan "
                + "Mouri Ran dan Sonoko Suzuki. Mengetahui identitas asli Conan");
        System.out.println("10. Akai Shuichi, salah satu anggota FBI dan mantan"
                + " anggota dari Black Organitation yang menyamar dan tinggal "
                + "sementara di rumah Shinichi. Kakak dari Sera Masumi");


    }
}
