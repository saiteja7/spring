package springin28minitues.learningSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import springin28minitues.learningSpring.game.GameRunner;
import springin28minitues.learningSpring.game.MarioGame;

@SpringBootApplication
public class SpringIn28MinituesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringIn28MinituesApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
//		MarioGame game = new MarioGame();
//		GameRunner runner = new GameRunner(game);
		runner.runGame();
	}

}
