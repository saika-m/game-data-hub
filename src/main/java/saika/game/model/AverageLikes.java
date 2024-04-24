package saika.game.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AverageLikes {

	@JsonProperty("title")
	private String title;
	
	@JsonProperty("average_likes")
	private long averageLikes;

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
	 * @return the averageLikes
	 */
	public long getAverageLikes() {
		return averageLikes;
	}

	/**
	 * @param averageLikes the averageLikes to set
	 */
	public void setAverageLikes(long averageLikes) {
		this.averageLikes = averageLikes;
	}

}
