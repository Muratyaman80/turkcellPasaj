package turkcell_pasaj.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import turkcell_pasaj.utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Sipariş ve ürün ekleme//

    @FindBy(xpath = "//input[@class='m-p-search-area__input js-autocomplete-input']") public WebElement searchBox;
    @FindBy(xpath = "//a[@data-product-id='greenmnky-usb-to-lightning-kablo']") public WebElement urunEkle;
    @FindBy(xpath = "//button[@data-psi-id='1432105']") public WebElement sepeteEkleKablo;
    @FindBy(xpath = "//a[@id='none-login-sale-button']") public WebElement girisYapmadanDevamEt;
    @FindBy(xpath = "//b[@data-fancyid='#modal-user-agreement']") public WebElement siparisCheckbox;
    @FindBy(xpath = "(//a[contains(text(),'Onayla')])[2]") public WebElement siparisCheckboxOnay;
    @FindBy(xpath = "//button[@class='a-btn a-btn--full js-submit-button']") public WebElement sipariseDevamEt;

    //Teslimat bilgileri//

    @FindBy(xpath = "//input[@id='fullName']") public WebElement adSoyadGir;
    @FindBy(xpath = "//input[@id='gsm-1']") public WebElement telefonNoGir;
    @FindBy(xpath = "//input[@id='email']") public WebElement emailGir;
    @FindBy(xpath = "//input[@id='tckimlik']") public WebElement tcKimlikNoGir;
    @FindBy(xpath = "//span[@id='select2-select-cities-container']") public WebElement teslimatIliBul;
    @FindBy(xpath = "//input[@class='select2-search__field']") public WebElement teslimatIliSec;
    @FindBy(xpath = "//span[@id='select2-select-disct-2-container']") public WebElement teslimatIlcesiBul;
    @FindBy(xpath = "//input[@class='select2-search__field']") public WebElement teslimatIlcesiSec;
    @FindBy(xpath = "//input[@id='customerDeliveryAddressName']") public WebElement teslimAlacakKisiAdSoyad;
    @FindBy(xpath = "//input[@id='customerDeliveryGsm']") public WebElement teslimAlacakKisiTelNo;
    @FindBy(xpath = "//textarea[@id='textarea-02']") public WebElement teslimAlacakKisiAdres;

    //Kart bilgileri(Checkout)//

    @FindBy(xpath = "//input[@id='ccCardHolderName-1']") public WebElement checkoutAdSoyad;
    @FindBy(xpath = "//input[@id='ccCardNumber-1']") public WebElement checkoutKartNo;
    @FindBy(xpath = "//span[@id='select2-ccMonth-1-container']") public WebElement checkoutKartAy;
    @FindBy(xpath = "//ul[@id='select2-ccMonth-1-results']") public WebElement checkoutKartAySec;
    @FindBy(xpath = "//span[@id='select2-ccYear-1-container']") public WebElement checkoutKartYil;
    @FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']") public WebElement checkoutKartYilSec;
    @FindBy(xpath = "//input[@id='ccSecurityNumber-1']") public WebElement checkoutKartCvv;
    @FindBy(xpath = "//div[@class='m-card-extra-info']") public WebElement cartInfo;



    //Sipariş özeti//

    @FindBy(xpath = "//h4[contains(text(),'Mesafeli Satış Sözleşmesi')]") public WebElement satisSozlesmesi;






















}
