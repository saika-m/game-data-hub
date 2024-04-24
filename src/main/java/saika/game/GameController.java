package saika.game;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import saika.game.model.Game;
import saika.game.model.Report;

@RestController
public class GameController {
	
	protected Logger logger = Logger.getLogger(GameController.class.getName());
	
	@Autowired
	GameRepository repository;
	
	@Autowired
	IGameReportGenerator reportGenerator;
	
	@RequestMapping(value="/games/{gameId}", method=RequestMethod.GET)
	public Game get(@PathVariable("gameId") Long gameId ) {
		logger.log(Level.INFO, "Request game id: " + gameId.toString());
		Game game = repository.get(gameId);
		
		logger.log(Level.INFO, "Game found: " + game.toString());
		return game;
	}
	
	@RequestMapping(value="/games/report", method=RequestMethod.GET)
	public Report generateReport() {
		logger.log(Level.INFO, "Request game report");
		Report report = reportGenerator.generate(repository.getAll());
		
		logger.log(Level.INFO, "Game report generated");
		return report;
	}
}
