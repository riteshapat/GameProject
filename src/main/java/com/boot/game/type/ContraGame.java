package com.boot.game.type;

import org.springframework.stereotype.Component;

//@Component
public class ContraGame implements GamingInteface {
	
	public void up() {
		System.out.println("Skyrocker up ");
	}
	
	public void down() {
		System.out.println("digging to hell");
	}
	
	public void right() {
		System.out.println(" Turn to Right ");
	}
	
	public void left() {
		System.out.println(" look left"	);
		}

}
