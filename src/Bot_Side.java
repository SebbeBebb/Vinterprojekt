import java.util.Random;

public class Bot_Side extends Board{
    public Bot_Side(){
        super();
    }
    public static void botCarrier(int row, int column) {
            System.out.print("Place it horizontal or vertical: ");
            Random rand = new Random();
            int c = rand.nextInt(2);
            if (c == 0) {
                for (int i = 0; i < 5; i++) {
                    board[row][column] = 1;
                    column++;
                }
            } else if (c == 1) {
                for (int i = 0; i < 5; i++) {
                    board[row][column] = 1;
                    row++;
                }
            }
    }
    public static void botBattleship(int row, int column) {
            Random rand = new Random();
            int c = rand.nextInt(2);
            if (c==0) {
                for (int i = 0; i < 4; i++) {
                    board[row][column] = 1;
                    column++;
                }
            } else if (c==1) {
                for (int i = 0; i < 4; i++) {
                    board[row][column] = 1;
                    row++;
                }
            }
    }
    public static void botCruiser(int row, int column) {
            Random rand = new Random();
            int c = rand.nextInt(2);
            if (c==0) {
                for (int i = 0; i < 3; i++) {
                    board[row][column] = 1;
                    column++;
                }
            } else if (c==1) {
                for (int i = 0; i < 3; i++) {
                    board[row][column] = 1;
                    row++;
                }
            }
    }
    public static void botSubmarine(int row, int column) {
            Random rand = new Random();
            int c = rand.nextInt(2);
            if (c==0) {
                for (int i = 0; i < 3; i++) {
                    board[row][column] = 1;
                    column++;
                }
            } else if (c==1) {
                for (int i = 0; i < 3; i++) {
                    board[row][column] = 1;
                    row++;
                }
            }
    }
    public static void botDestroyer(int row, int column) {
            Random rand = new Random();
            int c = rand.nextInt(2);
            if (c==0) {
                for (int i = 0; i < 2; i++) {
                    board[row][column] = 1;
                    column++;
                }
            } else if (c==1) {
                for (int i = 0; i < 2; i++) {
                    board[row][column] = 1;
                    row++;
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
    }