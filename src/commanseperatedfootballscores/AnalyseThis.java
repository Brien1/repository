package commanseperatedfootballscores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AnalyseThis {

	public static void main(String[] args) {

		File scores = new File("Scores.txt");
		try {
			FileReader readThis = new FileReader(scores);
			BufferedReader name = new BufferedReader(readThis);

			name.readLine();
			String currentLine = name.readLine();

			while (currentLine != null) {
				String[] currentLineSplit = currentLine.split(",");
				String winner;
				int Score1 = Integer.parseInt(currentLineSplit[1]);
				int Score2 = Integer.parseInt(currentLineSplit[3]);

				winner = (Score1 > Score2) ? currentLineSplit[0] : currentLineSplit[2];

				System.out.println(currentLineSplit[0]+" "+currentLineSplit[1]+" : "+currentLineSplit[2]+" "+currentLineSplit[3] + "\t Winner " + winner);
				
				currentLine = name.readLine();

			}
			name.close();
			readThis.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
