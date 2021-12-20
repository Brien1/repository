package scvbandoop;

public class Song {

	private String title;
	private String artist;
	private int highestPosition;
	
	
	
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", highestPosition=" + highestPosition + "]";
	}
	/**
	 * @param title
	 * @param artist
	 * @param highestPosition
	 */
	public Song(String title, String artist, int highestPosition) {
		this.title = title;
		this.artist = artist;
		this.highestPosition = highestPosition;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 * @return the highestPosition
	 */
	public int getHighestPosition() {
		return highestPosition;
	}
	/**
	 * @param highestPosition the highestPosition to set
	 */
	public void setHighestPosition(int highestPosition) {
		this.highestPosition = highestPosition;
	}
	
	
	
}
