package gamepicker.net.springboot.controller;


import gamepicker.net.springboot.games.Game;
import gamepicker.net.springboot.games.Genre;
import gamepicker.net.springboot.games.Plattform;
import gamepicker.net.springboot.repsoitory.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api")
@CrossOrigin()
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping("/games")
    public List<Game> fetchGames(){
        return gameRepository.findAll();
    }

    @GetMapping("/genre")
    public List<Genre> fetchGenre(){
        return Arrays.asList(Genre.values());
    }
    @GetMapping("/plattform")
    public List<Plattform> fetchPlattform(){
        return Arrays.asList(Plattform.values());
    }

    @PostMapping("/games")
    public void postGame(@RequestBody Game newGame) {
        this.gameRepository.save(new Game(newGame.getId(),newGame.getName(),newGame.getPlatform(),newGame.getGenre(),newGame.getRating()));
    }

    @DeleteMapping("/games/{gameID}")
    public void deleteGame(@PathVariable("gameID") long gameID){
        this.gameRepository.deleteById(gameID);
    }

    @PutMapping("/games/{gameID}")
    public void updateGame(@PathVariable("gameID") long gameID,@RequestBody Game editGame){
        this.gameRepository.findById(gameID).map(game -> {
            game.setName(editGame.getName());
            game.setPlatform(editGame.getPlatform());
            game.setGenre(editGame.getGenre());
            game.setRating(editGame.getRating());
            return this.gameRepository.save(game);
        });
    }

    @PatchMapping("/games/{gameID}")
    public void updateRating(@PathVariable("gameID") long gameID,@RequestBody Game editGame){
        this.gameRepository.findById(gameID).map(game -> {
            game.setRating(editGame.getRating());
            return this.gameRepository.save(game);
        });
    }

    @GetMapping("/random")
    public Game fetchRandom(){
        List<Game> games = this.gameRepository.findAll();
        int random = (int)(Math.random() * games.size());
        return games.get(random);
    }
}
