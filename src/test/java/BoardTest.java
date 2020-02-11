import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    void shouldMatchFirstColumn() {
        Gesture row1[] = new Gesture[] {Gesture.X, Gesture.O, Gesture.X};
        Gesture row2[] = new Gesture[] {Gesture.X, Gesture.X, Gesture.O};
        Gesture row3[] = new Gesture[] {Gesture.X, Gesture.O, Gesture.X};
        Gesture gesture[][] = new Gesture[][]{row1, row2, row3};

        Board board = new Board(gesture);

        assertEquals("Matches Col 1", board.findMatching());
    }

    @Test
    void shouldMatchSecondRow() {
        Gesture row1[] = new Gesture[] {Gesture.X, Gesture.X, Gesture.O};
        Gesture row2[] = new Gesture[] {Gesture.O, Gesture.O, Gesture.O};
        Gesture row3[] = new Gesture[] {Gesture.X, Gesture.O, Gesture.X};
        Gesture gesture[][] = new Gesture[][]{row1, row2, row3};

        Board board = new Board(gesture);

        assertEquals("Matches Row 2", board.findMatching());
    }

    @Test
    void shouldReturnNoMatchIfNoMatchIsFound() {
        Gesture row1[] = new Gesture[] {Gesture.X, Gesture.X, Gesture.O};
        Gesture row2[] = new Gesture[] {Gesture.O, Gesture.O, Gesture.X};
        Gesture row3[] = new Gesture[] {Gesture.X, Gesture.X, Gesture.O};
        Gesture gesture[][] = new Gesture[][]{row1, row2, row3};

        Board board = new Board(gesture);

        assertEquals("No Match", board.findMatching());
    }
}