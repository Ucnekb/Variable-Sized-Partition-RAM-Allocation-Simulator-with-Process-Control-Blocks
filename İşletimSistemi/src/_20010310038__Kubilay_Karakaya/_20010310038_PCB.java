package _20010310038__Kubilay_Karakaya;

public class _20010310038_PCB {
	
	   private int pid;
	  private   String [][] PCB;
	   private int san;
	   
	   
	   
	   
	   
	   
	   public void PCB_Bilgi(String adı)
		{
			System.out.println();
			
			for(int i=0;i<PCB.length;i++) {
				if(adı.equals(PCB[i][0]))
				{
					System.out.println(adı + " isimli prosesin" +" "+ san+ ". saniyedeki PCB bilgileri şu şekilde");
					System.out.println("proses numarası :" + PCB[i][1]);
					System.out.println("Prosesin yaratılma zamanı: " +  PCB[i][2] + ".saniye");
					System.out.println("Prosesin toplam büyüklüğü:" + " "+ PCB[i][3] + "KB");
				}
			}
		}
	   public void PCB_ekle(String boyut, String zaman)
	   {
		   int pidd=getPid();
		   pidd++;
		   String piddd=Integer.toString(pidd);
		   for(int i=0;i<PCB.length;i++) {
			   PCB[i][1]= piddd;
			   PCB[i][3]=boyut;
			   PCB[i][2]=zaman;   
			   
		   }		   
	   }

	   public void Pcb_bitti(String pidd)
	   {
		
		   
		   for(int i=0;i<PCB.length;i++) {
			   if(PCB[i][1]== pidd)
			   {
				   PCB[i][1]= null;
				   PCB[i][1]= null;
				   PCB[i][1]= null;
			   }
		   }		   		   
	   }


	public int getPid() {
		return pid;
	}






	public void setPid(int pid) {
		this.pid = pid;
	}






	public String[][] getPCB() {
		return PCB;
	}






	public void setPCB(String[][] pCB) {
		PCB = pCB;
	}






	public int getSan() {
		return san;
	}






	public void setSan(int san) {
		this.san = san;
	}
	   
	   
	   
	   

}
