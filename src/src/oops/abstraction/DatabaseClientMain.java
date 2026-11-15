package oops.abstraction;

public class DatabaseClientMain
{
    public static void main(String ar[])
    {
        DatabaseClient mDatabaseClient = new DatabaseClient(100, 2);
        mDatabaseClient.connect("lostname", 8080);
        mDatabaseClient.query("select * from people");


    }

}
