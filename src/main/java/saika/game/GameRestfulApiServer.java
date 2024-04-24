package saika.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GameRestfulApiServer {

	public static void main(String[] args) {
		SpringApplication.run(GameRestfulApiServer.class, args);	
	}
	
	@Bean
	public GameDataLoader gameDataLoader(){
		return new GameDataLoader();
	}
	
	@Bean
	public GameRepository gameRepository(){
		return new GameInMemoryRepository();
	}
	
	@Bean
	public IGameReportGenerator reportGenerator(){
		return new GameReportGenerator();
	}

}
