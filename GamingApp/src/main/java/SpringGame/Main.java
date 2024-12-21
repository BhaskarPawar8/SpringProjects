package SpringGame;

import JavaGame.GameRunner;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(MyConfiguration.class);

        context.getBean(GameRunner.class).run();

    }
}
