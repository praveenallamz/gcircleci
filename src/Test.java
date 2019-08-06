import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","../chromedriver");
		//WebDriver driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
		  driver = new ChromeDriver();
		
		  driver.manage().window().maximize();
		//driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.get("https://www.google.com");
		
		Thread.sleep(5000);
		/*driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("priyanka.medisetti@testingxperts.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("9553271250");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		Thread.sleep(10000);
				
		driver.findElement(By.xpath("//table[@class='F cf zt']//tbody//child::tr[1]//child::td[@tabindex='-1']")).click();*/
		
		
		
		

	}

}
