package controllers;

import java.util.List;

import exceptions.InvalidGameParamsException;
import models.Game;
import models.GameStatus;
import models.Player;
import strategies.WinningStrategy;

public class GameController {
	
	public Game createGame(int dimension,
            List<Player> players,
            List<WinningStrategy> winningStrategies) throws InvalidGameParamsException {

	return Game.getBuilder()
	 .setDimension(dimension)
	 .setPlayers(players)
	 .setWinningStrategies(winningStrategies)
	 .build();
	}
	
	public void displayBoard(Game game) {
	game.printBoard();
	}
	
	public void undo(Game game) {
	game.undo();
	}
	
	public void makeMove(Game game) {
	game.makeMove();
	}
	
	public GameStatus getGameStatus(Game game) {
	return game.getGameStatus();
	}
	
	public void printResult(Game game) {
	game.printResult();
	}
	
	

}
