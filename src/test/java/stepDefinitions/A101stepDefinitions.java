package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.A101page;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class A101stepDefinitions {
    A101page a101page=new A101page();
    Actions actions=new Actions(Driver.getDriver());


    @Given("Kullanıcı {string} girer")
    public void kullanıcıGirer(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Url));
    }

    @Then("Kullanıcı cokies i kabul eder")
    public void kullanıcıCokiesIKabulEder() {
        a101page.cokiesButton.click();

    }


    @And("Kullanici Giyim&Aksesuar bolumune mouse'u getirerek bekler.")
    public void kullaniciGiyimAksesuarBolumuneMouseUGetirerekBekler() {
        actions.moveToElement(a101page.giyimAksesuarMenu).perform();
    }

    @And("Kullanici Dizaltı Corap tiklar")
    public void kullaniciDizaltıCorapTiklar() {
        a101page.dizaltiCorapYazisi.click();

    }

    @And("Kullanici Siyah Corap olana tiklar")
    public void kullaniciSiyahCorapOlanaTiklar() {
        a101page.dizaltiSiyahCorapYazisi.click();
    }

    @And("Kullanici secilen urunun siyah oldugunu dogrular")
    public void kullaniciSecilenUrununSiyahOldugunuDogrular() {
        String expectedYazi="SİYAH";
        Assert.assertTrue(a101page.ilkSiyahCorapYazisi.getText().contains(expectedYazi));
    }

    @And("Kullanici sepete ekler butonuna tiklar")
    public void kullaniciSepeteEklerButonunaTiklar() {
        a101page.sepeteEkleButonu.click();
    }

    @And("Kullanici sepeti görüntüle butonuna tiklar")
    public void kullaniciSepetiGörüntüleButonunaTiklar() {
        a101page.sepetiGoruntuleButton.click();
    }

    @And("Kullanici sepeti onayla butonuna tiklar")
    public void kullaniciSepetiOnaylaButonunaTiklar() {
        a101page.sepetiOnaylaButonu.click();
    }

    @And("Kullanici uye girisi olmadan butonuna tiklar")
    public void kullaniciUyeGirisiOlmadanButonunaTiklar() {
    a101page.uyeOlmadanDevamEtButonu.click();
    }

    @And("Kullanici email girisi yapar")
    public void kullaniciEmailGirisiYapar() {
        a101page.emailTextKutusu.sendKeys("teslimeeee@gmail.com", Keys.ENTER);

    }

    @And("Kullanici yeni adres oluştur butonuna tiklar")
    public void kullaniciYeniAdresOluşturButonunaTiklar() {
        a101page.yeniAdresButonu.click();
    }

    @And("Kullanici adres basligi ve diger bilgileri girer")
    public void kullaniciAdresBasligiVeDigerBilgileriGirer() {
        actions.click(a101page.yeniAdresButonu).sendKeys("Ev adresi").sendKeys(Keys.TAB).
                sendKeys("Ahmet").sendKeys(Keys.TAB).sendKeys("AK").sendKeys(Keys.TAB).
                sendKeys("5455454545").perform();

    }

    @And("Kullanici il secer")
    public void kullaniciIlSecer() {
        Select select=new Select(a101page.ilTextKutusu);
        select.selectByVisibleText("ANKARA");

    }

    @And("Kullanici ilce secer")
    public void kullaniciIlceSecer() {
        Select select2=new Select(a101page.ilceTextKutusu);
        select2.selectByVisibleText("AKYURT");
    }

    @And("Kullanici mahalle secer")
    public void kullaniciMahalleSecer() {
        Select select3=new Select(a101page.mahalleTextKutusu);
        select3.selectByVisibleText("DEMETEVLER MAH");

    }

    @And("Sistem {int} sn beklet")
    public void sistemSnBeklet(int a) throws InterruptedException {
        Thread.sleep(a*1000);
    }

    @And("Kullanci adres bilgileri girer")
    public void kullanciAdresBilgileriGirer() {
        a101page.adresTextKutusu.sendKeys("Demetevler mah 317. cadde no 36/10");
    }

    @And("Kullanci kaydet butonuna tiklar")
    public void kullanciKaydetButonunaTiklar() {
        a101page.kaydetButonu.click();
    }

    @And("Kullanci adres kaydetdikten ve kargo secildikten sonra kaydet devam et butonuna tiklar")
    public void kullanciAdresKaydetdiktenVeKargoSecildiktenSonraKaydetDevamEtButonunaTiklar() {
        a101page.kaydetveDevamEtButonu.click();
        a101page.kaydetveDevamEtButonu.click();
    }

    @And("Kullanıci ödeme sayfasina geldigini dogrular")
    public void kullanıciÖdemeSayfasinaGeldiginiDogrular() {
        Assert.assertTrue(a101page.sonAdimDogrulama.isDisplayed());
    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
