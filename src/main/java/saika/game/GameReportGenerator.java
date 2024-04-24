package saika.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import saika.game.model.AverageLikes;
import saika.game.model.Comment;
import saika.game.model.Game;
import saika.game.model.Report;

public class GameReportGenerator implements IGameReportGenerator {
	

	@Override
	public Report generate(List<Game> games) {
		
		Report report = new Report();
		
		report.setMostComments(findMostActiveUser(games));
		
		List<SumOfLikes> sumOfLikes = buildSumOfLikes(games);
		
		if(!sumOfLikes.isEmpty()) {
			report.setAverageLikes(buildAverageLikes(sumOfLikes));
			
			Collections.sort(sumOfLikes);
			report.setHighestRatedGame(sumOfLikes.get(0).title);
		}
		
		return report;
	}

	/**
	 * From our sum of likes list build a list of average likes
	 * @param sumOfLikes
	 * @return list of average likes
	 */
	private List<AverageLikes> buildAverageLikes(List<SumOfLikes> sumOfLikes) {
		
		List<AverageLikes> averageLikes = new ArrayList<AverageLikes>();
		
		for(SumOfLikes sum: sumOfLikes) {
			averageLikes.add(sum.createAverageLikes());
		}
		
		return averageLikes;
	}

	/**
	 * Sum all the likes of the game
	 * @param games the games we wish to process
	 * @return a temporary object storing the sum of likes
	 */
	private List<SumOfLikes> buildSumOfLikes(List<Game> games) {
		List<SumOfLikes> avarageLikes = new ArrayList<SumOfLikes>();
		
		for(Game game: games) {
			SumOfLikes sumOfLikes = new SumOfLikes();
			
			sumOfLikes.title = game.getTitle();
			sumOfLikes.sum = calculateSumOfLikes(game.getComments());
			sumOfLikes.count = game.getComments().size();
			avarageLikes.add(sumOfLikes);
		}
		
		
		return avarageLikes;
	}

	/**
	 * Calculate the sum of likes from the comments
	 * @param comments list of comments we wish to process
	 * @return the sum of likes
	 */
	private Long calculateSumOfLikes(List<Comment> comments) {
		long sumOfLikes = 0;
		for(Comment comment: comments) {
			sumOfLikes += comment.getLike();
		}
		return sumOfLikes;
	}

	/**
	 * Find most active user
	 * @param games games we wish to process
	 * @return the most active user
	 */
	private String findMostActiveUser(List<Game> games) {
		HashMap<String, Integer> userCount = new HashMap<String, Integer>();
		
		for(Game game: games) {
			for(Comment comment : game.getComments()) {
				userCount.put(comment.getUser(), userCount.getOrDefault(comment.getUser(), 0) + 1);
			}
		}
		
		int mostActiveCount = -1;
		String mostActiveUser = null;
		for (Entry<String, Integer> entry : userCount.entrySet()) {
		   Integer count = entry.getValue();
		   if(count > mostActiveCount) {
			   mostActiveUser = entry.getKey();
			   mostActiveCount = count;
		   }
		}
		
		return mostActiveUser;
	}
	
	/**
	 * Tempory object storing the sum of likes
	 * @author Rhodri
	 *
	 */
	class SumOfLikes implements java.lang.Comparable<SumOfLikes> {
		public String title;
		public Long sum;
		public int count;
		
		/**
		 * Compare against another SumOfLikes object
		 * @param other the object we're comparing against
		 * @return positive if greater negative if smaller
		 */
		public int compareTo(SumOfLikes other) {
			return this.sum > other.sum ? 1 : this.sum < other.sum ? -1 : 0;
		}

		public AverageLikes createAverageLikes() {
			AverageLikes ret = new AverageLikes();
			ret.setAverageLikes(Math.round(((double)sum)/count));
			ret.setTitle(title);
			return ret;
		}
	}

	

}
