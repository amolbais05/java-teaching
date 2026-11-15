package oops.abstraction;

public class ConsoleLoggingService extends Logger
{
    @Override
    public void log(String destination, String message)
    {
        System.out.println("[LOG] " + message);
    }
}
