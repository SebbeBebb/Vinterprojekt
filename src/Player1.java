import java.util.Scanner;

public class Player1 extends Players {
    Scanner key = new Scanner(System.in);
    int placeCa = 0;
    int placeB = 0;
    int placeCr = 0;
    int placeS = 0;
    int placeD = 0;
    boolean val = true;

    /*Metoden kallar på moderklassen samt skapar en ny spelbräda för spelaren,
    även en while loop som fortsätter tills spelaren har placerat alla skepp*/
    public Player1() {
        super();
        new P1_Side();
        while (val) placeShip();
    }

    //Metod för att placera alla skepp som spelaren har
    private void placeShip() {
        System.out.println("What ship do would you like to place?");
        System.out.println(getShips());
        int choice = key.nextInt();
        /*switch case som tar in valet från spelaren genom en scanner
         och anropar metoderna för respektive skepp som spelaren väljer*/
        switch (choice) {
            case 1 -> {
                if (placeCa == 0) {//Kollar så att spelaren inte har placerat en carrier redan
                    System.out.println("You place Carrier");
                    placeCarrier();
                    placeCa = 1;
                } else {
                    System.out.println("You have already placed a Carrier");
                }
            }
            case 2 -> {
                if (placeB == 0) {//Samma som för carriern men för ett annat skepp
                    System.out.println("You place Battleship");
                    placeBattleship();
                    placeB = 1;
                } else {
                    System.out.println("You have already placed a Battleship");
                }
            }
            case 3 -> {
                if (placeCr == 0) {//Samma som för carriern men för ett annat skepp
                    System.out.println("You place Cruiser");
                    placeCruiser();
                    placeCr = 1;
                } else {
                    System.out.println("You have already placed a Cruiser");
                }
            }
            case 4 -> {
                if (placeS == 0) {//Samma som för carriern men för ett annat skepp
                    System.out.println("You place Submarine");
                    placeSubmarine();
                    placeS = 1;
                } else {
                    System.out.println("You have already placed a Submarine");
                }
            }
            case 5 -> {
                if (placeD == 0) {//Samma som för carriern men för ett annat skepp
                    System.out.println("You place Destroyer");
                    placeDestroyer();
                    placeD = 1;
                } else {
                    System.out.println("You have already placed a Destroyer");
                }
            }
            //Om spelaren väljer ett felaktigt nummer eller en bokstav
            default -> System.out.println("Välj ett nummmer");
        }
        //Stänger av loopen om spelaren har placerat alla skeppen
        if (placeD==1 && placeS==1 && placeCa==1 && placeCr==1 && placeB==1) {
            val=false;
        }
    }

    //Metod som tar emot spelarens input genom en scanner och sedan skickar värdena till P1_Side klassen
    private void placeCarrier() {
        System.out.println("Where will you place it?");
        System.out.print("Row: ");
        int R = key.nextInt();
        System.out.print("Column: ");
        int C = key.nextInt();
        P1_Side.placedCarrier(R, C);

    }

    //Samma som för carriern men ett annat skepp
    private void placeBattleship() {
        System.out.println("Where will you place it?");
        System.out.print("Row: ");
        int R = key.nextInt();
        System.out.print("Column: ");
        int C = key.nextInt();
        P1_Side.placedBattleship(R, C);

    }

    //Samma som för carriern men ett annat skepp
    private void placeCruiser() {
        System.out.println("Where will you place it?");
        System.out.print("Row: ");
        int R = key.nextInt();
        System.out.print("Column: ");
        int C = key.nextInt();
        P1_Side.placedCruiser(R, C);

    }

    //Samma som för carriern men ett annat skepp
    private void placeSubmarine() {
        System.out.println("Where will you place it?");
        System.out.print("Row: ");
        int R = key.nextInt();
        System.out.print("Column: ");
        int C = key.nextInt();
        P1_Side.placedSubmarine(R, C);

    }

    //Samma som för carriern men ett annat skepp
    private void placeDestroyer() {
        System.out.println("Where will you place it?");
        System.out.print("Row: ");
        int R = key.nextInt();
        System.out.print("Column: ");
        int C = key.nextInt();
        P1_Side.placedDestroyer(R, C);

    }
}
