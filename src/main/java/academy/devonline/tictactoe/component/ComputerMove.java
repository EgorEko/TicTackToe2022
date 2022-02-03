package academy.devonline.tictactoe.component;

import academy.devonline.tictactoe.model.Cell;
import academy.devonline.tictactoe.model.GameTable;
import academy.devonline.tictactoe.model.Sign;

import java.util.Random;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class ComputerMove implements Move {

    @Override
    public void make(final GameTable gameTable, final Sign sign) {
        final Random random = new Random();
        while (true) {
            final int raw = random.nextInt(3);
            final int col = random.nextInt(3);
            final Cell randomCell = new Cell(raw, col);
            if (gameTable.isEmpty(randomCell)) {
                gameTable.setSign(randomCell, sign);
                return;
            }
        }
    }
}
