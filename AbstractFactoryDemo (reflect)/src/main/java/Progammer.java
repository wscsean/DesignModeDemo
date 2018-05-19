import UI.*;
import Core.*;
import Factory.*;
import java.util.Scanner;

public class Progammer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String className = input.nextLine();

        // input: Factory.No5Factory

        try
        {
            Factory factory = (Factory) Class.forName(className).newInstance();

            Core core = factory.developGameCore();
            UI ui = factory.developGameUI();

            core.printCoreInfo();
            ui.printUiInfo();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
