package quiz;
import java.util.Scanner;

public class searching {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in); 
        String barang[] = {"pensil","bolpoin","stipo", "penghapus","rautan","spidol",}; 
        boolean ketemu=false; 
        int i; 
        System.out.println("Sequential Search"); 
                System.out.println(""); 
                System.out.print("Cari ATK  = "); 
                String cari = s.next(); 
                for (i = 0; i < barang.length; i++) { 
                    if(barang[i].compareToIgnoreCase(cari)==0){ 
                        ketemu = true; 
                        break; 
                    } 
                } if(ketemu==true){ 
                    System.out.println("Ada di katalog "+(i+1)); 
                }else{ System.out.println("Tidak ditemukan"); 
                } 
    } 
}
