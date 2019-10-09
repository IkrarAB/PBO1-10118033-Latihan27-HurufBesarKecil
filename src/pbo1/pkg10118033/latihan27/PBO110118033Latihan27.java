
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan hasil dari
 * mengubah huruf besar menjadi huruf kecil dan sebaliknya
 *  
 */

package pbo1.pkg10118033.latihan27;

import java.util.Scanner;

public class PBO110118033Latihan27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.println("\n=====Hasil Formatting=====");
        System.out.println("Huruf Besar : "+kalimat.toUpperCase());
        System.out.println("Huruf Kecil : "+kalimat.toLowerCase());
        System.out.println("(Developed By : Ikrar AB)");
    }
}