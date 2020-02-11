import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    @Test
    void shouldReturnPlayer1IsWinner() {
        Board board = new Board();
        TicTacToe game = new TicTacToe(board);
        Player player1 = game.createPlayer1();
        Player player2 = game.createPlayer2();

        player1.play(board, 1, 1);
        player2.play(board, 2, 1);
        player1.play(board, 1, 2);
        player2.play(board, 2, 2);
        player1.play(board, 1, 3);

        System.out.println(game.findWinner());

        assertEquals("Player 1 is Winner", game.findWinner());
    }
}