import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.junit.Options;
import com.microsoft.playwright.junit.OptionsFactory;
import com.microsoft.playwright.junit.UsePlaywright;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;
import pageobjects.BuyPage;
import pageobjects.HomePage;
import pageobjects.ItemPage;
import pageobjects.ResultsPage;

@UsePlaywright(NavigateTest.CustomOptions.class)
public class NavigateTest {

    public static class CustomOptions implements OptionsFactory{

        @Override
        public Options getOptions(){
            return new Options().setHeadless(false);
        }
    }

    @Test
    void navigateToPage(Page page) {

        HomePage homePage = new HomePage(page);
        homePage.navigate();
        homePage.search("guitarra electrica");

        ResultsPage resultsPage = new ResultsPage(page);
        resultsPage.clickOnItem();

        ItemPage itemPage = new ItemPage(page);
        itemPage.clickOnBuyNow();

        BuyPage buyPage = new BuyPage(page);
        buyPage.clickOnSignIn();
    }

    @Test
    void navigateToPage2(Page page) {
        page.navigate("https://www.mercadolibre.com.co/");

        page.getByPlaceholder("Buscar productos, marcas y má").click();
        page.getByPlaceholder("Buscar productos, marcas y má").fill("guitarra electrica");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Buscar")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Guitarra eléctrica Ibanez RG GIO GRG121DX soloist de álamo black flat con"))
                .click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Comprar ahora")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Ingresar")).click();
    }

    @Test
    void navigateToPage3(Page page) {
        page.navigate("https://www.mercadolibre.com.co/");
        page.getByPlaceholder("Buscar productos, marcas y má").click();
        page.getByPlaceholder("Buscar productos, marcas y má").fill("guitarra electrica");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Buscar")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Guitarra eléctrica Ibanez RG GIO GRG121DX soloist de álamo black flat con"))
                .click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Comprar ahora")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Ingresar")).click();
    }

}
