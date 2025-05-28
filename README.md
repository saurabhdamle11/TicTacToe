# Tic Tac Toe Java Implementation

This project is a simple, object-oriented implementation of the classic Tic Tac Toe game in Java.

## Project Structure

- `src/tictactoe/`: Contains all Java source files for the game.
- `bin/tictactoe/`: Contains compiled `.class` files.
- `lib/`: For external dependencies (currently unused).
- `.vscode/`: VS Code settings.

## Main Components

- [`Game`](src/tictactoe/Game.java): Manages game state, player turns, and win/draw logic.
- [`Board`](src/tictactoe/Board.java): Represents the game board and handles move placement and win checks.
- [`Cell`](src/tictactoe/Cell.java): Represents a single cell on the board.
- [`Player`](src/tictactoe/Player.java): Represents a player with a name and symbol.
- [`Symbol`](src/tictactoe/Symbol.java): Enum for X, O, and EMPTY.
- [`GameStatus`](src/tictactoe/GameStatus.java): Enum for game status (IN_PROGRESS, WIN, DRAW).
- [`ticTacToeDemo`](src/tictactoe/ticTacToeDemo.java): Demo class with a sample game run.

## How to Run

1. **Compile the code:**
   ```sh
   javac -d bin src/tictactoe/*.java
   ```

2. **Run the demo:**
   ```sh
   java -cp bin tictactoe.ticTacToeDemo
   ```

## Example Usage

The demo (`ticTacToeDemo`) creates two players and plays a sequence of moves, printing the board after each move and announcing the winner or draw.

## Customization

- Change the board size by modifying the size parameter in the `Game` constructor.
- Add more features or a user interface as needed.

## License

MIT License (add your license here if needed).
