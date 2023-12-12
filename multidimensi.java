package quiz;
import java.util.Scanner;

public class multidimensi {
    public static void main(String[]args){
        String barang[] = new String[4];
        int harga[] = new int[4];
        Scanner s = new Scanner(System.in);
        
         for (int i = 0; i < barang.length; i++) { 
             System.out.println("Masukkan nama barang");
             barang[i]=s.nextLine();
         }
         for (int i = 0; i < harga.length; i++) { 
             System.out.println("Masukkan harga barang");
             harga[i]=s.nextInt();
         }
         for (int i = 0; i < 5; i++) { 
             System.out.print("Nama barang "+barang[i]+ " Harga barang "+ harga[i]);
           
    }
}
}
