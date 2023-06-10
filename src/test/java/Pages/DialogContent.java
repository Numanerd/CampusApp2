package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class DialogContent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
