import com.microsoft.playwright.Browser;
import com.microsoft.playwright.junit.Options;
import com.microsoft.playwright.junit.OptionsFactory;

import java.nio.file.Paths;

public class AuthenticatedCustomOptions implements OptionsFactory {

    @Override
    public Options getOptions(){
        return  new Options().setHeadless(false)
                .setContextOptions(new Browser.NewContextOptions().setStorageStatePath(Paths.get("state.json")));
    }


}
