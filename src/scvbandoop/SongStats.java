package scvbandoop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SongStats {

	public static void main(String[] args) {

		File list = new File("songlist.csv");
		try {
			FileReader name = new FileReader(list);
			BufferedReader b = new BufferedReader(name);

			b.readLine(); 													// skips first line
			String line = b.readLine(); 									// saves line to string
			ArrayList<Song> songList = new ArrayList<Song>();

			while (line != null) { 											// loops starts while the line isn't null (i.e. end of file)
				String[] lineList = line.split(","); 						// splits line into separated information on an ArrayList
				int chartPos = Integer.parseInt(lineList[2]); 				// string -> int for highest chart position
				songList.add(new Song(lineList[0], lineList[1], chartPos)); // adds a new song to the songlist using a constructor
				line = b.readLine(); 										// looks at the next line and saves to a String
			}

			for (Song song : songList) { 									// FOR-EACH loop iterates along each song in the ArrayList
				System.out.println(song.toString()); 						// uses the toString method in song to print details
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
