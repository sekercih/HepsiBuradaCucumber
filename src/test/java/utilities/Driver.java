package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver() {
    }

    private static AndroidDriver<AndroidElement> driver;
    public static String userName = "hokka_2F5zSw";
    public static String accessKey = "PnAir8CguqWLb71uwtzL";
    public static String bs="bs://4115953dd18b61b53ecc87c475b1bc43883faf59";

    public static AndroidDriver<AndroidElement> get() {
        if (driver == null) {
            String platform = ConfigurationReader.get("platform");
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();


            switch (platform) {
                case "android":

                    desiredCapabilities.setCapability("platformName", "Android");
                    desiredCapabilities.setCapability("platformVersion", "10.0");
                    desiredCapabilities.setCapability("deviceName", "Pixel3");
                    desiredCapabilities.setCapability("automationName", "UiAutomator2");
                    desiredCapabilities.setCapability("app", "C:\\Users\\Mehmet\\Desktop\\ApidemosCucumber\\hepsiburada.apk");

                    try {
                        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
                        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "browserstack":


                    desiredCapabilities.setCapability("platformName", "android");
                    desiredCapabilities.setCapability("platformVersion", "9.0");
                    desiredCapabilities.setCapability("deviceName", "Google Pixel 3");
                    desiredCapabilities.setCapability("app", bs);


                    try {
                        driver = new AndroidDriver<AndroidElement>(new URL("https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), desiredCapabilities);
                        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                default:

            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}