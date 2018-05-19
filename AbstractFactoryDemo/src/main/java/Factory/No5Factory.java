package Factory;

import UI.*;
import Core.*;

public class No5Factory extends AbstractFactory
{

    public UI developGameUI()
    {
        return new No5UI();
    }

    public Core developGameCore()
    {
        return new No5Core();
    }
}
