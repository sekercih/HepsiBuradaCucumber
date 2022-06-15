package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(new
                AppiumFieldDecorator(Driver.get()),this);


    }
}
