package base;

import org.testng.annotations.Test;


public class ExecutionClass {

	

	public static BaseClass baseclass=new BaseClass();  //Initiating base class
	
	@Test
	public static void FindLongestWord() {

		try {
			String actualString =BaseClass.getActualString();
			String[] word=actualString.split(" ");   // spliting entire string by using split method
			
			String maxLengthWord="";   	// declaring string for fetch result in it
			int maxWordLength=0;		// declaring int for fetch result in it
			for (int i = 0; i < word.length; i++) {
				if (word[i].length() >= maxLengthWord.length()) {
					maxLengthWord=word[i];
					maxWordLength=word[i].length();
				}
			}
			System.out.println("Longest Word length given String is 	:"+maxWordLength);
			System.out.println("Longest Word from given String is 	:"+maxLengthWord);

		} catch (Exception e) {
			System.out.println("Exception is :"+e);
		}
		
	}
}
