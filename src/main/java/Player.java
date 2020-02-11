public class Player {
    private final Gesture gesture;
    private PlayerStatus playerStatus;
    private String name;

    public Player(Gesture gesture, PlayerStatus playerStatus, String name) {
        this.gesture = gesture;
        this.playerStatus = playerStatus;
        this.name = name;
    }

    public void play(Board board, int coOrdinate1, int coOrdinate2) {
        if (playerStatus.equals(PlayerStatus.MY_TURN)) {
            board.add(coOrdinate1 - 1, coOrdinate2 - 1, gesture);
            playerStatus = playerStatus.toggleStatus();
        }
    }

    public String getName() {
        return name;
    }
}
