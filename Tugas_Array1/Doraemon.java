
package Tugas_Array1;

import java.util.ArrayList;

public class Doraemon {
    public static void main (String[] args){
        
        // membuat objek array list
        ArrayList kantongAjaib = new ArrayList();
        
        //mengisi kantong ajaib dengan 5 benda
        kantongAjaib.add("Senter Pembesar");
        kantongAjaib.add("Dorayaki");
        kantongAjaib.add("Tikus");
        kantongAjaib.add("Pintu Kemana Saja");
        kantongAjaib.add("Kaos Kaki");
        kantongAjaib.add("Laptop");
                
        //menghapus tikus dari kantong ajaib
        kantongAjaib.remove("Tikus");
        kantongAjaib.remove("Laptop");
        
        //menampilkan isi kantong ajaib
        System.out.println(kantongAjaib);
        
        //menampilkan banyak iai kantong ajaib
        System.out.println("Kantong ajaib berisi "+ kantongAjaib.size() +"item");
        
    }
}
