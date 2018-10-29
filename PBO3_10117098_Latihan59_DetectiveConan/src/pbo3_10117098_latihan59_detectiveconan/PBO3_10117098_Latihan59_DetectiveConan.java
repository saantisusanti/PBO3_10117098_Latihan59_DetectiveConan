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
public class PBO3_10117098_Latihan59_DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("===== DAFTAR KARAKTER DETECTIVE CONAN =====");
         System.out.println("");
                  
        TokohUtama tu = new TokohUtama("","");
        tu.tampilTokohUtama();
        System.out.println("");
        TokohPendukung tokpen = new TokohPendukung("","");
        tokpen.tampilTokohPendukung();
        System.out.println("");
        DetectiveCilik dc = new DetectiveCilik("","");
        dc.tampilDetective();
       
    }
    
}
