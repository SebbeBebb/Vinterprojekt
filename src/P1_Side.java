import java.util.Scanner;

public class P1_Side extends Board{
    static Scanner key = new Scanner(System.in);

    public P1_Side(){
        super();
    }

    public static void placedCarrier(int row, int column) {
        System.out.print("Place it horizontal or vertical: ");
        String choice = key.nextLine();
        if (choice.equalsIgnoreCase("horizontal") || choice.equalsIgnoreCase("h")) {
            for (int i = 0; i < 5; i++) {
                board[row][column] = 1;
                column++;
            }

        } else if (choice.equalsIgnoreCase("vertical") || choice.equalsIgnoreCase("v")) {
            for (int i = 0; i < 5; i++) {
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
    public static void placedBattleship(int row, int column) {
        System.out.print("Place it horizontal or vertical: ");
        String choice = key.nextLine();
        if (choice.equalsIgnoreCase("horizontal") || choice.equalsIgnoreCase("h")) {
            for (int i = 0; i < 4; i++) {
                board[row][column] = 1;
                column++;
            }

        } else if (choice.equalsIgnoreCase("vertical") || choice.equalsIgnoreCase("v")) {
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
    public static void placedCruiser(int row, int column) {
        System.out.print("Place it horizontal or vertical: ");
        String choice = key.nextLine();
        if (choice.equalsIgnoreCase("horizontal") || choice.equalsIgnoreCase("h")) {
            for (int i = 0; i < 3; i++) {
                board[row][column] = 1;
                column++;
            }

        } else if (choice.equalsIgnoreCase("vertical") || choice.equalsIgnoreCase("v")) {
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
    public static void placedSubmarine(int row, int column) {
        System.out.print("Place it horizontal or vertical: ");
        String choice = key.nextLine();
        if (choice.equalsIgnoreCase("horizontal") || choice.equalsIgnoreCase("h")) {
            for (int i = 0; i < 3; i++) {
                board[row][column] = 1;
                column++;
            }

        } else if (choice.equalsIgnoreCase("vertical") || choice.equalsIgnoreCase("v")) {
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
    public static void placedDestroyer(int row, int column) {
        System.out.print("Place it horizontal or vertical: ");
        String choice = key.nextLine();
        if (choice.equalsIgnoreCase("horizontal") || choice.equalsIgnoreCase("h")) {
            for (int i = 0; i < 2; i++) {
                board[row][column] = 1;
                column++;
            }

        } else if (choice.equalsIgnoreCase("vertical") || choice.equalsIgnoreCase("v")) {
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