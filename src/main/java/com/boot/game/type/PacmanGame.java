package com.boot.game.type;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements GamingInteface {

	@Override
	public void up() {
		System.out.println("PAC is eating to North");
	}

	@Override
	public void down() {
		System.out.println("PAC is eating to down");		
	}

	@Override
	public void right() {
		System.out.println("PAC is eating to Right");		
	}

	@Override
	public void left() {
		System.out.println("PAC is eating to Left");		
	}

}
