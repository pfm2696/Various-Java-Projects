import java.util.Scanner;
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String word1=goodWord();
		
		boolean palindrome=checker(word1);

	
	if (palindrome){
		System.out.println(word1+ (" is a palindrome"));
	}else{ 
		System.out.println (word1+(" is not a palindrome"));
	}}
	
	public static String goodWord(){
	
	
	
		Scanner input=new Scanner (System .in);
		System.out.println("Type in a word you would like to try out");
		String word= input.nextLine();
		return word;
		}
	
	public static boolean checker(String word){
		int x;
		int y;
		boolean goodWord =true;
		
		char []wordArray =word.toCharArray();
		for(x=0;x<word.length();x++){
			if(wordArray[x]!=wordArray[word.length()-1-x]){
			
			goodWord=false;
		}

		
	}
		return goodWord; }
}
