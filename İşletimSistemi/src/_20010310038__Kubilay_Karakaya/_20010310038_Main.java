package _20010310038__Kubilay_Karakaya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class _20010310038_Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		

		
File dosya = new File("girdi.txt");
		
_20010310038_Txt dosyaOkuma=new _20010310038_Txt(dosya);
_20010310038_System sistem=new _20010310038_System(dosyaOkuma.Getveri());
System.out.println(dosya + " dosyası okundu");


Scanner input =new Scanner(System.in);
System.out.println("Lütfen RAM 'in durumunu görmek istediğiniz saniyeyi giriniz?");
int a =input.nextInt();

System.out.println(a +". saniyede RAM'in dolu olan kısımları: ");
sistem.FirstFirst(a);

System.out.println(a + ". saniyediki PCB'sini görüntülemek istediğiniz proses ismini giriniz:");

Scanner inputt =new Scanner(System.in);
String adı=inputt.nextLine();
sistem.pcb_yazdır(adı);



	}

}
