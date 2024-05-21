import java.util.Random;

public class Bot_Side extends Board{
    public Bot_Side(){
        //Anropar metoden i moderklassen som skapar en spelbräda åt botten
        super();
    }
    //Metod som placerar en carrier på en slumpmässig plats på spelbrädan
    public static void botCarrier(int row, int column) {
            Random rand = new Random();
            //Slumpar om skeppet ska placeras horizontellt eller vertikalt
            int c = rand.nextInt(2);
            //Horizontellt
            if (c == 0) {
                for (int i = 0; i < 5; i++) { //Carriern är fem rutor stor, därför går for loopen endast till 5
                    board[row][column] = 1;
                    column++;
                }
            //Vertikalt
            } else if (c == 1) {
                for (int i = 0; i < 5; i++) {
                    board[row][column] = 1;
                    row++;
                }
            }
    }
    //Samma som för carriern men med ett annat skepp, olika värden på var på brädan som skeppet kan bli placerat
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
    //Samma som för carriern men med ett annat skepp, olika värden på var på brädan som skeppet kan bli placerat
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
    //Samma som för carriern men med ett annat skepp, olika värden på var på brädan som skeppet kan bli placerat
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
    //Samma som för carriern men med ett annat skepp, olika värden på var på brädan som skeppet kan bli placerat
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