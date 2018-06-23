public class User
{
    public static void main(String[] args)
    {
        IDBQuery q = new DBQueryProxy();
        System.out.printf(q.request());
    }
}
