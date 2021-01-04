package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

//Открыть Google
class GoogleTest {
    @Test
    void selenideSearchTest() {
        open("https://www.google.com");
        $(byName("q")).setValue("Selenide").pressEnter();
        $("html").shouldHave(text("ru.selenide.org"));
    }
}



//Проверить, что Selenide появился в результатах поиска

