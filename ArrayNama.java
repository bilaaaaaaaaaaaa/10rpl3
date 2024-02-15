
import java.util.Scanner;

public class ArrayNama {

    public static void main (String[] args) {
                
        //membuat array dan scanner
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Masukkan jumlah baris : ");
        int baris = scan.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int kolom = scan.nextInt();
        String[][] nama = new String[baris][kolom];
        
        //mengisi setiap meja 
        for(int i = 0; i<nama.length; i++){
            for(int j = 0; j<nama[i].length; j++){
                System.out.print ("Masukkan nama, index ["+i+"]["+j+"]:");
                nama [i][j] = scan.next();
            }
        }
        
        // menampilkan isi Array
        System.out.println("-------------------------");
        for(int i = 0; i<nama.length; i++){
            for(int j = 0; j<nama[i].length; j++){
                System.out.format("| %s | \t", nama[i][j]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }
}


