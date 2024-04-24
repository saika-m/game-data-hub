package saika.game.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Game {
	
	@JsonProperty("game_id")
	private long gameId;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("by")
	private String company;
	
	@JsonProperty("platform")
	private List<String> platforms;
	
	@JsonProperty("age_rating")
	private String ageRating;
	
	@JsonProperty("likes")
	private long likes;
	
	@JsonProperty("comments")
	List<Comment> comments;

	/**
	 * @return the gameId
	 */
	public long getGameId() {
		return gameId;
	}

	/**
	 * @param gameId the gameId to set
	 */
	public void setGameId(long gameId) {
		this.gameId = gameId;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the platforms
	 */
	public List<String> getPlatforms() {
		return platforms;
	}

	/**
	 * @param platforms the platforms to set
	 */
	public void setPlatforms(List<String> platforms) {
		this.platforms = platforms;
	}

	/**
	 * @return the ageRating
	 */
	public String getAgeRating() {
		return ageRating;
	}

	/**
	 * @param ageRating the ageRating to set
	 */
	public void setAgeRating(String ageRating) {
		this.ageRating = ageRating;
	}

	/**
	 * @return the likes
	 */
	public long getLikes() {
		return likes;
	}

	/**
	 * @param likes the likes to set
	 */
	public void setLikes(long likes) {
		this.likes = likes;
	}

	/**
	 * @return the comments
	 */
	public List<Comment> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}
