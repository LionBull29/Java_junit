import com.codeborne.selenide.Configuration;
        import org.junit.jupiter.api.Test;

        import static com.codeborne.selenide.Condition.text;
        import static com.codeborne.selenide.Selenide.$;
        import static com.codeborne.selenide.Selenide.open;


public class SearchTests {

        @Test
        void Login_standard_user_Test() {


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


          /*  open("https://www.google.com/");
            $("[name=q]").setValue("selenide").pressEnter();
            $("[id=search]").shouldHave(text("https://selenide.org"));*/
        }


        @Test
        void Login_locked_out_user_Test() {


        /*Configuration.holdBrowserOpen = true;*/
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";

        open("https://www.saucedemo.com/");

        $(".login_logo").shouldHave(text("Swag Labs"));
        $("[name=user-name]").setValue("locked_out_user");
        $("[name=password]").setValue("secret_sauce");
        $("[name=login-button]").click();
        $("[data-test=error]").shouldHave(text("Epic sadface: Sorry, this user has been locked out."));
        $("[class=error-button]").click();

        }
        @Test
        void Login_problem_user_Test() {


        /*Configuration.holdBrowserOpen = true;*/
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";

        open("https://www.saucedemo.com/");

        $(".login_logo").shouldHave(text("Swag Labs"));
        $("[name=user-name]").setValue("problem_user");
        $("[name=password]").setValue("secret_sauce");
        $("[name=login-button]").click();
        $("[class=inventory_item_name]").shouldHave(text("Sauce Labs Backpack"));
        $("[class=footer_copy]").shouldHave(text(" Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy"));

        }

        @Test
        void Login_performance_glitch_user_Test() {


        /*Configuration.holdBrowserOpen = true;*/
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";

        open("https://www.saucedemo.com/");

        $(".login_logo").shouldHave(text("Swag Labs"));
        $("[name=user-name]").setValue("performance_glitch_user");
        $("[name=password]").setValue("secret_sauce");
        $("[name=login-button]").click();
        $("[class=inventory_item_name]").shouldHave(text("Sauce Labs Backpack"));
        $("[class=footer_copy]").shouldHave(text(" Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy"));

        }
        }
