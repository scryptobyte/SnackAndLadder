package com.shubham.rastogi;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import com.shubham.rastogi.dto.SnackNLadder;
import com.shubham.rastogi.service.GameService;
import com.shubham.rastogi.service.GameServiceImpl;

public class Main {

	public static void main(String[] args) {
		Map<Integer,Integer> snake = new HashMap<Integer,Integer>();
		Map<Integer,Integer> ladder = new HashMap<Integer,Integer>();
		
		{
			snake.put(99,54);
			snake.put(70,55);
			snake.put(52,42);
			snake.put(25,2);
			snake.put(95,72);
			
			ladder.put(6,25);
			ladder.put(11,40);
			ladder.put(60,85);
			ladder.put(46,90);
			ladder.put(17,69);
		}
		Integer totalPoint = 100;
		SnackNLadder board = new SnackNLadder(totalPoint,snake,ladder);
		
		GameService service = new GameServiceImpl();
		service.startGame(board);
	}

}