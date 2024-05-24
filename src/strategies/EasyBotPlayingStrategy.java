package strategies;

import java.util.List;

import models.Board;
import models.Cell;
import models.CellStatus;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{

	 @Override
	    public Cell makeMove(Board board) {

	        for (List<Cell> row: board.getBoard()) {
	            for (Cell cell: row) {
	                if (cell.getCellStatus().equals(CellStatus.EMPTY)) {
	                    return cell;
	                }
	            }
	        }

	        return null; // You should never come here
	    }
	}