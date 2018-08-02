import java.util.Scanner;  

public class Perulangan_for_Each {
    public static void main(String[] args) {
       
        //membuat arry
        int angka [] = {3,1,42,24,12};
        
        //menggunakan perulangan for each untuk menampilkan angka
        for( int x : angka ){
            System.out.println(x + " ");
        }
    }
        
}
