package com.boot.game.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.game.business.BusinessLogic;

@RestController
public class Controller {

	@Autowired
	private  BusinessLogic businessLogic;

	@RequestMapping("/sum")
	public int add() {
		return businessLogic.calculateValue();
	}
}