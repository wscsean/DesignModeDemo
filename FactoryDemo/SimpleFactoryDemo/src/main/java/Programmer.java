public class Programmer
{
    public static void main(String[] args)
    {
        SimpleFactory factory = new SimpleFactory();

        Game no5game = factory.developGame("No5");
        no5game.printGameInfo();

        Game honorgame = factory.developGame("Honor");
        honorgame.printGameInfo();
    }
}
