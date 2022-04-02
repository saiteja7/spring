package springin28minitues.learningSpring.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class GameRunner {
	
	@Autowired
	GamingConsole game;
	
	public GameRunner(GamingConsole game){
		this.game=game;
	}

	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
