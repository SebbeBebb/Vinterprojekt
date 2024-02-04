import java.util.Random;

public class Bot extends Players{

    public Bot(){
        super();
        botPlaceCarrier();
        botPlaceBattleship();
        botPlaceCruiser();
        botPlaceSubmarine();
        botPlaceDestroyer();
    }

    private void botPlaceCarrier() {
        Random rand = new Random();
        int R = rand.nextInt(5);
        int C = rand.nextInt(5);
        Bot_Side.botCarrier(R, C);

    }
    private void botPlaceBattleship() {
        Random rand = new Random();
        int R = rand.nextInt(6);
        int C = rand.nextInt(6);
        Bot_Side.botBattleship(R, C);

    }
    private void botPlaceCruiser() {
        Random rand = new Random();
        int R = rand.nextInt(7);
        int C = rand.nextInt(7);
        Bot_Side.botCruiser(R, C);

    }
    private void botPlaceSubmarine() {
        Random rand = new Random();
        int R = rand.nextInt(7);
        int C = rand.nextInt(7);
        Bot_Side.botSubmarine(R, C);

    }
    private void botPlaceDestroyer() {
        Random rand = new Random();
        int R = rand.nextInt(8);
        int C = rand.nextInt(8);
        Bot_Side.botDestroyer(R, C);

    }
}
