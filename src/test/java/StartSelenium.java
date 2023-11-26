import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartSelenium {

    WebDriver wd;

    @Test

    public void test() {
        wd = new ChromeDriver();
//       wd.get("https://telranedu.web.app/home"); without history
       wd.navigate().to("https://telranedu.web.app/home");
       wd.navigate().back(); // назад
       wd.navigate().forward(); // вперед
       wd.navigate().refresh(); // обновить
        wd.close(); // закрыть только одну вкладку, если вкладка одна, то закроет весь браузер
        wd.quit(); // закрыть все вкладки



    }


}
