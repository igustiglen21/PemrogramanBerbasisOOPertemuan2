/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117099.latihan19.saldotabungan;

/**
 *
 * @author 
//NAMA  :I Gusti Glen
//NIM   :10117099    
//KELAS :IF-3
 */
public class PBO310117099Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        deklarasi variabel
        int saldoAwal;
        int bunga; // persen bunga
        int jbunga; // jumlah bunga
        int lamaBulan;
        
//        variabel yang diberi value
        saldoAwal = 2500000;
        bunga = 15;
        lamaBulan = 6;
        
//        proses looping selama 6x
        for (int i = 1; i <= lamaBulan; i++) {
            //rumus 
            jbunga = saldoAwal*bunga/100;
            saldoAwal += jbunga;
            //menampilkan dengan format tertentu
            String mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
        }
    }
    
}
