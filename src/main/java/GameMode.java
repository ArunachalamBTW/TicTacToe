public enum GameMode {
    ONGOING("ONGOING") {
        @Override
        public GameMode toggleGameMode() {
            return GameMode.FINISHED;
        }
    },
    FINISHED("FINISHED") {
        @Override
        public GameMode toggleGameMode() {
            return GameMode.FINISHED;
        }
    };

    private String  gameMode;

    GameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public abstract GameMode toggleGameMode();

}
