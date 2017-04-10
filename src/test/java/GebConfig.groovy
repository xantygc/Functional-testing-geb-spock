import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

driver = {
    System.setProperty('webdriver.chrome.driver', '/home/santy/Environment/chromeDriver/chromedriver')
    new ChromeDriver()
}

baseUrl = "http://xrem.axpoiberia.es/"
reportsDir = new File("target/geb-reports")