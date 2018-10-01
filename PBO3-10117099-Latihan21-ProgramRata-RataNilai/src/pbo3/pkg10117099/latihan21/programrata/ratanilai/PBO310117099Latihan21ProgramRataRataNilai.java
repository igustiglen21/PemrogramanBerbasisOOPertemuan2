/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117099.latihan21.programrata.ratanilai;
import java.util.Scanner;
/**
 *
 * @author 
//NAMA  :I Gusti Glen
//NIM   :10117099
//KELAS :IF-3
//

 */
public class PBO310117099Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // //        deklarasi variabel
        int nMhs;
        int nilaiMhs;
        double totalNilai;
        double rataNilai;
        //deklarasi untuk inputan scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nMhs = scanner.nextInt();
        
        totalNilai = 0; //inisialisasi total mahasiswa 0
//        looping sesuai dengan jumlah mahasiswa yang telah diinputkan
        for (int i = 1; i <= nMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilaiMhs = scanner.nextInt();
            totalNilai += nilaiMhs; //menampung totall nilai mahasiswa
        }
        
//        rumus menghitung rata-rata nilai mahasiswa
        rataNilai = totalNilai/nMhs;
        System.out.println("\nMaka, Rata-rata Nilainya adalah "+rataNilai);
        System.out.println("Developed by: Teguh Siswanto");
        
    }
    
}
