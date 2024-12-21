package SpringGame;

import JavaGame.GameRunner;
import JavaGame.GamingConsole;
import JavaGame.Mario;
import JavaGame.Pacman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {


    @Bean
    public GamingConsole game(){
        var game = new Mario();
        return game;
    }
    @Bean
    public GameRunner gameRunner(){
        GameRunner gameRunner = new GameRunner(game());
        return gameRunner;
    }


}
