package quiz;


public class sorting {
    public static void main(String[]args){
        System.out.println("Bubble Short");
        System.out.print("Data Awal : ");
        int[] data= {10000,5000,17000,2300,3700,30000,48000,97000,56000,27000};
        String[] abjad = {"c", "a", "b", "f", "e", "d"};
        
        for (int i = 0; i < data.length; i++) { 
        for (int j = 0; j < data.length-1; j++) {
            if(data[j]>data[j+1]){
                int temp = data[j];
                data[j] = data[j+1];
                data[j+1] = temp;
            }
        }
    }
        System.out.print("Pengurutan dari harga terendah: "); 
        for (int i = 0; i < data.length; i++) { 
        System.out.print(data[i]+" "); } 
        System.out.println(""); 
        
        for (int i = 0; i < data.length; i++) { 
        for (int j = 0; j < data.length-1; j++) {
            if(data[j]<data[j+1]){
                int temp = data[j];
                data[j] = data[j+1];
                data[j+1] = temp;
            }
        }
    }
        System.out.print("Pengurutan dari harga tertinggi: "); 
        for (int i = 0; i < data.length; i++) { 
        System.out.print(data[i]+" "); } 
        System.out.println(""); 
        
         //pengurutan abjad
        int n = abjad.length;
        boolean cek;
        do {
            cek = false;
            for (int i = 1; i < n; i++) {
                if (abjad[i - 1].compareTo(abjad[i]) > 0) {
                    String temp = abjad[i - 1];
                    abjad[i - 1] = abjad[i];
                    abjad[i] = temp;
                    cek = true;
                }
            }
        } while (cek);
         
        System.out.print("Pengurutan Abjad : ");
        for (String element :abjad) {
            System.out.print(element + " ");
        }
    }
}
    
