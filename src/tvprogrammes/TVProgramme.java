package tvprogrammes;

public class TVProgramme {

	
	private String programmeName;
	private String broadcaster;
	private int rating;
	private double Audience;
	
	
	
	
	
	/**
	 * @param programmeName
	 * @param broadcaster
	 * @param rating
	 * @param audience
	 */
	public TVProgramme(String programmeName, String broadcaster, int rating, double audience) {
		this.programmeName = programmeName;
		this.broadcaster = broadcaster;
		this.rating = rating;
		Audience = audience;
	}
	
	
	/**
	 * Writes a String explanation of the TVprogramme object
	 */
	@Override
	public String toString() {
		return "Programme name \t :" + programmeName + " \r Broadcaster \t :" + broadcaster + " \r Rating  \t :" + rating
				+ " \r Audience \t :" + Audience + "\r\r --------------------------";
	}



	/**
	 * @return the programmeName
	 */
	public String getProgrammeName() {
		return programmeName;
	}
	/**
	 * @param programmeName the programmeName to set
	 */
	public void setProgrammeName(String programmeName) {
		this.programmeName = programmeName;
	}
	/**
	 * @return the broadcaster
	 */
	public String getBroadcaster() {
		return broadcaster;
	}
	/**
	 * @param broadcaster the broadcaster to set
	 */
	public void setBroadcaster(String broadcaster) {
		this.broadcaster = broadcaster;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	/**
	 * @return the audience
	 */
	public double getAudience() {
		return Audience;
	}
	/**
	 * @param audience the audience to set
	 */
	public void setAudience(double audience) {
		Audience = audience;
	}
	
	
}
