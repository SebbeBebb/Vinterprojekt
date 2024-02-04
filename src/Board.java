public class Board {
    static int rows = 10;
    static int columns = 10;
    public static int[][] board = new int[rows][columns];

    public Board() {
        grid();
    }

    private void grid(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = 0;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}