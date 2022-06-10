package com.exception;

class CharNotFound extends Exception
{
	public CharNotFound()
	{
		System.out.println("CharNotFound Exception");
	}
}
public class CharacterFinder1 {
    //Write logic to find the character from the sentence at specified location
   
	public char characterLocator(String sentence, String location) {
        try {
    	int position = Integer.parseInt(location);
    	System.out.println(sentence.charAt(position));
        return sentence.charAt(position);
        }
        catch (Exception e)
        {
        	throw (e);
        }
        
    }

	public static void main(String[] args) {
		
		CharacterFinder1 ob = new CharacterFinder1();

    	
		ob.characterLocator("This is a Java program", "10");
	}
}