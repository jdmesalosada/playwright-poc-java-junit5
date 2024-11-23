package pageobjects;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class ResultsPage {

    private final Page page;
    private final Locator resultItem;

    public ResultsPage(Page page){
        this.page = page;
        this.resultItem = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions()
                        .setName("Guitarra eléctrica Ibanez RG GIO GRG121DX soloist de álamo black flat con"));
    }


    public void clickOnItem(){
        this.resultItem.click();
    }
}
