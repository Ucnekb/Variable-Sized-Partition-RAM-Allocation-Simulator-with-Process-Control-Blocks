package _20010310038__Kubilay_Karakaya;

import java.util.Arrays;
import java.util.Comparator;

public class _20010310038_System {
	public String[][] girdi=null;
	public String[][] boyut;
	int İşletimSistemi=1000;
	int hedef=1;
	public String [][]Tablo;
	int SonBoyut=0;
public	String [][] PCB;
int san;
public  String [][] bos=new String [5][4];
int bosSıra=0;
_20010310038_Ram Ram=new _20010310038_Ram();
_20010310038_PCB  pcbb=new _20010310038_PCB();
 public boolean kontrol=false;
	
	public _20010310038_System(String [][]  girdii)
	{

		this.girdi=girdii;
		ProscessBoyutHesapla(girdii);
		String [][] tablo=new String[girdi.length+1][5];
		tablo[0][0]="iŞletim Sistemi";
		tablo[0][1]="1024000";
		tablo[0][2]="0";
		tablo[0][3]="0";
		tablo[0][4]="1023999";
		this.Tablo=tablo;
		Ram.SetTablo(Tablo);
		
		
	}
	public void ProscessBoyutHesapla(String[][] girdi) {
		String [][]hesapla=new String[girdi.length][2];
		for(int i=0;i<girdi.length;i++) {
			
			for(int j=0;j<4;j++) {
				hesapla[i][0]=girdi[i][0];
				int c= Integer.parseInt(girdi[i][3]);
		    	   int d= Integer.parseInt(girdi[i][4]);
		    	   int e= Integer.parseInt(girdi[i][5]);
		    	   int f= Integer.parseInt(girdi[i][6]);
		    	   int son= c+d+e+f;
		    	   son=1024*son;
		    	   String boyutt=Integer.toString(son);
		    	   hesapla[i][1]= boyutt;
		    	   this.boyut=hesapla;	    	   
			}			
		}	
	}
	
	public int indexBul(String ad)
	{
		int son=0;
		for(int i=0;i<Tablo.length;i++) {
			if(ad==Tablo[i][0]) {
				int sıra =Integer.parseInt(Tablo[i][2]);
				son=i;
				return  i;
				
			}		
		}
		return son;		
	}	

	
	public void FirstFirst(int saniye) {
		Boolean silinme=false;	
		String [][] pcb=new String[girdi.length][4];
		int pid=1000;
		this.san=saniye;
		boolean kondu=false;
		int b=0;
		int PBoyut=0;
		int [] [] silinen= new int[girdi.length][2];
for(int i=1;i<=saniye;i++) 
{
   if(kontrol==false) 
   {		                                            			                                            
	for(int j=0;j<girdi.length;j++ ) 
	{
	kondu =false;
	String s=Integer.toString(i);			
      if(girdi[j][1].equals(s))                     
      {  					             	  
	   if(silinme ==true)                        
	    {			          
            Sırala(bos);							                  
		for(int bosSıraDön=0; bosSıraDön<bosSıra;bosSıraDön++) 
		 {			
			 if(bos[bosSıraDön][1]!= null) 
			 {					
			int boyutt=	Integer.parseInt(bos[bosSıraDön][1]);							
			int GelenBoyut=	Integer.parseInt(boyut[j][1]);		
		
			   if(boyutt>=GelenBoyut)                     
			   {     	  
				 int hedeff=hedef;
				 hedef=Integer.parseInt(bos[bosSıraDön][2]);	
				 Tablo[hedef][0]=girdi[j][0]; 
				 Tablo[hedef][1]=boyut[j][1];		
				 String YedekEnd=  Tablo[hedef][4];
				 
				 int indexx= Integer.parseInt (bos[bosSıraDön][2]);
				 String yedekİndex=Integer.toString(indexx);
				 int	başlangıçD=Integer.parseInt(Tablo[indexx][3]);			                                                 
				 int boyu=Integer.parseInt(boyut[j][1]);
				 int sonD= boyu+başlangıçD-1;
				 String SonDeğer=Integer.toString(sonD);
				 Tablo[hedef][2]=yedekİndex;
				 Tablo[hedef][4]=SonDeğer;                                                  
				 bos[bosSıraDön][0]= null;
				 bos[bosSıraDön][1]=null;
				 int hedefSon=	Integer.parseInt(bos[bosSıraDön][2]);
				 bos[bosSıraDön][2]=null;							
				 pcb[j][0]=girdi[j][0];
				 String pidd=Integer.toString(pid);
				 pcb[j][1]=pidd;
				 pid++;
				 pcb[j][2]=girdi[j][1];
				 int boyuttt=Integer.parseInt(boyut[j][1]);
				 boyuttt=boyuttt/1024;
				 String boy=Integer.toString(boyuttt);
				 pcb[j][3]=boy;									
				 hedef=hedefSon;
				 kondu=true;
				 if(boyutt!=GelenBoyut)
				 {				
				 ekleVeKopyala(Tablo,hedef,sonD,YedekEnd);
				 sonD++;     
				 int end=Integer.parseInt(YedekEnd);
				 int Boyutt=end-sonD;			 
				 String BoyutSon=Integer.toString(Boyutt);
				 bos[bosSıraDön][1]=BoyutSon;  
				 int intt=Integer.parseInt(yedekİndex);
				 intt++;
				 String Yedekİnt=Integer.toString(intt);
				 bos[bosSıraDön][2]=Yedekİnt;     						 
				 hedef++;
				 }			 				 			 
				 break;
			  }			
		}		

	}                                                  
} 	  			
		if(Tablo[hedef][0]!=null || Tablo [hedef][3]!=null  )
	{				                                                 
		  while(Tablo [hedef][3]!=null) {
			hedef++;
		}				                                           				
	}			 
		  if(kondu==false) 
         {			     
			 int Ramboyut=Ram.getRamBoyut();
			 int son=Integer.parseInt(boyut[j][1]);
			 int a=0;
			 a=son;
			 a=a/1024;
			 b+=a;
		    	 if(Ramboyut>b) 
		    {	  		    		
		       		Tablo[hedef][0]=girdi[j][0]; 
					Tablo[hedef][1]=boyut[j][1];
					Tablo[hedef][2]= Integer.toString(hedef);				                                               
					int baş=Integer.parseInt(Tablo[hedef-1][4]);					
					baş=baş+1;
					String başlangıç=Integer.toString(baş);					
					Tablo[hedef][3]=başlangıç; 
					PBoyut+=a;
					int sonDeğer=son+baş-1;						
					Tablo[hedef][4]=Integer.toString(sonDeğer); 		                                              		
					hedef++;					                                         											
					pcb[j][0]=girdi[j][0];
					String pidd=Integer.toString(pid);
					pcb[j][1]=pidd;
					pid++;
					pcb[j][2]=girdi[j][1];
					int boyuttt=Integer.parseInt(boyut[j][1]);
					boyuttt=boyuttt/1024;
					String boy=Integer.toString(boyuttt);
					pcb[j][3]=boy;
					kondu=false;
	    }
		 else {
				 System.out.println("Ram boyutu aştı");
				 kontrol=true;
				 break ;
			  }
	    if(bosSıra==0) 
	        {
				silinme=false;
			}
      }
}		
					if(girdi[j][2].equals(s))
					{						  				
					int index =indexBul(girdi[j][0]);										
					bos[bosSıra][0]=girdi[j][0]; 
					bos[bosSıra][1]=boyut[j][1];
					bos[bosSıra][2]=Tablo[index][2];	                                                         					
					bosSıra++;					
					Tablo[index][0]=null; 
					Tablo[index][1]=null;																						
				    int son=Integer.parseInt(boyut[j][1]);	
			       SonBoyut=son;
			  	   PBoyut-=son;
				   silinme=true;					   				   
				   pcb[j][0]=null;
				   pcb[j][1]=null;
				   pcb[j][2]=null;
				   pcb[j][3]=null;				  
		}														
	}						
 }
       else {
	    	System.out.println("Ram doldu");
		  	break;
	         }
}
			this.PCB=pcb;
			System.out.println(" ");
			if(kontrol==false)
			{
			for(int i=0;i<Tablo.length;i++) 
			{
				if(Tablo[i][0]!=null) 
				{
				System.out.println(Tablo[i][3] + " ve " + Tablo[i][4] + "  adresleri arasında " + Tablo[i][0] + ": " + " program bulunmaktadır" );					
				}
			}	
			System.out.print( "PCB'si bulunan Prosesler: ");
				for(int ii=1;ii<Tablo.length;ii++) 
				{
					if(Tablo[ii][0]!=null) 
					{
						System.out.print(Tablo[ii][0]  + "," );
					}				
			}				
				System.out.println();
				  Ram.SetTablo(Tablo);
			        pcbb.setSan(saniye);
			         pcbb.setPCB(pcb);
			}
			else {
				System.out.println("ram doluu çalışan proses yok");
			}		      	            		
		}	
	public void pcb_yazdır(String adı) 
	{
		if(kontrol==false) 
		{
		pcbb.PCB_Bilgi(adı);
		}
		else 
		{
			System.out.println("ram dolmuş  çalışan proceses yok");
		}	
	}		
	public void Sırala( String [][] bos) {  
		String [][] yedek=new String [bos.length][3];
		yedek=bos;

		 Arrays.sort(yedek, Comparator.comparing(a -> {
	            String value = a[2];
	            return value != null ? Integer.parseInt(value) : Integer.MAX_VALUE; 
	        }));					  
	
	this.bos=yedek;
	}		
	public void BosSırala() {
		
		System.out.println("boş alanlar sıralanıyor");
		for(int i=0;i<bos.length;i++) {
			System.out.println(bos[i][0] + " " + bos[i][1] + " " + bos[i][2] ); 
		}		
	}	
	 public void ekleVeKopyala(String[][] dizi, int indeks , int SonD  , String end) {
	  
	        String[][] yeniDizi = new String[dizi.length + 1][5];
	        
	       
	        for (int i = 0; i <= indeks; i++) {
	            for (int j = 0; j < 5; j++) {
	                yeniDizi[i][j] = dizi[i][j];
	            }
	        }
	        
	       
	        for (int j = 0; j < 5; j++) {
	            yeniDizi[indeks + 1][j] = null;
	        }
	        
	       
	        for (int i = indeks + 1; i < dizi.length; i++) {
	            for (int j = 0; j < 5; j++) {
	                yeniDizi[i + 1][j] = dizi[i][j];
	             
	            }
	            
	            String Yeni=Integer.toString(i+1);
	          if(dizi[i][0]!=null ||  dizi[i][3]!=null)
                {	        	
	            	 yeniDizi[i + 1][2] = Yeni ;
	            	
                }            
            
	        }	                
	        SonD++;
	        String BasD=Integer.toString(SonD);
	        yeniDizi[indeks + 1][3] =BasD ;
	       
	        yeniDizi[indeks + 1][4] =end ;
	        
	        this.Tablo= yeniDizi;
	
	    }	 
	 public void TabloYazdır()
	 {
		 System.out.println("tablo yazdırılıyor");
		 for(int i=0;i<Tablo.length;i++) {
					if(Tablo[i][0]!=null || Tablo[i][3]!=null ) {
						System.out.println(Tablo[i][0] + ": " + Tablo[i][3] + "---" + Tablo[i][4] + " arasında program bulunmaktadır.  "  + "boyutu var :"  + Tablo[i][1]  +" yerleştirlen index: " + Tablo[i][2] );
						
				}
			}
	   }
	}