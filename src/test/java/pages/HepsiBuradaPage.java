package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HepsiBuradaPage extends BasePage {
        @AndroidFindBy(id = "com.pozitron.hepsiburada:id/search_camera")
        public WebElement popUp;

        @AndroidFindBy(id = "com.pozitron.hepsiburada:id/textViewTitle")
        public WebElement konum;

        @AndroidFindBy(className = "_inspector-toolbar_619e8")
        public WebElement bosluk;

        @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView[1]/android.view.ViewGroup\n")
        public WebElement sehirBox;

        @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")
        public WebElement adana;

        @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"İlçe seçin\"]")
        public WebElement ilce;

        @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")
        public WebElement ceyhan;

        @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Mahalle seçin\"]")
        public WebElement mahalle;

        @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView")
        public WebElement agacpinarMahalle;

        @AndroidFindBy(id = "com.pozitron.hepsiburada:id/button")
        public WebElement kaydetButton;

        @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Kategorilerim\"]/android.widget.FrameLayout/android.widget.ImageView")
        public WebElement kategorilerButton;

        @AndroidFindBy(id ="com.pozitron.hepsiburada:id/dod_title")
        public WebElement superf;
}