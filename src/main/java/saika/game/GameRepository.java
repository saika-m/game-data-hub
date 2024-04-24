package saika.game;

import java.util.List;

import saika.game.exceptions.GameNotFound;
import saika.game.model.Game;

public interface GameRepository {

	Game get(Long gameId) throws GameNotFound ;

	List<Game> getAll();
}
