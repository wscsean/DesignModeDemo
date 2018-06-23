public class Progammer
{
    public static void main(String[] args)
    {
        Factory no5Factory = new No5Factory();

        Game no5game = no5Factory.developGame();
        no5game.printGameInfo();

        Factory honorFactory = new HonorFactory();

        Game honorgame = honorFactory.developGame();
        honorgame.printGameInfo();
    }
}
