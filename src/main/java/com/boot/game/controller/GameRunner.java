package com.boot.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boot.game.type.ContraGame;
import com.boot.game.type.GamingInteface;
import com.boot.game.type.MarioGame;

@Component
public class GameRunner {

	@Autowired
	private GamingInteface ginterface;

	public GameRunner(GamingInteface game) {
		this.ginterface =  game;
	}

	public void run() {
		ginterface.down();
		ginterface.up();
		ginterface.right();
		ginterface.left();
	}	
	
}
