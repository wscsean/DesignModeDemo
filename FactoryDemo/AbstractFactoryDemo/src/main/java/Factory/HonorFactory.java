package Factory;

import Core.*;
import UI.*;

public class HonorFactory extends AbstractFactory
{

    public UI developGameUI()
    {
        return new HonorUI();
    }

    public Core developGameCore()
    {
        return new HonorCore();
    }
}
