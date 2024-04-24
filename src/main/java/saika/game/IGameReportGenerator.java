package saika.game;

import java.util.List;

import saika.game.model.Game;
import saika.game.model.Report;

public interface IGameReportGenerator {

	Report generate(List<Game> games);
}
