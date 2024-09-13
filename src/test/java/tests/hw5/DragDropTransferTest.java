package tests.hw5;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragDropTransferTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.holdBrowserOpen = false;
    }

    @Test
    void selenideCodeTestWithActionsTest() {
        open("/drag_and_drop");
        $(".example").shouldHave(text("Drag and Drop"));
        SelenideElement element = $("#column-a");
        Selenide.actions()
                .moveToElement(element)
                .clickAndHold()
                .moveToElement($("#column-b"))
                .release()
                .perform();
        $("#columns").$("#column-a").shouldHave(attribute("style", "opacity: 1;"));
    }

    @Test
    void selenideCodeTestWithDragAndDropTest() {
        open("/drag_and_drop");
        $(".example").shouldHave(text("Drag and Drop"));
        $("#column-a").dragAndDrop(to($("#column-b")));
        $("div header").shouldBe(text("B"));
    }
}
