public class Board {
    static int rows = 10;
    static int columns = 10;
    public static int[][] board = new int[rows][columns];

    //Konstruktorn anropar metoden som skapar spelbrädan
    public Board() {
        grid();
    }

    /*Metod som skapar en spelbräda som är lika stor som har lika många rader som variabeln "rows"
    samt som har lika många kolumner som variabeln "columns"*/
    private void grid(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                //Alla rutor på brädan blir lika med 0 för tills det placeras ett skepp på den
                board[i][j] = 0;
            }
        }
        //for loopen skriver ut spelbrädan i konsolen så att spelaren kan se den
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(board[i][j]+" ");
            }
            //sout som gör så att alla nollor inte hamnar på samma rad men instället lägger till fler rader
            System.out.println();
        }
    }
}