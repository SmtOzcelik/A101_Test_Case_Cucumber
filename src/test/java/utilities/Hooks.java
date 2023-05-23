package utilities;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    /*
     cucumber da step definitions package i icerisinde @before,@after gibi notasyon varsa
     extends testbase dememize gerek kalmadan her senaryodan önce ve/veya sonra bu metodlar
     calişir buda bizim isteyecegimiz bi durum degildir.

     Cucumber da @before,@after kullanma ihtiyacimiz olursa bunu stepdefinitions package i
     altinda olusturacagimiz hooks class ina koyariz

     biz her scenario dan sonra test sonucunu kontrol edip failed olan scenario lar icin
     screenshot almasi amaciyla @After methodu kullanacagiz
     */
    @After
    public void tearDown(Scenario scenario) {

        final byte[] screenshot = ((TakesScreenshot)
                Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        Driver.closeDriver();
    }
}
