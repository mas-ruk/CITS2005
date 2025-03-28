public class GameOfLife {    
    private boolean[][] grid;

    public GameOfLife(boolean[][] initialGrid) {
        grid = initialGrid;
    }

    public void printGrid() {
        // TODO
        for (int i = 0; i < grid.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]) {
                    System.out.print("O");
                } else {
                    System.out.print(".");
                }
            }
        }
    }
    
    public void checkCardinalDirections() {
        // init constants for no of rows and columns
        int rows = grid.length;
        int columns = grid[0].length;
        boolean[][] nextGrid = new boolean[rows][columns];
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int count = 0; // reset count for each cell
                // check 8 directions with wrap around
                if (grid[(i + 1) % rows][j]) { // right
                    count++;
                }
                if (grid[(i - 1 + rows) % rows][j]) { // left
                    count++;
                }
                if (grid[i][(j + 1) % columns]) { // down
                    count++;
                }
                if (grid[i][(j - 1 + columns) % columns]) { // up
                    count++;
                }
                if (grid[(i + 1) % rows][(j + 1) % columns]) { // lower-right
                    count++;
                }
                if (grid[(i - 1 + rows) % rows][(j + 1) % columns]) { // lower-left
                    count++;
                }
                if (grid[(i - 1 + rows) % rows][(j - 1 + columns) % columns]) { // upper-left
                    count++;
                }
                if (grid[(i + 1) % rows][(j - 1 + columns) % columns]) { // upper-right
                    count++;
                }

                if (grid[i][j] && (count == 3 || count == 2)) {
                    nextGrid[i][j] = true; // live cell survives
                } else if (!grid[i][j] && count == 3) { // check if dead cell is ressurected
                    nextGrid[i][j] = true;
                } else {
                    nextGrid[i][j] = false; // cell dies or remains dead
                }
            }
        }
        grid = nextGrid;
    }

    public void simulateStep() {
            checkCardinalDirections();
    }
    

    public static void main(String[] args) {
        boolean[][] initialGrid = new boolean[10][10];
        initialGrid[4][5] = true;
        initialGrid[4][6] = true;
        initialGrid[5][4] = true;
        initialGrid[5][5] = true;
        initialGrid[6][5] = true;
        GameOfLife game = new GameOfLife(initialGrid);
        for (int i = 0; i < 10; i++) {
            System.out.println("Before Step " + (i+1));
            game.printGrid();
            System.out.println();
            game.simulateStep();
        }
    }
}