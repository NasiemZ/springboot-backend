package gamepicker.net.springboot.repsoitory;

import gamepicker.net.springboot.games.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {

}
