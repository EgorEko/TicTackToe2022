package academy.devonline.tictactoe.component;

import academy.devonline.tictactoe.model.Cell;
import academy.devonline.tictactoe.model.GameTable;

import java.util.Scanner;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class UserMove {

    private final CellNumberConverter cellNumberConverter;

    public UserMove(CellNumberConverter cellNumberConverter) {
        this.cellNumberConverter = cellNumberConverter;
    }

    public void make(final GameTable gameTable) {
        while (true) {
            final Cell cell = getUserInput();
            if (gameTable.isEmpty(cell)) {
                gameTable.setSign(cell, 'x');
                return;
            } else {
                System.out.println("Can't make a move, because the cell is not free! Try again");
            }
        }
    }

    private Cell getUserInput() {
        while (true) {
            System.out.println("Please type number between 1 and 9:");
            final String userInput = new Scanner(System.in).nextLine();
            if (userInput.length() == 1) {
                final char ch = userInput.charAt(0);
                if (ch >= '1' && ch <= '9') {
                    return cellNumberConverter.toCell(ch);
                }
            }
        }
    }
}