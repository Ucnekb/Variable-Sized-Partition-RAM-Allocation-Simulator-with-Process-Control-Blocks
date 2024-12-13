package _20010310038__Kubilay_Karakaya;

public class _20010310038_Ram {
	
	private String [][]RamTablo;
	private int RamBoyut=10240-1000; //kb
	
	
	
	
	
	public int getRamBoyut() {
		return RamBoyut;
	}

	public void setRamBoyut(int ramBoyut) {
		RamBoyut = ramBoyut;
	}

	public String[][] GetTablo()
	{
		
		return RamTablo;
	}
	
	public  void SetTablo  (String[][] tablo)
	{
		
		this.RamTablo=tablo;
	}
	
	
	public void RamYazdır() {
		
		for(int i=0;i<RamTablo.length;i++) {
			if(RamTablo[i][0]!=null) {
				System.out.println(RamTablo[i][0] + ": " + RamTablo[i][3] + "---" + RamTablo[i][4] + " arasında program bulunmaktadır" );
				
			}
		}
		
	}

	
	

}
