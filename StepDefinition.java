package StepDefinition;	
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class RegistrationPage {
WebDriver driver;
public void invokeBrowser() {
try {
{
System.setProperty(“webdriver.chrome.driver”, “D:\\Chrome\\chromedriver.exe”);
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
}
} catch (Exception e) {
e.printStackTrace();
}
}
public void registration() {
try {
{
driver.navigate().to(“http://https://parabank.parasoft.com/”);
driver.findElement(By.id(“name_3_firstname”)).sendKeys(“LEAH”);
driver.findElement(By.id(“name_3_lastname”)).sendKeys(“KAHIGA”);
driver.findElement(By.id(“address”)).sendKeys(“180”);
driver.findElement(By.id(“city”)).sendKeys(“Nairobi”);
driver.findElement(By.id(“State”)).sendKeys(“kenya”);
driver.findElement(By.id(“code”)).sendKeys(“+254”);
driver.findElement(By.id(“SSN”)).sendKeys(“180IOIYYV”);
driver.findElement(By.id(“username”)).sendKeys(“LKAHIGA”)
driver.findElement(By.id(“password_2”)).sendKeys(“2789800-”);
driver.findElement(By.id(“confirm_password_password_2”)).sendKeys(“2789800”);
//click on submit button
driver.findElement(By.name(“pie_submit”)).click();
}
} catch (InterruptedException e) {
e.printStackTrace();
}
}
public static void main(String[] args) {
RegistrationPage obj=new RegistrationPage();
obj.invokeBrowser();
obj.registration();
}
}