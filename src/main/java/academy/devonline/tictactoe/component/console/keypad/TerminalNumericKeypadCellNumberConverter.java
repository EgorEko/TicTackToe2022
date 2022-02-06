package academy.devonline.tictactoe.component.console.keypad;

import academy.devonline.tictactoe.component.console.CellNumberConverter;
import academy.devonline.tictactoe.model.game.Cell;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class TerminalNumericKeypadCellNumberConverter implements CellNumberConverter {

    /*private final char[][] mapping = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };*/

    @Override
    public Cell toCell(final char number) {
        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mapping[i][j] == number) {
                    return new Cell(i, j);
                }
            }
        }
        return null;*/
        final int val = number - '0' - 1;
        return new Cell(val / 3, val % 3);
    }

    @Override
    public char toNumber(final Cell cell) {
        /*return mapping[cell.getRow()][cell.getCol()];*/
        return (char) ('0' + (cell.getRow() * 3 + cell.getCol() + 1));
    }
}