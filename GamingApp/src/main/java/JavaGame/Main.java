package JavaGame;

public class Main {
    public static void main(String[] args) {
        Pacman pacman = new Pacman();
        Mario mario = new Mario();

        GameRunner gameRunner = new GameRunner(pacman);

        gameRunner.run();
    }
}