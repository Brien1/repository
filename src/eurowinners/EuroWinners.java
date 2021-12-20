package eurowinners;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EuroWinners {

	
	public static void main(String[] args) {
		
		File file = new File("ECWinners.txt");
		try {
			FileReader reading = new FileReader(file);
			BufferedReader read = new BufferedReader(reading);
		
			String currentLine = read.readLine();
			ArrayList<String> winners = new ArrayList<String>();
			int startYear = 1956;
			do {
				
				winners.add(currentLine);
				currentLine=read.readLine();
				
			} while (currentLine!=null);
		
		
		for (String string : winners) {
			System.out.println(startYear+" : "+string);
			startYear++;
		}
		
		ArrayList<String> winnersUnique = returnArrayListUniqueElements(winners);
		System.out.println(winnersUnique.toString());
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
	}

	private static ArrayList<String> returnArrayListUniqueElements(ArrayList<String> winners) {
			
		ArrayList<String> returnList = new ArrayList<String>();
		
		for (String string : winners) {
			if (!returnList.contains(string)) {
				returnList.add(string);
			}
		}
		
		
		return returnList;
	}
	
	
}
