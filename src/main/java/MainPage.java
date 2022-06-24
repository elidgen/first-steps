import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 Главная страница сайта AppleInsider.ru
 */
public class MainPage {
    private final SelenideElement textBoxInput = $x("//input[@name='s']");

    public MainPage(String url) {
       Selenide.open(url);
    }

    public SearchPage search(String searchString) {
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
        return new SearchPage();
    }
}
