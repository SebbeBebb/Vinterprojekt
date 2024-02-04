import java.util.Scanner;

public class Player1 extends Players {
    Scanner key = new Scanner(System.in);
    int placeCa = 0;
    int placeB = 0;
    int placeCr = 0;
    int placeS = 0;
    int placeD = 0;
    boolean val = true;

    public Player1() {
        super();
        new P1_Side();
        while (val==true) placeShip();
    }

    private void placeShip() {
        System.out.println("What ship do would you like to place?");
        System.out.println(getShips());
        int choice = key.nextInt();
        switch (choice) {
            case 1 -> {
                if (placeCa == 0) {
                    System.out.println("You place Carrier");
                    placeCarrier();
                    placeCa = 1;
                } else {
                    System.out.println("Du har redan plaserat en Carrier");
                }
            }
            case 2 -> {
                if (placeB == 0) {
                    System.out.println("You place Battleship");
                    placeBattleship();
                    placeB = 1;
                } else {
                    System.out.println("Du har redan plaserat en Battleship");
                }
            }
            case 3 -> {
                if (placeCr == 0) {
                    System.out.println("You place Cruiser");
                    placeCruiser();
                    placeCr = 1;
                } else {
                    System.out.println("Du har redan plaserat en Cruiser");
                }
            }
            case 4 -> {
                if (placeS == 0) {
                    System.out.println("You place Submarine");
                    placeSubmarine();
                    placeS = 1;
                } else {
                    System.out.println("Du har redan plaserat en Submarine");
                }
            }
            case 5 -> {
                if (placeD == 0) {
                    System.out.println("You place Destroyer");
                    placeDestroyer();
                    placeD = 1;
                } else {
                    System.out.println("Du har redan plaserat en Destroyer");
                }
            }
            default -> System.out.println("Välj ett nummmer");
        }
        if (placeD==1 && placeS==1 && placeCa==1 && placeCr==1 && placeB==1) {
            val=false;
        }
    }

    private void placeCarrier() {
        System.out.println("Where will you place it?");
        System.out.print("Row: ");
        int R = key.nextInt();
        System.out.print("Column: ");
        int C = key.nextInt();
        P1_Side.placedCarrier(R, C);

    }

    private void placeBattleship() {
        System.out.println("Where will you place it?");
        System.out.print("Row: ");
        int R = key.nextInt();
        System.out.print("Column: ");
        int C = key.nextInt();
        P1_Side.placedBattleship(R, C);

    }

    private void placeCruiser() {
        System.out.println("Where will you place it?");
        System.out.print("Row: ");
        int R = key.nextInt();
        System.out.print("Column: ");
        int C = key.nextInt();
        P1_Side.placedCruiser(R, C);

    }

    private void placeSubmarine() {
        System.out.println("Where will you place it?");
        System.out.print("Row: ");
        int R = key.nextInt();
        System.out.print("Column: ");
        int C = key.nextInt();
        P1_Side.placedSubmarine(R, C);

    }

    private void placeDestroyer() {
        System.out.println("Where will you place it?");
        System.out.print("Row: ");
        int R = key.nextInt();
        System.out.print("Column: ");
        int C = key.nextInt();
        P1_Side.placedDestroyer(R, C);

    }
}
