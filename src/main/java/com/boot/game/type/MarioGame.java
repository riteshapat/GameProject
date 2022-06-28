package com.boot.game.type;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingInteface {

	@Override
	public void up() {
		System.out.println("it is up");
	}
	
	@Override
	public void down() {
		System.out.println("go down");
	}
	
	@Override
	public void right() {
		System.out.println("go to right ");
	}
	
	@Override
	public void left() {
		System.out.println("it is left"	);
		}
	
}
