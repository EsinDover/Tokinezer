
package tokenizer;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class tokenizer {

  
    public static void main(String[] args) {
        
        Scanner klavye = new Scanner(System.in);
        
        System.out.println("Dosyanın ismini giriniz:");
        String dosyaismi=klavye.nextLine();
        //Dosyamızı oluşturuyoruz.
        File dosya = new File(dosyaismi);
        char[] dizi= new char[300]; 
        int a=0;
        try {
            FileReader dosyaoku = new FileReader(dosya);
            int degiskenadi = dosyaoku.read();
            while (degiskenadi != -1) {
                char karakter = (char) degiskenadi;
                dizi[a]=karakter;
                degiskenadi = dosyaoku.read();
                a++;
            }
            dosyaoku.close();
            String[] sonuc=new String[dizi.length];
            for (a = 0; a < dizi.length; a++) {
                sonuc[a]=String.valueOf(dizi[a]);
            }
        
            for (a=0;a<sonuc.length;a++) {
                if(dizi[a]==' ' ||dizi[a]==','){
                    System.out.println(' ');
                }
                else
                System.out.print(sonuc[a]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
