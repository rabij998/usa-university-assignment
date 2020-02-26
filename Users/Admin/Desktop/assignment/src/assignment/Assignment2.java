package assignment;

public class Assignment2 {
	public int customSearch(String littleString,String bigString)
	{
		int countPosition=0;
		int findFlag=-1;
		String[] splitedWordList=bigString.split("\\s");
		for(String getWord:splitedWordList)
		{
			 //countPosition=getWord.length();
			if(getWord.equals(littleString))
			{
				findFlag=countPosition+1;
				return findFlag;
			
			}
			countPosition=countPosition+getWord.length();
		}
		return findFlag;
	}

}
