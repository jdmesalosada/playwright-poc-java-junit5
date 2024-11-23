package pageobjects;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class HomePage {

    private final Page page;
    private final Locator searchTextbox;
    private final Locator searchButton;

    public HomePage(Page page){
        this.page = page;
        this.searchTextbox = page.getByPlaceholder("Buscar productos, marcas y má");
        this.searchButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Buscar"));
    }

    public void navigate(){
        page.navigate("https://www.mercadolibre.com.co/");
    }

    public void search(String searchCriteria){
        this.searchTextbox.fill(searchCriteria);
        this.searchButton.click();
    }

}
