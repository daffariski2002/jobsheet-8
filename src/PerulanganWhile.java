import java.util.Scanner;

public class PerulanganWhile {
    public static void main(String[] args) {
        
        //membuat variable dan scanner
        boolean running = true;
        int counter = 0;
        String jawaban;
        Scanner scan = new Scanner (System.in);
                
        while ( running ) {        
            System.out.println("Apakah anda ingin keluar?");
            System.out.println("Jawab [ya/tidak]> ");
            
            jawaban = scan.nextLine();
            
            //cek jawabannya, kalau ya maka berhenti mengulang 
            if( jawaban.equalsIgnoreCase("ya") ) {
                running = false;
            }
            
            counter++;
        }
        
            System.out.println("Anda sudam melakukan perulangan sebanyak" + counter +" kali");
    }    
}   
