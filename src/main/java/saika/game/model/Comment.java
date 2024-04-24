package saika.game.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Comment {

	private String user;
	private String message;
	private String dateCreated;
	private long like;
	
	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the dateCreated
	 */
	public String getDateCreated() {
		return dateCreated;
	}
	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(String dateCreated) {
		this.dateCreated = convertToDateString(dateCreated);
	}
	/**
	 * @return the like
	 */
	public long getLike() {
		return like;
	}
	/**
	 * @param like the like to set
	 */
	public void setLike(long like) {
		this.like = like;
	}
	
	private String convertToDateString(String epochTime) {
		long epochTimeLong = Long.parseLong(epochTime);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date(epochTimeLong * 1000));
	}
}
