import com.codeborne.selenide.Configuration;
        import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
        import static com.codeborne.selenide.Selenide.$;
        import static com.codeborne.selenide.Selenide.open;


public class CartTests {

        @Test
        void Cart_Test() {


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

        $("[id=add-to-cart-sauce-labs-backpack]").click();
        $("[id=add-to-cart-sauce-labs-bike-light]").click();
        $("[id=add-to-cart-sauce-labs-bolt-t-shirt]").click();
        $("[id=shopping_cart_container]").click();

        $("[id=remove-sauce-labs-bolt-t-shirt]").click();

        $("[id=checkout]").click();

        $("[id=first-name]").setValue("first-name");
        $("[id=last-name]").setValue("last-name");
        $("[id=postal-code]").setValue("postal-code");
        $("[id=continue]").click();

        $("[id=finish]").click();

        $("[id=back-to-products]").click();
        }


        }
