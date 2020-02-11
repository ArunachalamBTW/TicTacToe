public class Board {
    private Gesture gesture[][];
    private final int MAX_ROW = 3;
    private final int MAX_COL = 3;

    public Board(Gesture[][] gesture) {
        this.gesture = gesture;
    }

    public String findMatching() {
        return findSimilaritiesInRow();
    }

    private String findSimilaritiesInRow() {
        for (int rowNum = 0;rowNum < MAX_ROW;rowNum++) {
            Gesture firstCell = gesture[rowNum][0];
            Gesture secondCell = gesture[rowNum][1];
            Gesture thirdCell = gesture[rowNum][2];

            if (firstCell.equals(secondCell) && firstCell.equals(thirdCell)) {
                return "Matches Row "+(rowNum+1);
            }
        }
        return findSimilaritiesInColumn();
    }

    private String findSimilaritiesInColumn() {
        for (int colNum = 0;colNum < MAX_ROW;colNum++) {
            Gesture firstCell = gesture[0][colNum];
            Gesture secondCell = gesture[1][colNum];
            Gesture thirdCell = gesture[2][colNum];

            if (firstCell.equals(secondCell) && firstCell.equals(thirdCell)) {
                return "Matches Col "+(colNum+1);
            }
        }
        return findSimilaritiesInDiagonal();
    }

    private String findSimilaritiesInDiagonal() {
//        for (int rowNum = 0;rowNum < MAX_ROW;rowNum++) {
            Gesture firstCell = gesture[0][0];
            Gesture secondCell = gesture[1][1];
            Gesture thirdCell = gesture[2][2];

            if (firstCell.equals(secondCell) && firstCell.equals(thirdCell)) {
                return "Matches Left to Right Diagonal";
            }
//        }

//        for (int rowNum = 0;rowNum < MAX_ROW;rowNum++) {
            firstCell = gesture[0][2];
            secondCell = gesture[1][1];
            thirdCell = gesture[2][0];

            if (firstCell.equals(secondCell) && firstCell.equals(thirdCell)) {
                return "Matches Right to Left Diagonal";
            }
//        }
        return "No Match";
    }
}
