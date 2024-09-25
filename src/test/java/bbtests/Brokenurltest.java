package bbtests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenurltest {
	
	   protected static String url="https://www.bestbuy.com";
	   WebDriver driver;

@BeforeSuite 
public void startchromebrowser() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}	

@BeforeMethod
public void openurl() {
	  driver.get(url);
}

@Test
public void tesrbrokenurl() throws IOException {
	//create set of url
	Set<String> brokenlinkurls=new HashSet<String>();
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	//iterate through each link
	for(WebElement link:links) {
		String linkurl=link.getAttribute("href");
//		Proxy proxy=new Proxy(java.net.Proxy.Type.HTTP,new InetSocketAddress("bestbuy", 80));
		//create url object
		URL url=new URL(linkurl);
		//open connection using url for specific proxy
//		URLConnection urlConnection=url.openConnection(proxy);
		//caste the url connection to httpurl connection
//		HttpURLConnection httpURLConnection=(HttpURLConnection)urlConnection;
		HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
		httpURLConnection.setConnectTimeout(5000);
		httpURLConnection.connect();//establish connection
		
		//check if http connection code !=200
		if(httpURLConnection.getResponseCode()==200) {
			System.out.println("broken url: "+httpURLConnection.getResponseMessage());
		}else {
			System.out.println("broken url: "+httpURLConnection.getResponseMessage());
		}		
		httpURLConnection.disconnect();
	}
	
//	//print broken url
//	for(String brokenlinkurl:brokenlinkurls) {
//		System.out.println(brokenlinkurl);
//	}
}

@AfterSuite
public void closechromebrowser() {
	  driver.quit();
}
}
