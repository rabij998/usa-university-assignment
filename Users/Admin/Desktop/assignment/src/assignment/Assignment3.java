package assignment;

public class Assignment3 {
	public int lengthLongestWord(String phrase)
	{
		int wordSize=0;
		String[] splitedTemp=phrase.split("\\s");
		for(String word:splitedTemp)
		{
			if(word.length()>wordSize)
				wordSize=word.length();
		}
		
		return wordSize;
	}
	public int letterCount(String phrase, char c)
	{
		int charFrequency=0;
		
		for(int i=0;i<phrase.length();i++)
		{
			if(phrase.charAt(i)==c)
			{
				charFrequency++;
			}
			
		}
		return charFrequency;
	}
	public String wordLengthOrder(String phrase)
	{
		String newString=" ";
		String temp="";
		;
		String[] splitedPhrase=phrase.split("\\s");
		/*
		 * for(String word:splitedPhrase) {
		 * if(word.length()==lengthLongestWord(splitedPhrase)) {
		 * newString=newString+word; } }
		 */
		for(int i=0;i<splitedPhrase.length;i++)
		{
			for(int j=i+1;j<splitedPhrase.length;j++)
			{
				if(lengthLongestWord(splitedPhrase[i])>lengthLongestWord(splitedPhrase[j]));
				{
					temp=splitedPhrase[i];
					splitedPhrase[i]=splitedPhrase[j];
					splitedPhrase[j]=temp;
				}
				System.out.println(lengthLongestWord(splitedPhrase.toString()));
			}
		}
		System.out.println(splitedPhrase);
		for(String word:splitedPhrase)
		{
			System.out.println(word);
		}
		
		System.out.println(splitedPhrase.length);
		return newString;
	

	}

}
