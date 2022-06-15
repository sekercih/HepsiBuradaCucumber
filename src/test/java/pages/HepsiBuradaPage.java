package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HepsiBuradaPage extends BasePage {

@AndroidFindBy(id = "com.pozitron.hepsiburada:id/textViewLocation")
public WebElement konum;

@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"İl seçin\"]")
public WebElement ilSec;


     //count = driver.findElements(by.xpath("abc"));


}
//*[@id="selectedElementContainer"]/div/div[2]/div/div[4]/div/div/div/div/div/div/table/tbody/tr[5]/td[2]/div