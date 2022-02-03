package academy.devonline.tictactoe.component;

import academy.devonline.tictactoe.model.GameTable;
import academy.devonline.tictactoe.model.Sign;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public interface Move {

    void make(final GameTable gameTable, Sign sign);
}
