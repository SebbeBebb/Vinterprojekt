import java.util.Scanner;

public class P1_Side extends Board{
    static Scanner key = new Scanner(System.in);

    public P1_Side(){
        //Anropar super metoden i moderklassen som gör så att spelbrädan skrivs ut
        super();
    }

    //Metod som skriver ut de placerade skeppen till spelbrädan, tar in värden från användaren
    public static void placedCarrier(int row, int column) {
        System.out.print("Place it horizontal or vertical: ");
        String choice = key.nextLine();
        //if loop som gör så att du lägger ut skeppet horizontellt eller vertikalt beroende på om du skrev h eller v
        if (choice.equalsIgnoreCase("horizontal") || choice.equalsIgnoreCase("h")) {
            //
            /*if loop som gör så att om du lägger skeppet för nära väggen
             så kommer den ändra värdet så att den kan placeras utan problem*/
            if(column > 5){
                column = 5;
            }
            for (int i = 0; i < 5; i++) {
                board[row][column] = 1;
                column++;
            }

        } else if (choice.equalsIgnoreCase("vertical") || choice.equalsIgnoreCase("v")) {
            if(row > 5){
                row = 5;
            }
            for (int i = 0; i < 5; i++) {
                board[row][column] = 1;
                row++;
            }
        } else {
            System.out.println("Please choose a valid option");
        }
        //Skriver ut spelbrädan åt användaren med de nya skeppen
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Samma som Carrier men för de ett annat skepp så olika värden på kolumner och rader
    public static void placedBattleship(int row, int column) {
        System.out.print("Place it horizontal or vertical: ");
        String choice = key.nextLine();
        if (choice.equalsIgnoreCase("horizontal") || choice.equalsIgnoreCase("h")) {
            if(column > 6){
                column = 6;
            }
            for (int i = 0; i < 4; i++) {
                board[row][column] = 1;
                column++;
            }

        } else if (choice.equalsIgnoreCase("vertical") || choice.equalsIgnoreCase("v")) {
            if(row > 6){
                row = 6;
            }
            for (int i = 0; i < 4; i++) {
                board[row][column] = 1;
                row++;
            }
        } else {
            System.out.println("Please choose a valid option");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Samma som Carrier men för de ett annat skepp så olika värden på kolumner och rader
    public static void placedCruiser(int row, int column) {
        System.out.print("Place it horizontal or vertical: ");
        String choice = key.nextLine();
        if (choice.equalsIgnoreCase("horizontal") || choice.equalsIgnoreCase("h")) {
            if(column > 7){
                column = 7;
            }
            for (int i = 0; i < 3; i++) {
                board[row][column] = 1;
                column++;
            }

        } else if (choice.equalsIgnoreCase("vertical") || choice.equalsIgnoreCase("v")) {
            if(row > 7){
                row = 7;
            }
            for (int i = 0; i < 3; i++) {
                board[row][column] = 1;
                row++;
            }
        } else {
            System.out.println("Please choose a valid option");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Samma som Carrier men för de ett annat skepp så olika värden på kolumner och rader
    public static void placedSubmarine(int row, int column) {
        System.out.print("Place it horizontal or vertical: ");
        String choice = key.nextLine();
        if (choice.equalsIgnoreCase("horizontal") || choice.equalsIgnoreCase("h")) {
            if(column > 7){
                column = 7;
            }
            for (int i = 0; i < 3; i++) {
                board[row][column] = 1;
                column++;
            }

        } else if (choice.equalsIgnoreCase("vertical") || choice.equalsIgnoreCase("v")) {
            if(row > 7){
                row = 7;
            }
            for (int i = 0; i < 3; i++) {
                board[row][column] = 1;
                row++;
            }
        } else {
            System.out.println("Please choose a valid option");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Samma som Carrier men för de ett annat skepp så olika värden på kolumner och rader
    public static void placedDestroyer(int row, int column) {
        System.out.print("Place it horizontal or vertical: ");
        String choice = key.nextLine();
        if (choice.equalsIgnoreCase("horizontal") || choice.equalsIgnoreCase("h")) {
            if(column > 8){
                column = 8;
            }
            for (int i = 0; i < 2; i++) {
                board[row][column] = 1;
                column++;
            }

        } else if (choice.equalsIgnoreCase("vertical") || choice.equalsIgnoreCase("v")) {
            if(row > 8){
                row = 8;
            }
            for (int i = 0; i < 2; i++) {
                board[row][column] = 1;
                row++;
            }
        } else {
            System.out.println("Please choose a valid option");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}