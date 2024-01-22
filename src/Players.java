import java.util.ArrayList;

public class Players {
    private ArrayList<String> ships = new ArrayList<String>();

    public Players() {
        ships.add("1. Carrier : 5");
        ships.add("2. Battleship : 4");
        ships.add("3. Cruiser : 3");
        ships.add("4. Submarine : 3");
        ships.add("5. Destroyer : 2");
    }
    public ArrayList<String> getShips() {
        return ships;
    }
}