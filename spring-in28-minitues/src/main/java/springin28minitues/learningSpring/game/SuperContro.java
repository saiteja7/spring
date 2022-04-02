package springin28minitues.learningSpring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContro implements GamingConsole {

	@Override
	public void up() {
		System.out.println("up");
	}
	@Override
	public void down() {
		System.out.println("down");
	}
	
	@Override
	public void left() {
		System.out.println("left");
	}
	
	@Override
	public void right() {
		System.out.println("right");
	}
	

}
