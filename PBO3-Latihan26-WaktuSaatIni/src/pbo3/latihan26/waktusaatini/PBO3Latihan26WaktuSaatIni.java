/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.latihan26.waktusaatini;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author
//NAMA  :I Gusti Glen    
//NIM   :10117099   
//KELAS :IF-3
 */
public class PBO3Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Date date = new Date();
     Calendar cal = Calendar.getInstance();
     int daysOfWeek = cal.get(Calendar.DAY_OF_WEEK);// hari dalam format angka
        
//     format tanggal dan waktu
     SimpleDateFormat formatIndo = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        
//     data array -> nama hari Indonesia
     String[] strDays = new String[]{"Sabtu","Minggu","Senin","Selasa","Rabu"
             ,"Kamus","Jumat"};
        
//     menampilkannya sesuai format
     System.out.println("Hari ini adalah hari : "+(strDays[daysOfWeek])+" ,"
             +formatIndo.format(date));
    }
    
}
