public enum PlayerStatus {
    MY_TURN("MY_TURN") {
        @Override
        public PlayerStatus toggleStatus() {
            return PlayerStatus.NOT_MY_TURN;
        }
    },
    NOT_MY_TURN("NOT_MY_TURN") {
        @Override
        public PlayerStatus toggleStatus() {
            return PlayerStatus.MY_TURN;
        }
    };

    private String playerStatus;

    PlayerStatus(String playerStatus) {
        this.playerStatus = playerStatus;
    }

    public abstract PlayerStatus toggleStatus();

}
