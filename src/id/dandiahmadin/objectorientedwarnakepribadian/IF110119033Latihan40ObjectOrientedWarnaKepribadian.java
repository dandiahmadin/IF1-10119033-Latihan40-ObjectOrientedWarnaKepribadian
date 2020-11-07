/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.objectorientedwarnakepribadian;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi kepribadian dengan memilih warna yang telah ada dengan konsep 
 * pendekatan berbasis objek
 */
public class IF110119033Latihan40ObjectOrientedWarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        WarnaKepribadian objWK = new WarnaKepribadian();
        
        System.out.println(
                objWK.hurufMerah.concat("YUK ")
                .concat(objWK.hurufHijau).concat("CEK ")
                .concat(objWK.hurufKuning).concat("KEPRIBADIANMU ")
                .concat(objWK.hurufCyan).concat("DARI ")
                .concat(objWK.hurufUngu).concat("WARNA ")
                .concat(objWK.hurufBiru).concat("FAVORITMU \n")
        );
       
        System.out.println(
                objWK.bgMerah.concat(objWK.hurufPutih).concat("\tMERAH\t\t\n")
                .concat(objWK.bgHijau).concat(objWK.hurufPutih).concat("\tHIJAU\t\t\n")
                .concat(objWK.bgKuning).concat(objWK.hurufPutih).concat("\tKUNING\t\t\n")
                .concat(objWK.bgBiru).concat(objWK.hurufPutih).concat("\tBIRU\t\t\n")
                .concat(objWK.bgUngu).concat(objWK.hurufPutih).concat("\tUNGU\t\t\n")
        );
        System.out.print(objWK.resetWarna.concat("PILIH WARNA FAVORITMU : "));
        objWK.pilihWarna = scanner.next();
        System.out.print("NAMA KAMU : ");
        objWK.nama = scanner.next();
        
        
        objWK.cetakWarnaKepribadian(objWK.nama, objWK.pilihWarna);
    }
    
}
