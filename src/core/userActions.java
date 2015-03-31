package core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class userActions {
	public class java {

	}

	private WebDriver driver;
	private String url = "http://localhost";
	
	public void setUrl(String url){		
		this.url = url;
	}
	
	public void openWebPage() throws Exception{
		if(this.driver == null){
			this.makeChromeDriver();
		}
		if(url == null){
			throw new Exception("No Url to load");
		} else {
			this.driver.get(this.url);
		}		
	}
	
	public void clickLink(String identifier) throws Exception{
		WebElement el = this.findElementByClass(identifier);
		if(el == null){
			throw new Exception("Element not found");
		} else {
			el.click();
		}
	}
	
	public WebElement findElementByClass(String name){
		return (WebElement) driver.findElement(By.className(name));
	}
	
//	public WebElement findElementById(String name{
//		
//	}
//	
//	public WebElement findElementByName(String name){
//		return driver.findElement(By.id());
//		
//	}
//	
	public void buildActions(Map<String,WebElement> actions){
		//Params
		//1 = Action
		//2 = Element to perform action on 
		//3 = Agruments to pass on elements
		Actions builder = this.makeActionBuilder();
		
	}
	
	private Actions makeActionBuilder(){
		return new Actions(this.driver);
		
	}
	private void makeChromeDriver(){
		this.driver = new ChromeDriver();
	}
	
	private void makeIEDriver(){
		
	}
	
	private void makeDriver(){
		
		
	}
	
}
