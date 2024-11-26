import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.junit.Options;
import com.microsoft.playwright.junit.OptionsFactory;
import com.microsoft.playwright.junit.UsePlaywright;
import com.microsoft.playwright.options.AriaRole;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.Test;
import pageobjects.BuyPage;
import pageobjects.HomePage;
import pageobjects.ItemPage;
import pageobjects.ResultsPage;

@UsePlaywright(NavigateTest.CustomOptions.class)
@Feature("Search for products")
public class NavigateTest {

    public static class CustomOptions implements OptionsFactory{

        @Override
        public Options getOptions(){
            return new Options().setHeadless(false);
        }
    }

    @Test
    @Description("Searching for a product 1")
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
    @Description("Searching for a product 2")
    void navigateToPage2(Page page) {
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
    @Description("""
            Searching for a product 3
            foo foo foo foo foo foo foo
            foo foo foo foo
            foo foo foo foo foo
            foo foo
            """)
    @Link(value = "Issue-389", url = "http://www.google.com")
    void navigateToPage3(Page page) {
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

}
