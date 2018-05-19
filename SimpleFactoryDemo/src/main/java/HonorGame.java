public class HonorGame implements Game
{
    private String name = "Honor";

    private String version = "3.5.6";

    public HonorGame()
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
        return "HonorGame{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

    public void printGameInfo()
    {
        System.out.println("It is Honor.");
    }
}
