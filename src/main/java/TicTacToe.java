import java.util.HashMap;
import java.util.Map;

public class TicTacToe {
    private Board board;
    private Player player1;
    private Player player2;

    private Map<Gesture, Player> playerGestureMap = new HashMap<>();

    public TicTacToe(Board board) {
        this.board = board;
    }

    public Player createPlayer1() {
        Gesture player1Gesture = Gesture.X;
        player1 = new Player(player1Gesture, PlayerStatus.MY_TURN, "Player 1");
        playerGestureMap.put(player1Gesture, player1);
        return player1;
    }

    public Player createPlayer2() {
        Gesture player2Gesture = Gesture.O;
        player2 = new Player(player2Gesture, PlayerStatus.NOT_MY_TURN, "Player 2");
        playerGestureMap.put(player2Gesture, player2);
        return player2;
    }

    public String findWinner() {
        Gesture winnerGesture = board.findMatching();
        if (winnerGesture == null) {
            return "No Winner";
        }
        Player winningPlayer = playerGestureMap.get(winnerGesture);
        return winningPlayer +" is Winner";
    }

}
