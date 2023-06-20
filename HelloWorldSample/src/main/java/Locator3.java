
        import java.util.Arrays;

        import org.openqa.selenium.By;

		import org.openqa.selenium.WebDriver;

		import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.chrome.ChromeOptions;



		public class Locator3 {



		public static void main(String[] args) {

		// TODO Auto-generated method stub


			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\chromeDriver\\chromedriver_win32\\chromedriver.exe");  
			ChromeOptions co = new ChromeOptions();
		    co.addArguments(Arrays.asList("--remote-allow-origins=*",  "--lang=en_US"));

		    WebDriver driver=new ChromeDriver(co); 

		// Sibling - Child to parent traverse

		//header/div/button[1]/following-sibling::button[1]

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());



		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());









		}



		
	}


