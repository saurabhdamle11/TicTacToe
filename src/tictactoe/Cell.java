package tictactoe;

public class Cell {
    private Symbol symbol;

    public Cell(){
        this.symbol = Symbol.EMPTY;
    }

    public Symbol getSymbol(){
        return this.symbol;
    }

    public void setSymbol(Symbol symbol){
        this.symbol=symbol;
    }

    public boolean isEmpty(){
        return this.symbol == Symbol.EMPTY;
    }
}
