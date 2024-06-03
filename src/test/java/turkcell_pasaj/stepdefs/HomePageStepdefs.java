package turkcell_pasaj.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import turkcell_pasaj.pages.HomePage;
import turkcell_pasaj.utilities.ConfigReader;
import turkcell_pasaj.utilities.Driver;
import turkcell_pasaj.utilities.ReusableMethods;

public class HomePageStepdefs {

    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("Web sitesine git")
    public void web_sitesine_git() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

    }

    @Then("Arama kutusunda {string} kelimesi arat")
    public void aramaKutusundaKelimesiArat(String aranacakKelime) {
       homePage.searchBox.sendKeys(aranacakKelime, Keys.ENTER);
       ReusableMethods.bekle(2);
    }

    @And("Arama sonuclarindan bir urun sec")
    public void aramaSonuclarindanBirUrunSec() {
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        homePage.urunEkle.click();
        ReusableMethods.bekle(2);

    }

    @And("Secilen urunu sepete ekle")
    public void secilenUrunuSepeteEkle() {
        actions.sendKeys(Keys.PAGE_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
        homePage.sepeteEkleKablo.click();
        ReusableMethods.bekle(2);

    }

    @And("Giris yapmadan devam et")
    public void girisYapmadanDevamEt() {
        homePage.girisYapmadanDevamEt.click();
        ReusableMethods.bekle(2);
    }

    @And("Kullanici sozlesmesi kutucugunu isaretle")
    public void kullaniciSozlesmesiKutucugunuIsaretle() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        homePage.siparisCheckbox.click();
        ReusableMethods.bekle(2);
        homePage.siparisCheckboxOnay.click();
        ReusableMethods.bekle(1);
    }

    @And("Siparise devam et")
    public void sipariseDevamEt() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        homePage.sipariseDevamEt.click();
        ReusableMethods.bekle(2);
    }

    @And("Ad soyad kutusuna {string} bilgisi gir")
    public void adSoyadKutusunaBilgisiGir(String adSoyad) {
        homePage.adSoyadGir.sendKeys(adSoyad, Keys.TAB, Keys.TAB);
        ReusableMethods.bekle(1);
    }

    @And("Telefon no kutusuna {string} gir")
    public void telefonNoKutusunaGir(String gsm) {
        homePage.telefonNoGir.sendKeys(gsm, Keys.TAB);
        ReusableMethods.bekle(1);
    }

    @And("Mail adresi kutusuna {string} gir")
    public void mailAdresiKutusunaGir(String email) {
        homePage.emailGir.sendKeys(email, Keys.TAB);
        ReusableMethods.bekle(1);
    }

    @And("Tc kimlik no kutusuna {string} gir")
    public void tcKimlikNoKutusunaGir(String tckn) {
        homePage.tcKimlikNoGir.sendKeys(tckn);
        ReusableMethods.bekle(2);
    }

    @And("Teslimat ili sec")
    public void teslimatIliSec() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        homePage.teslimatIliBul.click();
        ReusableMethods.bekle(2);

    }

    @And("Teslimat ilini {string} olarak isaretle")
    public void teslimatIliniOlarakIsaretle(String teslimatIli) {
        homePage.teslimatIliSec.sendKeys(teslimatIli, Keys.ENTER);
        ReusableMethods.bekle(5);
    }

    @And("Teslimat ilcesi sec")
    public void teslimatIlcesiSec() {
        homePage.teslimatIlcesiBul.click();
        ReusableMethods.bekle(2);
    }

    @And("Teslimat ilcesini {string} olarak isaretle")
    public void teslimatIlcesiniOlarakIsaretle(String teslimatIlcesi) {
        homePage.teslimatIlcesiSec.sendKeys(teslimatIlcesi,Keys.ENTER,Keys.TAB);
        ReusableMethods.bekle(2);

    }

    @And("Teslim alacak kisi AdSoyad kutusuna {string} bilgisi gir")
    public void teslimAlacakKisiAdSoyadKutusunaBilgisiGir(String teslimAdSoyad) {
        homePage.teslimAlacakKisiAdSoyad.sendKeys(teslimAdSoyad,Keys.TAB);
        ReusableMethods.bekle(1);
    }

    @And("Teslim alacak kisi telefon no kutusuna {string} gir")
    public void teslimAlacakKisiTelefonNoKutusunaGir(String teslimTelNo) {
        homePage.teslimAlacakKisiTelNo.sendKeys(teslimTelNo, Keys.TAB);
        ReusableMethods.bekle(1);

    }

    @And("Teslim alacak kisi adres kutusuna {string} gir")
    public void teslimAlacakKisiAdresKutusunaGir(String teslimAdres) {
        homePage.teslimAlacakKisiAdres.sendKeys(teslimAdres);
        ReusableMethods.bekle(2);
    }

    @And("Kart sayfasi ad soyad kutusuna {string} bilgisi gir")
    public void kartSayfasiAdSoyadKutusunaBilgisiGir(String kartAdSoyad) {
        homePage.checkoutAdSoyad.sendKeys(kartAdSoyad,Keys.TAB);
        ReusableMethods.bekle(2);
    }

    @And("Kart numarasi kutusuna {string} bilgisi gir")
    public void kartNumarasiKutusunaBilgisiGir(String kartNo) {
        homePage.checkoutKartNo.sendKeys(kartNo);
        ReusableMethods.bekle(3);
    }

    @And("Son kullanma tarihi olarak ay bilgisi sec")
    public void sonKullanmaTarihiOlarakAyBilgisiSec() {
        homePage.checkoutKartAy.click();
        ReusableMethods.bekle(2);
        //Driver.getDriver().switchTo().frame(0);
        //ReusableMethods.bekle(1);
        homePage.checkoutKartAySec.click();
        ReusableMethods.bekle(2);
    }

    @And("Son kullanma tarihi olarak yil bilgisi sec")
    public void sonKullanmaTarihiOlarakYilBilgisiSec() {
        homePage.checkoutKartYil.click();
        ReusableMethods.bekle(3);
        //Driver.getDriver().switchTo().frame(0);
        homePage.checkoutKartYilSec.click();
        ReusableMethods.bekle(3);

    }

    @And("Güvenlik numarasi bolumune {string} bilgisi gir")
    public void güvenlikNumarasiBolumuneBilgisiGir(String cvv) {
        homePage.checkoutKartCvv.click();
        homePage.checkoutKartCvv.sendKeys(cvv);
        ReusableMethods.bekle(2);
        homePage.cartInfo.click();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
    }

    @And("Siparis ozeti sayfasinda Satıs sozlesmesi goruldugunu dogrula")
    public void siparisOzetiSayfasindaSatısSozlesmesiGoruldugunuDogrula() {
        homePage.satisSozlesmesi.isDisplayed();
        ReusableMethods.bekle(2);

    }

    /////////////////NEGATIF SENARYO ////////////////////////

    @And("Siparisin gerceklesmedigini dogrula")
    public void siparisinGerceklesmediginiDogrula() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(homePage.kullaniciSozlesmesiBos.isDisplayed());
    }

    @And("Siparise devam edilemedigini dogrula")
    public void sipariseDevamEdilemediginiDogrula() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(homePage.teslimatAdSoyadBos.isDisplayed());
    }

    @And("Siparise devam et butonunun aktif olmadigini dogrula")
    public void sipariseDevamEtButonununAktifOlmadiginiDogrula() {
        ReusableMethods.bekle(2);
        Assert.assertFalse(homePage.buttonDisabled.isEnabled());
    }

    @Then("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

};
