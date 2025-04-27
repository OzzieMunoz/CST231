package wk13; /************************************************************
* This is starting code for a program that allows two users 
* to play Tic-Tac-Toe (also called noughts and crosses). It
* demonstrates manipulating 2D arrays
* To implement:
*   - Stub out all methods so that code compiles
*   - Implement printBoard() and resetBoard()
*   - Test
*   - Implement move()
*   - Uncomment the GAME LOOP and test again
*   - Finish checkWinHorizontal()
*   - Test
*   - Finish checkWinVertical()
*   - Test
*   - Finish checkDiagonal()
*   - Test

* Author: Dr. Joshua Gross (jgross@csumb.edu)
* Date: Spring 203
************************************************************/
import java.util.*;

public class TicTacToeMain {

    public static final int SIZE = 3;

    public static void main(String [] args) {
        char [][] board = new char[SIZE][SIZE];
        int moves = 0;
        resetBoard(board);
        boolean play = true;
        String replay;
        Scanner in = new Scanner(System.in);

        // replay loop
        while(play) {

            System.out.print("Starting a new game\n");
            resetBoard(board);
            moves = 0;

             while(moves < 9) {
                 printBoard(board);
                 move(board, 'X', in);
                 moves++;

                 if(checkWin(board)) {
                     System.out.print("X won!\n");
                     break;
                 } else if(moves == 9) {
                     System.out.print("Tie!\n");
                     break;
                 }

                 printBoard(board);
                 move(board, 'O', in);
                 moves++;
                 if(checkWin(board)) {
                     System.out.print("O won!\n");
                     break;
                 }
             }

            printBoard(board);
            System.out.print("\n");
            System.out.print("Play again? (y/n) ");
            replay = in.next();
            if(! replay.equalsIgnoreCase("y")) {
                play = false;
            }

        }
    }

    public static char getChar(int col, int row) {
        return (char) (row * 3 + col + 49);
    }

    public static void resetBoard(char [][] board) {
        for(int row = 0; row < SIZE; row++) {
            for(int col = 0; col < SIZE; col++) {
                board[row][col] = getChar(col, row);
            }
        }
    }

    public static void printBoard(char [][] board) {
        for(int row = 0; row < SIZE; row++) {
            for(int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void move(char [][] board, char c, Scanner in) {
        int row, col, input;
        do {
            System.out.print(c + ", enter a valid position for your move: ");
            input = in.nextInt();
            row = (input - 1) / SIZE;
            col = (input - 1) % SIZE;
            // System.out.print(row << " " << col << "\n");
        } while ((input < 1 || input > 9) || board[row][col] != input + 48);
        board[row][col] = c;
    }

    public static boolean checkWin(char [][] board) {
        return checkWinHorizontal(board) ||  checkWinVertical(board) ||
                checkWinDiagonal(board);
    }

    public static boolean checkWinDiagonal(char [][] board) {
        return (board[0][0] == board[1][1] && board[1][1] == board[2][2])
                || (board[0][2] == board[1][1] && board[1][1] == board[2][0]);
    }

    public static boolean checkWinVertical(char [][] board) {
        for (int col = 0; col < SIZE; col++) {
            if(board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkWinHorizontal(char [][] board) {
        for (int row = 0; row < SIZE; row++) {
            if(board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                return true;
            }
        }
        return false;
    }
}
