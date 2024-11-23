package org.example;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import java.nio.file.Paths;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
/*
    public static void main(String[] args) {

       /* Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://www.mercadolibre.com.co");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("test.png")));

        browser.close();
        playwright.close();

                try (Playwright playwright = Playwright.create()) {
                    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                            .setHeadless(false));
                    BrowserContext context = browser.newContext();
                    Page page = context.newPage();
                    page.navigate("https://www.mercadolibre.com.co/");
                    page.getByPlaceholder("Buscar productos, marcas y má").click();
                    page.getByPlaceholder("Buscar productos, marcas y má").fill("guitarra electrica");
                    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Buscar")).click();
                    page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Guitarra eléctrica Ibanez RG GIO GRG121DX soloist de álamo black flat con"))
                            .click();
                    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Comprar ahora")).click();
                    page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Ingresar")).click();

                    page.pause();
                }

    }*/
}