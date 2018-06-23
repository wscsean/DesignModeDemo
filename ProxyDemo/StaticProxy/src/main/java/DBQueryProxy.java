public class DBQueryProxy implements IDBQuery
{
    private DBQuery real = null;

    public String request()
    {
        if (real == null)
        {
            real = new DBQuery();
        }

        return real.request();
    }
}
