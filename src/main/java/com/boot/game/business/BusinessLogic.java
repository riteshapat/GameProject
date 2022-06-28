package com.boot.game.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boot.game.data.Datalogic;


@Component
 public class BusinessLogic {
	
	@Autowired
	 private Datalogic datalogic;
	
	public int calculateValue() {
		//return (312 * 192);
		List<Integer> data =  datalogic.sumTotal();
		// return data.stream().mapToInt(i-> i.intValue()).sum();
		 return data.stream().reduce(Integer::sum).get();
	}
}