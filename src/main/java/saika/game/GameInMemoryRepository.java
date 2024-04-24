package saika.game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import saika.game.exceptions.GameNotFound;
import saika.game.model.Game;

public class GameInMemoryRepository implements GameRepository {
	
	private Map<Long, Game> games = null;
	
	protected Logger logger = Logger.getLogger(GameInMemoryRepository.class.getName());
	
	@Autowired
	private GameDataLoader gameDataLoader;
	
	private Map<Long, Game> getGameData() {
		if(games == null) {
			try {
				List<Game> gameList = gameDataLoader.load();
				games = new HashMap<Long, Game>();
				for (Game game : gameList) {
					games.put(game.getGameId(), game);
				}
				
			} catch (IOException e) {
				logger.log(Level.SEVERE , "File not loaded: " + e.getMessage());
			}
		}
		
		return games;
	}

	@Override
	public Game get(Long gameId) throws GameNotFound {
		Game game = getGameData().get(gameId);
		
		if(game == null) {
			throw new GameNotFound();
		}
		
		return game;
	}

	@Override
	public List<Game> getAll() {
		return new ArrayList<Game>(getGameData().values());
	}

}
