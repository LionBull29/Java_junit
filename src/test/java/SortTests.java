import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SortTests {
    @Test
    void Sort_Test() {


        /*Configuration.holdBrowserOpen = true;*/
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";

        open("https://www.saucedemo.com/");

        $(".login_logo").shouldHave(text("Swag Labs"));
        $("[name=user-name]").setValue("standard_user");
        $("[name=password]").setValue("secret_sauce");
        $("[name=login-button]").click();
        $("[class=inventory_item_name]").shouldHave(text("Sauce Labs Backpack"));
        $("[class=footer_copy]").shouldHave(text(" Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy"));

        $("[value=az]").click();
        $("[value=za]").click();
        $("[value=lohi]").click();
        $("[value=hilo]").click();


    }

}
