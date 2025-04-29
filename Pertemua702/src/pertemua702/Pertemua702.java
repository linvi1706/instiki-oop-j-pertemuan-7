
package pertemua702;

import java.util.Scanner;

/**
 *
 * @author Linvianti Chemychel
 * Tgl 29 April 2025
 */
public class Pertemua702 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String ulang ="ya";
      String pil ="";
     Scanner p = new Scanner (System.in);
     
     do{
         System.out.println("Aplikasi AZALAJA");
         System.out.println("1. Hitung Luas Persegi");
         System.out.println("2. Hitung Luas Segitiga");
         System.out.println("3.Selesai");
         System.out.println("Pilih (1/2/3)");
         pil = p.nextLine();
         switch (pil) {
             case "1":
                 System.out.println("Memilih Menu Hitung Luas Persegi");
                 break;
                 case "2":
                 System.out.println("Memilih Menu Hitung Luas Segitiga");
                 break;
                 case "3":
                 ulang = "tidak";
                 break;
             default:
                 System.out.println("Silahkan Pilih 1/2/3");
         }
    }while(ulang.equals("ya"));
    System.out.println("byeeee");
    } 

     }

