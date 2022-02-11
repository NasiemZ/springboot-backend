package gamepicker.net.springboot;

import gamepicker.net.springboot.games.Game;
import gamepicker.net.springboot.games.Genre;
import gamepicker.net.springboot.games.Plattform;
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
				.genre(Genre.Horror)
				.name("Dark Souls 2")
				.platform(Plattform.XBOXONE)
				.rating(4).build();

		Game game0 = Game.builder()
				.id(112)
				.genre(Genre.Action)
				.name("Dark Souls 3")
				.platform(Plattform.Boardgames)
				.rating(2).build();

		Game game2 = Game.builder()
				.id(11)
				.genre(Genre.Action)
				.name("Mario Cart")
				.platform(Plattform.PS5)
				.rating(5).build();

		Game game3 = Game.builder()
				.id(13)
				.genre(Genre.Strategy)
				.name("Zelda")
				.platform(Plattform.PC)
				.rating(3).build();

		Game game4 = Game.builder()
				.id(15)
				.genre(Genre.Action)
				.name("GTA5")
				.platform(Plattform.NintendoSwitch)
				.rating(4).build();

		Game game5 = Game.builder()
				.id(199)
				.genre(Genre.Action)
				.name("Counter Strike")
				.platform(Plattform.PS4)
				.rating(1).build();


		Game game6 = Game.builder()
				.id(113)
				.genre(Genre.Action)
				.name("Monopoly")
				.platform(Plattform.Boardgames)
				.rating(1).build();

		Game game7 = Game.builder()
				.id(114)
				.genre(Genre.JumpAndRun)
				.name("Mario")
				.platform(Plattform.NintendoSwitch)
				.rating(2).build();

		Game game8 = Game.builder()
				.id(115)
				.genre(Genre.Action)
				.name("Runescape")
				.platform(Plattform.PC)
				.rating(5).build();

		Game game9 = Game.builder()
				.id(116)
				.genre(Genre.Retro)
				.name("Half-Life2")
				.platform(Plattform.PC)
				.rating(3).build();

		Game game10 = Game.builder()
				.id(117)
				.genre(Genre.Retro)
				.name("Half-Life")
				.platform(Plattform.PC)
				.rating(1).build();


		gameRepository.save(game1);
		gameRepository.save(game2);
		gameRepository.save(game3);
		gameRepository.save(game4);
		gameRepository.save(game5);
		gameRepository.save(game0);
		gameRepository.save(game6);
		gameRepository.save(game7);
		gameRepository.save(game8);
		gameRepository.save(game9);
		gameRepository.save(game10);

	}
}
