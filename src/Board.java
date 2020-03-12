import com.sun.xml.internal.txw2.annotation.XmlCDATA;

public class Board {
    String[][] grid = new String[8][8];
    String token;

    public Board() {
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                grid[i][j] = "-";
            }
        }
    }

    // Prints the board.
    public void displayBoard() {
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    // Places a token in an empty spot.
    public boolean makeMove(int col, String token) {
        for (int i = 7; i > 0; i--) {
            if (grid[i][col] == "-") {
                grid[i][col] = token;
                return true;
            }
        }
        displayBoard();
        // DO I NEED THIS?
        return false;
    }

    public void determineWin() {

    }
}