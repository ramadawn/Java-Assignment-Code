//By Douglas Oak
// This application reads in a file, sorts all the words into a list of words, creates a list 
//of unique words and then creates a dictionary of word frequencies

import java.io.*;
import java.util.*;
public class WordCount {
	public static void main(String args[]) throws FileNotFoundException {
		//create file object
		File file = new File("C:\\Users\\User\\Assignment3\\Assignment3\\src\\input.txt");
		//initialize a scanner
		Scanner content = new Scanner(file);
		//initialize am array for holding words
		ArrayList<String> wordList = new ArrayList<String>();
		//initialize a set for holding unique words
		Set<String> uniqueWords = new HashSet<String>();
		//create a dictionary for counting word frequency
		Map<String,Integer> wordFreq = new HashMap<String,Integer>();
		
		
		//open file and read words into word list
		while (content.hasNext()) {
				String word = content.next();
				//filter out punctuation source stack overflow
				String filteredWords = word.replaceAll("[^a-zA-Z ]", "");
				//convert words to lower case
				String lowerCase = filteredWords.toLowerCase();
				wordList.add(lowerCase);
				}
		content.close(); //close scanner
		
		//loop through each word in the word list
		for(String word : wordList) {
			//add each word to the set which will filter out duplicates
			uniqueWords.add(word);
			wordFreq.put(word,Collections.frequency(wordList, word) ); //add the word and it's count to the dictionary
			
		}
		
		
		
		
		System.out.println("File has " + wordList.size() + " words");
		System.out.println("File has " + uniqueWords.size() + " unique words");
		System.out.println("Instances of and = " + wordFreq.get("and") + " ,the = " + wordFreq.get("the"));
		
		
		
		
		//System.out.println(wordList);
		
	}
}
