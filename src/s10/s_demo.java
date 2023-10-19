package s10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_demo {

    public static void main(String[] args) throws InterruptedException {
		 //set the location of chrome browser from the local machine path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
        // Initialize browser
         WebDriver driver=new ChromeDriver();

	}

}
