public class No5Game implements Game
{
    private String name = "No5Game";

    private String version = "2.0.0";

    public No5Game()
    {

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "No5Game{}";
    }

    public void printGameInfo()
    {
        System.out.println("It is No5Game.");
    }
}
