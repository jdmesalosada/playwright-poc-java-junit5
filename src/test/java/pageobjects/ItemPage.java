package pageobjects;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class ItemPage {

    private final Page page;
    private final Locator buyNowButton;

    public ItemPage(Page page){
        this.page = page;
        this.buyNowButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Comprar ahora"));
    }

    public void clickOnBuyNow(){
        this.buyNowButton.click();
    }
}
