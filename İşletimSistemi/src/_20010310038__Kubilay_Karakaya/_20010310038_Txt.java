package _20010310038__Kubilay_Karakaya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _20010310038_Txt {
	
	
	private String [] [] girdi = null;
	public  int satirSayisi = 0;
	
	public _20010310038_Txt(File dosya) throws FileNotFoundException {
		
		Scanner okuyucu = new Scanner(dosya);
		   
           while (okuyucu.hasNextLine()) {
               satirSayisi++;
               okuyucu.nextLine();
           }
           String[][] veri = new String[satirSayisi][7]; 

           okuyucu = new Scanner(dosya);
           int satir = 0;
           while (okuyucu.hasNextLine()) {
               String[] parcalar = okuyucu.nextLine().split(" ");
               for (int i = 0; i < parcalar.length; i++) {
                   veri[satir][i] = parcalar[i];
                 
               }
               satir++;
           }
          this.girdi=veri;
           okuyucu.close();
	}
	
	public void yazdır()
	{
		  for (int i = 0; i < girdi.length; i++) {
              for (int j = 0; j < girdi[i].length; j++) {
                  System.out.print(girdi[i][j] + " ");
              }
              System.out.println();
          }
	}
	
	public String [][]  Getveri()
	{
		return  girdi;
	}

}
