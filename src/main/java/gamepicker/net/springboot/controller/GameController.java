package gamepicker.net.springboot.controller;


import gamepicker.net.springboot.games.Game;
import gamepicker.net.springboot.repsoitory.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping("/games")
    public List<Game> fetchGames(){
        return gameRepository.findAll();
    }

}
