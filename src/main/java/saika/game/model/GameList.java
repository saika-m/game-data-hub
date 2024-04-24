package saika.game.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameList {

	@JsonProperty("games")
	private List<Game> games;

  
    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

}
