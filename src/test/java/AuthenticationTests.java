import com.microsoft.playwright.*;
import com.microsoft.playwright.junit.Options;
import com.microsoft.playwright.junit.OptionsFactory;
import com.microsoft.playwright.junit.UsePlaywright;
import com.microsoft.playwright.options.AriaRole;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pageobjects.BuyPage;
import pageobjects.HomePage;
import pageobjects.ItemPage;
import pageobjects.ResultsPage;

import java.nio.file.Paths;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

@UsePlaywright(AuthenticatedCustomOptions.class)
@Feature("authentication")
public class AuthenticationTests {

    @BeforeAll
    public static void loginAndSaveState(){
        try(Playwright playwright = Playwright.create()){
            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setHeadless(false)
            );
            BrowserContext context = browser.newContext();

            Page page = context.newPage();

            page.navigate("https://www.saucedemo.com/");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("standard_user");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("secret_sauce");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();

            assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add to cart")).first()).isVisible();

            context.storageState(new BrowserContext.StorageStateOptions().setPath(Paths.get("state.json")));

        }
    }

    @Test
    @Description("log in with valid user")
    void authentication(Page page) {
        page.navigate("https://www.saucedemo.com/inventory.html");
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add to cart")).first()).isVisible();

    }

    @Test
    @Description("log in with valid user")
    void authentication2(Page page) {
        page.navigate("https://www.saucedemo.com/inventory.html");
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add to cart")).first()).isVisible();
    }

    @Test
    @Description("log in with valid user")
    void authentication3(Page page) {
        page.navigate("https://www.saucedemo.com/inventory.html");
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add to cart")).first()).isVisible();

    }
}
