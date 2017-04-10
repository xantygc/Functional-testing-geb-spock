import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

//driver = { new FirefoxDriver() }

driver = {
    System.setProperty('webdriver.chrome.driver', '/home/santy/Environment/chromeDriver/chromedriver')
    new ChromeDriver()
}

baseUrl = "http://212.166.75.102/"
reportsDir = new File("target/geb-reports")