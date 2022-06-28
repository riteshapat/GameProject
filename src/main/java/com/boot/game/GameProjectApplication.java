package com.boot.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.boot.game.controller.GameRunner;
import com.boot.game.type.ContraGame;
import com.boot.game.type.MarioGame;

@SpringBootApplication
public class GameProjectApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(GameProjectApplication.class, args);
		
		//MarioGame game = new MarioGame();
		//ContraGame game = new ContraGame();
		
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
	}

}
