public class SimpleFactory
{
    public Game developGame(String name)
    {
        if ("No5".equals(name))
        {
            return new No5Game();
        }

        if ("Honor".equals(name))
        {
            return new HonorGame();
        }

        return null;
    }
}
