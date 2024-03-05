package runner.browser_manager;


import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{

    @Override
    public void createDriver(){
        System.setProperty("webdriver.gecko.driver","/home/mint/COSAS MIAS/JAVA/drivers/firefox/geckodriver");
        driver=new FirefoxDriver();

    }
}
