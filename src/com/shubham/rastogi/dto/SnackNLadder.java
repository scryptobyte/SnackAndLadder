package com.shubham.rastogi.dto;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SnackNLadder
{
	private  int winPoint;
	private Map<Integer,Integer> snake ;
	private Map<Integer,Integer> ladder;
	public int getWinPoint() {
		return winPoint;
	}
	public void setWinPoint(int winPoint) {
		this.winPoint = winPoint;
	}
	public Map<Integer, Integer> getSnake() {
		return snake;
	}
	public void setSnake(Map<Integer, Integer> snake) {
		this.snake = snake;
	}
	public Map<Integer, Integer> getLadder() {
		return ladder;
	}
	public void setLadder(Map<Integer, Integer> ladder) {
		this.ladder = ladder;
	}
	public SnackNLadder(int winPoint, Map<Integer, Integer> snake, Map<Integer, Integer> ladder) {
		this.winPoint = winPoint;
		this.snake = snake;
		this.ladder = ladder;
	}
	@Override
	public String toString() {
		return "SnackNLadder [winPoint=" + winPoint + ", Number of snakes=" + snake.size() + ",Number of ladder=" + ladder.size() + "]";
	}
	
}
