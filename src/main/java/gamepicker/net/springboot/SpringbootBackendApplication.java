package gamepicker.net.springboot;

import gamepicker.net.springboot.games.Game;
import gamepicker.net.springboot.games.Genre;
import gamepicker.net.springboot.repsoitory.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
	private GameRepository gameRepository;
	@Override
	public void run(String... args) throws Exception {
		Game game1 = Game.builder()
				.id(12)
				.gerne(Genre.Action)
				.name("Dark Souls 3")
				.platform("playstation 4")
				.rating(4.4).build();

		Game game0 = Game.builder()
				.id(112)
				.gerne(Genre.Action)
				.name("Dark Souls 3")
				.platform("playstation 4")
				.rating(4.4).build();

		Game game2 = Game.builder()
				.id(11)
				.gerne(Genre.Action)
				.name("Dark Souls 3")
				.platform("playstation 1")
				.rating(4.4).build();

		Game game3 = Game.builder()
				.id(13)
				.gerne(Genre.Action)
				.name("Dark Souls 3")
				.platform("playstation 1")
				.rating(4.4).build();

		Game game4 = Game.builder()
				.id(15)
				.gerne(Genre.Action)
				.name("Dark Souls 3")
				.platform("playstation 1")
				.rating(4.4).build();

		Game game5 = Game.builder()
				.id(199)
				.gerne(Genre.Action)
				.name("Dark Souls 3")
				.platform("playstation 4")
				.rating(4.4).build();


		gameRepository.save(game1);
		gameRepository.save(game2);
		gameRepository.save(game3);
		gameRepository.save(game4);
		gameRepository.save(game5);
		gameRepository.save(game0);
	}
}
