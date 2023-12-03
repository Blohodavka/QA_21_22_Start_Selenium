import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWorks {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");

    }

    @Test
    public void cssLocators() {
        //by tag name
        WebElement tag1 = wd.findElement(By.tagName("div"));
        WebElement tag11 = wd.findElement(By.cssSelector("div"));

        WebElement tag2 = wd.findElement(By.tagName("h1"));
        WebElement tag21 = wd.findElement(By.cssSelector("h1"));

        WebElement tag3 = wd.findElement(By.tagName("a"));
        WebElement tag31 = wd.findElement(By.cssSelector("a"));

        WebElement tag4 = wd.findElement(By.tagName("input"));
        WebElement tag41 = wd.findElement(By.cssSelector("input"));

        WebElement tag5 = wd.findElement(By.tagName("form"));
        WebElement tag51 = wd.findElement(By.cssSelector("form"));

        WebElement tag6 = wd.findElement(By.tagName("button"));
        WebElement tag61 = wd.findElement(By.cssSelector("button"));
        WebElement xElem1 = wd.findElement(By.xpath("//button"));
        WebElement xElem11 = wd.findElement(By.xpath("/html/body/div/div/div/form/button"));

        WebElement tag7 = wd.findElement(By.tagName("body"));
        WebElement tag71 = wd.findElement(By.cssSelector("body"));

        //by class

        WebElement class1 = wd.findElement(By.className("container"));
        WebElement class11 = wd.findElement(By.cssSelector(".container"));
        WebElement wel7 = wd.findElement(By.xpath("//*[@class='container']"));


        WebElement class2 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement class21 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement class3 = wd.findElement(By.className("active"));
        WebElement class31 = wd.findElement(By.cssSelector(".active"));

        WebElement class4 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement class41 = wd.findElement(By.cssSelector(".login_login__3EHKB"));

        // by id

        WebElement id1 = wd.findElement(By.id("root"));
        WebElement id11 = wd.findElement(By.cssSelector("#root"));
        WebElement xElem2 = wd.findElement(By.xpath("//*[@id='root']"));

        //by attribute

        WebElement atr1 = wd.findElement(By.cssSelector("[href = '/home']"));
        WebElement atr2 = wd.findElement(By.cssSelector("[href = '/about']"));
        WebElement atr3 = wd.findElement(By.cssSelector("[href = '/login']"));
        WebElement atr4 = wd.findElement(By.cssSelector("[style = 'border: 1px solid black; background-color: black; color: white;']"));
        WebElement atr5 = wd.findElement(By.cssSelector("[aria-current = 'page']"));
        WebElement atr6 = wd.findElement(By.cssSelector("[name = 'email']"));
        WebElement atr61 = wd.findElement(By.name("email"));
        WebElement atr7 = wd.findElement(By.cssSelector("[placeholder = 'Email']"));
        WebElement atr8 = wd.findElement(By.cssSelector("[name = 'password']"));
        WebElement atr81 = wd.findElement(By.name("password"));
        WebElement atr9 = wd.findElement(By.cssSelector("[placeholder = 'Password']"));
        WebElement atr10 = wd.findElement(By.cssSelector("[type = 'submit']"));
        WebElement atr11 = wd.findElement(By.cssSelector("[name = 'login']"));
        WebElement atr111 = wd.findElement(By.name("login"));
        WebElement atr12 = wd.findElement(By.cssSelector("[name = 'registration']"));
        WebElement atr121 = wd.findElement(By.name("registration"));
        WebElement atr13 = wd.findElement(By.cssSelector("[id = 'root']"));

//one of elements find by attribute ==> start& end & contains value
        WebElement el18 = wd.findElement(By.cssSelector("[placeholder = 'Email']"));
        WebElement xEl18 = wd.findElement(By.xpath("//input [@placeholder='Email']"));

        WebElement el19 = wd.findElement(By.cssSelector("[placeholder ^= 'Em']"));
        WebElement xEl19 = wd.findElement(By.xpath("//input [starts-with(@placeholder, 'Em')]"));

        WebElement el20 = wd.findElement(By.cssSelector("[placeholder $= 'il']"));
        WebElement xEl20 = wd.findElement(By.xpath("//input [contains(@placeholder, 'il')]"));
        WebElement el21 = wd.findElement(By.cssSelector("[placeholder *= 'ma']"));
        WebElement xEl21 = wd.findElement(By.xpath("//input [contains(@placeholder, 'ma')]"));




    }

}
