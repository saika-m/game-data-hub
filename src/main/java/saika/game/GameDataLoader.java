package saika.game;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import saika.game.model.Game;
import saika.game.model.GameList;

public class GameDataLoader {
	
	public List<Game> load() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		
		objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		
		GameList games = objectMapper.readValue(new File("games_data.json"), GameList.class);
		
		return games.getGames();
	}

}
