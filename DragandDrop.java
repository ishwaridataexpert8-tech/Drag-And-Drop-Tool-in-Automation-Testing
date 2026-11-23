package drag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	public static void main(String[] args) {
		
		WebDriver web = new FirefoxDriver();
		web.manage().window().maximize();
		
		web.get("https://demoqa.com/buttons");
		
		WebElement doublclicl = web.findElement(By.id("doubleClickBtn"));
		
		Actions act = new Actions(web);
		
		act.doubleClick(doublclicl).perform();
		
		/*web.get("https://thekiranacademy.com/");
		WebElement allcourses = web.findElement(By.xpath("/html/body/header/nav/div/div[1]/div/button"));
		WebElement datascience = web.findElement(By.className("mega-tab"));
		WebElement python = web.findElement(By.xpath("/html/body/header/nav/div/div[1]/div/div[1]/div[2]/div[2]/a[3]"));
		
		Actions act = new Actions(web);
	
		
		act.moveToElement(allcourses).perform();
		act.moveToElement(datascience).perform();
		act.moveToElement(python).click().perform();*/
		
	//	act.moveToElement(allcourses).moveToElement(datascience).moveToElement(python).click().perform();
		
		/*
		web.get("https://practice-automation.com/hover/");//https://practice.expandtesting.com/tooltips
		
	WebElement point = web.findElement(By.id("mouse_over"));
	
	Actions act = new Actions(web);
	
	act.moveToElement(point).perform();
	
	
	String text = point.getText();
	
	if(text.equals(point))
	{
		System.out.println("Text is match");
	}
	else
	{
		System.out.println("Text is not match");
	}
	*/	
		
		/*web.get("https://practice-automation.com/slider/");
		
		WebElement mouse = web.findElement(By.id("slideMe"));
		
		Actions act = new Actions(web);
		
		//act.dragAndDropBy(mouse, 10, 0).perform();
		act.clickAndHold(mouse).moveByOffset(70, 0).perform();
		
		String value = mouse.getText();
		if(!value.equals("25"))
		{
			System.out.println(" mouse is moved");
			}
		*/
		
		
		
		/*web.get("https://practice.expandtesting.com/drag-and-drop-circles");
		
		WebElement red = web.findElement(By.xpath("//*[@id=\"source\"]/div[1]"));
		WebElement green = web.findElement(By.xpath("//*[@id=\"source\"]/div[2]"));
		WebElement blue = web.findElement(By.xpath("//*[@id=\"source\"]/div[3]"));
		WebElement container = web.findElement(By.xpath("//*[@id=\"target\"]"));
				
		act.clickAndHold(red).moveToElement(container).release().build().perform();
		act.clickAndHold(green).moveToElement(container).release().build().perform();   
	    act.dragAndDrop(blue, container).perform();*/
	}

}
