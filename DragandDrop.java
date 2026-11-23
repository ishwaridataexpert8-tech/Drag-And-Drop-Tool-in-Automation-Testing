package drag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	public static void main(String[] args) {
		
		WebDriver web = new ChromeDriver();
		
		web.manage().window().maximize();
		
		
		web.get("https://practice-automation.com/slider/");
		
		WebElement mouse = web.findElement(By.id("slideMe"));
		
		Actions act = new Actions(web);
		
		act.dragAndDropBy(mouse, 10, 0).perform();
	//	act.moveToElement(mouse, 50, 0).perform();
		
		/*web.get("https://practice.expandtesting.com/drag-and-drop-circles");
		
		WebElement red = web.findElement(By.xpath("//*[@id=\"source\"]/div[1]"));
		WebElement green = web.findElement(By.xpath("//*[@id=\"source\"]/div[2]"));
		WebElement blue = web.findElement(By.xpath("//*[@id=\"source\"]/div[3]"));
		WebElement container = web.findElement(By.xpath("//*[@id=\"target\"]"));
		
		Actions act = new Actions(web);
		
		act.clickAndHold(red).moveToElement(container).release().build().perform();
		act.clickAndHold(green).moveToElement(container).release().build().perform();   
	    act.dragAndDrop(blue, container).perform();*/
	}

}
