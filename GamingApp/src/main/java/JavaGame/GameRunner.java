package JavaGame;

public class GameRunner {

   // public Pacman game;
   public GamingConsole game;

    public GameRunner(GamingConsole game){
        this.game = game;
    }

    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
