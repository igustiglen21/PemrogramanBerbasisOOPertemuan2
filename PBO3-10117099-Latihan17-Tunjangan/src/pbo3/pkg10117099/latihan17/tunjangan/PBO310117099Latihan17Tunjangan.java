/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117099.latihan17.tunjangan;
import java.util.Scanner;
/**
 *
 * @author 
//NAMA  :I Gusti Glen   
//NIM   :10117099
//KELAS :IF-3
 */
public class PBO310117099Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // deklarasi variabel
         String status;
         double tunj;
         double gaji;
         double gatot;
         //membuat scanner input data
         Scanner scn = new Scanner(System.in);
         
         // menampilkan template program
        System.out.println("********Program Tunjangan********");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp.");
        gaji = scn.nextDouble();
        // input harus huruf kecil semua
        System.out.print("Status Anda? (menikah/belum) :");
        // input harus huruf Capitalize (huruf depannya kapital)
        System.out.print("Status Anda? (Menikah/Belum) :");
        status = scn.next();
        
        // kondisional tunjangan dengan menggunakan ?: 
        tunj=(status.equals("menikah")?0.35*gaji:0);
        tunj=(status.equals("Menikah")?0.35*gaji:0);
        // gatot = gaji total
        gatot = gaji+tunj;
        
         // menampilkan hasil setelah perhitungan
         System.out.println("");
         System.out.println("********Hasil Perhitungan********");
         System.out.println("Gaji Pokok\t : Rp "+gaji);
         System.out.println("Tunjangan\t : Rp "+tunj);
         System.out.println("Total gaji\t : Rp "+gatot);
         System.out.println("(Developed by: Teguh Siswanto)");
    }
    
}
