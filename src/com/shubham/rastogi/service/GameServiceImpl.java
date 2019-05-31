package com.shubham.rastogi.service;

import java.util.Random;
import java.util.Scanner;

import com.shubham.rastogi.dto.SnackNLadder;

public class GameServiceImpl implements GameService {
	public int rollDice()
	{
		int n = 0;
		Random r = new Random();
		n=r.nextInt(7);
		return (n==0?1:n);
	}
	
	public void startGame(SnackNLadder board)
	{
		int player1 =0, player2=0;
		int currentPlayer=-1;
		Scanner s = new Scanner(System.in);
		String str;
		int diceValue =0;
		while(true)
		{
			System.out.println(currentPlayer==-1?"FIRST PLAYER TURN":"SECOND PLAYER TURN");
			System.out.println("Press Key to roll Dice");
			str = s.next();
			diceValue = rollDice();
			if(currentPlayer == -1)
			{
				player1 = calculatePlayerValue(board, player1,diceValue);
				System.out.println("First Player :: " + player1);
				System.out.println("Second Player :: " + player2);
				System.out.println("------------------");
				if(isWin(board, player1))
				{
					System.out.println("First player wins");
					return;
				}
			}
			else
			{
				player2 = calculatePlayerValue(board, player2,diceValue);
				System.out.println("First Player :: " + player1);
				System.out.println("Second Player :: " + player2);
				System.out.println("------------------");
				if(isWin(board, player2))
				{
					System.out.println("Second player wins");
					return;
				}
			}
			currentPlayer= -currentPlayer;
		}
	}
	
	
	public int calculatePlayerValue(SnackNLadder board,int player, int diceValue)
	{
		player = player + diceValue;
		
		if(player > board.getWinPoint())
		{
			player = player - diceValue;
			return player;
		}
		
		if(null!=board.getSnake().get(player))
		{
			System.out.println("swallowed by snake");
			player= board.getSnake().get(player);
		}
		
		if(null!=board.getLadder().get(player))
		{
			System.out.println("climb up the ladder");
			player= board.getLadder().get(player);
		}
		return player;
	}
	
	public boolean isWin(SnackNLadder board,int player)
	{
		return board.getWinPoint() == player;
	}
}
