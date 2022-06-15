package stepdefinition;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.WebElement;
import pages.HepsiBuradaPage;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class HepsiBuradaStepdefinition {
    HepsiBuradaPage api=new pages.HepsiBuradaPage();
    Driver driver;
    @Given("Anasayfada Konum alanına Kklanır.")
    public void anasayfada_konum_alanına_kklanır() {
        api.konum.click();
    }
    @Given("İl, ilçe ve mahalle sKonumunuz Kaydedildi popup’ı kontrol edilir.")
    public void i̇l_ilçe_ve_mahalle_s_konumunuz_kaydedildi_popup_ı_kontrol_edilir() {

        TouchAction touchAction = new TouchAction(Driver.get());
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(api.ilSec)).withDuration(Duration.ofSeconds(3))).perform();

    }
    @Given("Konumunuz Kaydedildi popup’ı kontrol edilir.")
    public void konumunuz_kaydedildi_popup_ı_kontrol_edilir() {

    }
    @Given("Tab bar üzerinden kategoriler tabına Kklanır.")
    public void tab_bar_üzerinden_kategoriler_tabına_kklanır() {

    }
    @Given("Herhangi bir kategori seçilip listeleme sayfasına yönlenilir.")
    public void herhangi_bir_kategori_seçilip_listeleme_sayfasına_yönlenilir() {

    }
    @Then("Listeleme sayfasında Yarın Kapında alanında gelen il bilgisi ile anasayfada seçilen il bilgisinin aynı olduğu kontrol edilir.")
    public void listeleme_sayfasında_yarın_kapında_alanında_gelen_il_bilgisi_ile_anasayfada_seçilen_il_bilgisinin_aynı_olduğu_kontrol_edilir() {

    }

}
