import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingMultipleTransfer {
private WebDriver driver;
	
	
	public void launchBrowser() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\support\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		//To wait for sometime b4 login in. 
	 	driver.get("https://xmtalat.azurewebsites.net/");
	 	//This maximize the window
	 	driver.manage().window().maximize();
	 	Thread.sleep(2000);
	 	driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
	
	}

	public void login() throws InterruptedException {
		
		driver.findElement(By.id("outlined-basic")).sendKeys("peterstosin556@gmail.com");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.findElement(By.id("outlined-adornment-password")).sendKeys("tosinayoola");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".MuiButton-containedPrimary")).click();
	
		 	  

	}
	
	public void MakeTransfer() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.linkText("Multiple Transfer")).click();
		Thread.sleep(4000);
		
		//create a group of 4
		Thread.sleep(4000);
		driver.findElement(By.id("outlined-basic")).sendKeys("BIT");
		Thread.sleep(2000);
		driver.findElement(By.id("demo-simple-select")).click();
		driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[4]/button[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/h6[1]")).click();
		Thread.sleep(4000);
		
		//Enter recipient account number
	
		driver.findElement(By.id("outlined-basic")).sendKeys("5786443687");
		Thread.sleep(1000);
		driver.findElement(By.id("demo-simple-select1")).click();
		driver.findElement(By.cssSelector(".MuiMenuItem-root:nth-child(2)")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("1000");
		Thread.sleep(4000);
		
		//second division
	
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("3426724816");
		Thread.sleep(1000);
		driver.findElement(By.id("demo-simple-select2")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='2']/div[3]/div/input")).sendKeys("2000");
		
		Thread.sleep(4000);
		
		//Proceed
		
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[6]/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='filled-password-input']")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Pay')]")).click();
		Thread.sleep(4000);
		
		//logout
		driver.findElement(By.cssSelector(".MuiButton-textInherit")).click();
		
	}
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(1000);
		
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		
		
		TestingMultipleTransfer obj = new TestingMultipleTransfer();
				obj.launchBrowser();
				obj.login();
				obj.MakeTransfer();
				obj.CloseBrowser();
}
}
