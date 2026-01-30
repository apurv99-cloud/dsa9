public class nKnight {

    public static boolean isSafe(char board[][], int row, int col) {
        int[][] moves = { { -1, +2 }, { +1, +2 }, { -1, -2 }, { +1, -2 }, { +2, -1 }, { +2, +1 }, { -2, +1 },
                { -2, -1 } };

        for (int i = 0; i < moves.length; i++) {
            int newRow = row + moves[i][0];
            int newCol = col + moves[i][1];
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board.length
                    && board[newRow][newCol] == 'K') {
                return false;
            }

        }
        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("........... CHESS BOARD ............");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void nKnight(char board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'K';
                nKnight(board, row + 1);
                board[row][j] = '.';

            }

        }

    }

    public static void main(String args[]) {
        int n = 3;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';

            }
        }
        nKnight(board, 0);
    }
}
