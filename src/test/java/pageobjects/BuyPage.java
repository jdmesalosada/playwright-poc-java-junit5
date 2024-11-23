package pageobjects;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class BuyPage {

    private final Page page;
    private final Locator signInLink;

    public BuyPage(Page page){
        this.page = page;
        this.signInLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Ingresar"));
    }

    public void clickOnSignIn(){
        this.signInLink.click();
    }
}
