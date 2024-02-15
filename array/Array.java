
package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        // membuat array makanan
        String[] makanan = new String[5];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for( int i = 0; i < makanan.length; i++ ){
            System.out.print("Makanan ke-" + i + ": ");
            makanan[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        // menampilkan semua isi array
        for( String i : makanan ){
            System.out.println(i);
        }

    }
}
    
    

