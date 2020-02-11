import java.util.HashMap;
import java.util.Map;

public class TicTacToe {
    private Board board;
    private Player player1;
    private Player player2;

    private Map<Gesture, Player> playerGestureMap = new HashMap<>();

    public TicTacToe(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

//    public Player createPlayer1() {
//        Gesture player1Gesture = Gesture.X;
//        Player player = new Player(player1Gesture, PlayerStatus.MY_TURN);
//        playerGestureMap.put(Gesture.X, player);
//        return player;
//    }

}
