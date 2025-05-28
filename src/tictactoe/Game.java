package tictactoe;

public class Game {
    private final Player[] players;
    private final Board board;
    private int currentPlayerIndex;
    private GameStatus gameStatus;

    public Game(Player player1, Player player2, int size){
        this.players = new Player[]{player1,player2};
        this.board = new Board(size);
        this.currentPlayerIndex=0;
        this.gameStatus = GameStatus.IN_PROGRESS;
    }

    public synchronized boolean playMove(int row, int col){
        if(this.gameStatus!=GameStatus.IN_PROGRESS){
            throw new IllegalStateException("Game Already finished");
        }

        if(!this.board.isValid(row, col)){
            throw new IllegalArgumentException("Invalid move");
        }

        Player current = this.players[currentPlayerIndex];
        this.board.placeMove(row, col, current.getSymbol());

        if(board.checkWin(current.getSymbol())){
            this.gameStatus = GameStatus.WIN;
            System.out.println(current.getName()+" wins!");
        }
        else if(this.board.isFull()){
            this.gameStatus = GameStatus.DRAW;
            System.out.println("Game ended in a draw!");
        }
        else{
            currentPlayerIndex=1-currentPlayerIndex;
        }
        return true;
    }

    public synchronized void reset(){
        this.board.reset();
    }

    public GameStatus getStatus(){
        return this.gameStatus;
    }

    public void printBoard(){
        this.board.print();
    }
}
