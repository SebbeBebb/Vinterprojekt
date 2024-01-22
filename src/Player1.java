import java.util.Scanner;

public class Player1 extends Players{
    Scanner key = new Scanner(System.in);

    public Player1(){
        super();
        placeShip();
    }
    private void placeShip(){
        System.out.println("What ship do would you like to place?");
        System.out.println(getShips());
        int choice = key.nextInt();
        switch (choice){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
        }
    }
}
