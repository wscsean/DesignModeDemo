public class User
{
    public static void main(String[] args)
    {
        IDBQuery q = JdkDBQueryHandler.createJdkProxy();
        System.out.printf(q.response());
    }
}
