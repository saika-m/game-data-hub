package saika.game.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Allow the controller to return a 404 if we can't find a game
@ResponseStatus(code=HttpStatus.NOT_FOUND, reason="Game not found")
public class GameNotFound extends RuntimeException  {
	private static final long serialVersionUID = 1L;

}
