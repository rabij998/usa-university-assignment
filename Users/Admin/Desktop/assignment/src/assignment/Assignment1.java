package assignment;

public class Assignment1 {
	public String barMarker(double value)
	{
		if(value>=0.0 && value <=1.0)
		{
			String result;
			String hashsymbol="";
			int check=(int) (value*100%10);
			if(check==0)
			{
				hashsymbol="#";
			for(int i=1;i<(value*100)/10;i++)
				
		
				hashsymbol=hashsymbol+"#";
			
			
			return value*100+"%"+"\n"+hashsymbol;
		}
	
			
			
			return value*100+"%";
		}
		else
			return "Error!";
			
	}

}

