import java.lang.reflect.GenericArrayType;

public class Board {
    private Gesture gesture[][];
    private final int MAX_ROW = 3;
    private final int MAX_COL = 3;
    private GameMode gameMode;

    public Board(Gesture[][] gesture) {
        this.gesture = gesture;
        gameMode = GameMode.ONGOING;
    }

    public Board() {
        this.gesture = new Gesture[MAX_ROW][MAX_COL];
        gameMode = GameMode.ONGOING;
    }

    public Gesture findMatching() {
        return findSimilaritiesInRow();
    }

    private Gesture findSimilaritiesInRow() {
        for (int rowNum = 0;rowNum < MAX_ROW;rowNum++) {
            Gesture firstCell = gesture[rowNum][0];
            Gesture secondCell = gesture[rowNum][1];
            Gesture thirdCell = gesture[rowNum][2];

            if (firstCell.equals(secondCell) && firstCell.equals(thirdCell)) {
                return firstCell;
            }
        }
        return findSimilaritiesInColumn();
    }

    private Gesture findSimilaritiesInColumn() {
        for (int colNum = 0;colNum < MAX_COL;colNum++) {
            Gesture firstCell = gesture[0][colNum];
            Gesture secondCell = gesture[1][colNum];
            Gesture thirdCell = gesture[2][colNum];

            if (firstCell.equals(secondCell) && firstCell.equals(thirdCell)) {
                return firstCell;
            }
        }
        return findSimilaritiesInDiagonal();
    }

    private Gesture findSimilaritiesInDiagonal() {
        Gesture firstCell = gesture[0][0];
        Gesture secondCell = gesture[1][1];
        Gesture thirdCell = gesture[2][2];

        if (firstCell.equals(secondCell) && firstCell.equals(thirdCell)) {
            return firstCell;
        }

        firstCell = gesture[0][2];
        secondCell = gesture[1][1];
        thirdCell = gesture[2][0];

        if (firstCell.equals(secondCell) && firstCell.equals(thirdCell)) {
            return firstCell;
        }

        return null;
    }

    public void add(int coOrdinate1, int coOrdinate2, Gesture playerGesture) {
        if (gameMode.equals(GameMode.ONGOING)) {
            gesture[coOrdinate1][coOrdinate2] = playerGesture;
            if (findMatching() == null) {
                gameMode = gameMode.toggleGameMode();
            }
        }
    }
}
