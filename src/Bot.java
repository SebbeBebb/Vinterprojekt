import java.util.Random;

public class Bot extends Players{

    //Konstruktorn kallar på moderklassen samt anropar metoderna som placerar skeppenm på bottens sida
    public Bot(){
        super();
        botPlaceCarrier();
        botPlaceBattleship();
        botPlaceCruiser();
        botPlaceSubmarine();
        botPlaceDestroyer();
    }

    //Slumpar bottens rader och kolumner så att skeppen är slumpmässigt placerade på spelbrädan
    private void botPlaceCarrier() {
        Random rand = new Random();
        int R = rand.nextInt(5);//Avgränsningen är baserad på hur stort skeppet är,
        int C = rand.nextInt(5);//för att undvika att den försöker placera skeppet utanför spelbrädan
        Bot_Side.botCarrier(R, C);
    }

    //Samma som för carriern men för ett annat skepp
    private void botPlaceBattleship() {
        Random rand = new Random();
        int R = rand.nextInt(6);//Avgränsningen är baserad på hur stort skeppet är,
        int C = rand.nextInt(6);//för att undvika att den försöker placera skeppet utanför spelbrädan
        Bot_Side.botBattleship(R, C);
    }

    //Samma som för carriern men för ett annat skepp
    private void botPlaceCruiser() {
        Random rand = new Random();
        int R = rand.nextInt(7);//Avgränsningen är baserad på hur stort skeppet är,
        int C = rand.nextInt(7);//för att undvika att den försöker placera skeppet utanför spelbrädan
        Bot_Side.botCruiser(R, C);
    }

    //Samma som för carriern men för ett annat skepp
    private void botPlaceSubmarine() {
        Random rand = new Random();
        int R = rand.nextInt(7);//Avgränsningen är baserad på hur stort skeppet är,
        int C = rand.nextInt(7);//för att undvika att den försöker placera skeppet utanför spelbrädan
        Bot_Side.botSubmarine(R, C);
    }

    //Samma som för carriern men för ett annat skepp
    private void botPlaceDestroyer() {
        Random rand = new Random();
        int R = rand.nextInt(8);//Avgränsningen är baserad på hur stort skeppet är,
        int C = rand.nextInt(8);//för att undvika att den försöker placera skeppet utanför spelbrädan
        Bot_Side.botDestroyer(R, C);
    }
}
