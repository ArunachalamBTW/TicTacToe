public class Player {
    private final Gesture gesture;
    private PlayerStatus playerStatus;

    public Player(Gesture gesture, PlayerStatus playerStatus) {
        this.gesture = gesture;
        this.playerStatus = playerStatus;
    }

    public void play(Board board, int coOrdinate1, int coOrdinate2) {
        if (playerStatus.equals(PlayerStatus.MY_TURN)) {
            board.add(coOrdinate1, coOrdinate2, gesture);
            playerStatus = playerStatus.toggleStatus();
        }
    }

}
