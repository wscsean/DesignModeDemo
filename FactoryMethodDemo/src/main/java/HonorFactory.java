public class HonorFactory extends AbstractFactory
{
    public Game developGame()
    {
        return new HonorGame();
    }
}
