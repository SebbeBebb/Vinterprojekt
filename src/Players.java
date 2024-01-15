import java.util.ArrayList;

public class Players {
    private ArrayList<String> ships = new ArrayList<String>();

    public Players() {
        ships.add("Carrier");
        ships.add("Battleship");
        ships.add("Cruiser");
        ships.add("Submarine");
        ships.add("Destroyer");
    }
}