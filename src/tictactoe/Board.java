package tictactoe;

public class Board {
    private final Cell[][] grid;
    private final int size;
    private final int moveCount;

    public Board(int size){
        this.size=size;
        this.grid = new Cell[size][size];
        this.moveCount=0;
        initializeCell();
    }

    private void initializeCell(){
        int size = this.size;
        for(int i=0;i<size;++i){
            for(int j=0;j<size;++j){
                this.grid[i][j] = new Cell();
            }
        }
    }

    public boolean isValid(int x, int y){
        if(x>=0 && x<this.size && y>=0 && y<this.size && this.grid[x][y].isEmpty()){
            return true;
        }
        return false;
    }

    public void placeMove(int row, int col, Symbol symbol){
        this.grid[row][col].setSymbol(symbol);
    }

    public boolean checkWin(Symbol symbol) {
        for (int i = 0; i < size; i++) {
            boolean rowWin = true;
            for (int j = 0; j < size; j++) {
                if (grid[i][j].getSymbol() != symbol) {
                    rowWin = false;
                    break;
                }
            }
            if (rowWin) return true;
        }

        for (int j = 0; j < size; j++) {
            boolean colWin = true;
            for (int i = 0; i < size; i++) {
                if (grid[i][j].getSymbol() != symbol) {
                    colWin = false;
                    break;
                }
            }
            if (colWin) return true;
        }

        boolean diag1 = true, diag2 = true;
        for (int i = 0; i < size; i++) {
            if (grid[i][i].getSymbol() != symbol) diag1 = false;
            if (grid[i][size - i - 1].getSymbol() != symbol) diag2 = false;
        }

        return diag1 || diag2;
    }

    public boolean isFull(){
        return this.moveCount==this.size*this.size;
    }

    public void reset(){
        for(int i=0;i<this.size;++i){
            for(int j=0;j<this.size;++j){
                this.grid[i][j].setSymbol(Symbol.EMPTY);
            }
        }
    }

    public void print() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(grid[row][col].getSymbol() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
