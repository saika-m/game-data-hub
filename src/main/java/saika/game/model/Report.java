package saika.game.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Report {
	@JsonProperty("user_with_most_comments")
	private String mostComments;
	
	@JsonProperty("highest_rated_game")
	private String highestRatedGame;
	
	@JsonProperty("average_likes_per_game")
	private List<AverageLikes> averageLikes;

	/**
	 * @return the mostComments
	 */
	public String getMostComments() {
		return mostComments;
	}

	/**
	 * @param mostComments the mostComments to set
	 */
	public void setMostComments(String mostComments) {
		this.mostComments = mostComments;
	}

	/**
	 * @return the highestRatedGame
	 */
	public String getHighestRatedGame() {
		return highestRatedGame;
	}

	/**
	 * @param highestRatedGame the highestRatedGame to set
	 */
	public void setHighestRatedGame(String highestRatedGame) {
		this.highestRatedGame = highestRatedGame;
	}

	/**
	 * @return the averageLikes
	 */
	public List<AverageLikes> getAverageLikes() {
		return averageLikes;
	}

	/**
	 * @param averageLikes the averageLikes to set
	 */
	public void setAverageLikes(List<AverageLikes> averageLikes) {
		this.averageLikes = averageLikes;
	}

}
