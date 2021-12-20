package tvprogrammes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ProgrammerProduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File inputFile = new File("TVProgrammes.csv");
		try {
			FileReader readInputFile = new FileReader(inputFile);
			BufferedReader TVarg = new BufferedReader(readInputFile);
			FileWriter target = new FileWriter("BBCProgrammes.csv", true);
			BufferedWriter write = new BufferedWriter(target);
			
		
			ArrayList<TVProgramme> TVprogrammes = new ArrayList<TVProgramme>();
		
			TVarg.readLine();
			String currentLine = TVarg.readLine();
			
			do {
				String[] line = currentLine.split(",");
				int rating = Integer.parseInt(line[2]);
				double avgAudience =Double.parseDouble(line[3]);
				TVprogrammes.add(new TVProgramme(line[0],line[1],rating,avgAudience));
				
				int currentP=TVprogrammes.size()-1;
				String currentString = TVprogrammes.get(currentP).toString();
				write.write(currentString+"\r");
				currentLine = TVarg.readLine();
			
				
			} while (currentLine!=null);

		
			
			TVarg.close();
			write.close();
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
