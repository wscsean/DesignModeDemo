package Factory;

import UI.UI;
import Core.Core;

public interface Factory
{
    public UI developGameUI();

    public Core developGameCore();
}
