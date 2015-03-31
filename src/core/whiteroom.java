package core;

import java.sql.Timestamp;

public class whiteroom {
	public static void main(String[] args){
		
	}
	
	public void testOne(){
		userActions test = new userActions();
		//test.setUrl("http://localhost/");
		try {
			Timestamp start = new Timestamp(System.currentTimeMillis());
			test.openWebPage();
			Timestamp end = new Timestamp(System.currentTimeMillis());
			long duration = end.getTime() - start.getTime();
			test.clickLink("google-container-link");
			
			System.out.println("Browser start up takes > " + duration);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Thrown: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void testTwo(){
		userActions test = new userActions();
		try{
			WebElement googleLink = test.findElementByClass("google-container-link");
			Map<String, WebElement> store = new HashMap<String, WebElement>();
			WebElement inputText = test.findElementByName("q");
			WebElement goButton = test.findElementByName("btnG");
			store("click", googleLink);
			store("sendKeys",)
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Thrown: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
}
