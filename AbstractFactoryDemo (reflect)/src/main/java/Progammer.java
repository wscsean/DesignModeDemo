import UI.*;
import Core.*;
import Factory.*;

public class Progammer
{
    public static void main(String[] args)
    {
        Factory no5Factory = new No5Factory();

        Core no5Core = no5Factory.developGameCore();
        UI no5UI = no5Factory.developGameUI();

        no5Core.printCoreInfo();
        no5UI.printUiInfo();


        Factory honorFactory = new HonorFactory();

        Core honorCore = honorFactory.developGameCore();
        UI honorUI = honorFactory.developGameUI();

        honorCore.printCoreInfo();
        honorUI.printUiInfo();

    }
}
