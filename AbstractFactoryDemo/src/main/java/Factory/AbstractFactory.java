package Factory;

import UI.UI;
import Core.Core;

public abstract class AbstractFactory implements Factory
{

    public abstract UI developGameUI();

    public abstract Core developGameCore();
}
