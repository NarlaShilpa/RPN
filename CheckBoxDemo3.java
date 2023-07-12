package SeleniumBatch33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo3 {

	public static void main(String[] args) {



		WebDriver driver=new ChromeDriver();
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
		WebElement checkBox=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

		boolean actualCheckBoxDispalyed=checkBox.isDisplayed();
		boolean ExpectedCheckBoxDispalyed=true;
		System.out.println(" checkBox is dispalyeing :"+ actualCheckBoxDispalyed);
		if(actualCheckBoxDispalyed== ExpectedCheckBoxDispalyed) 
		{
			System.out.println(" checkBox is isDisplayed"); 

		}
		else 
		{
			System.out.println(" checkBox is not isDisplayed"); 

		}
		boolean actualCheckBoxEnabled=checkBox.isEnabled();
		boolean ExpectedCheckBoxEnabled=true;
		System.out.println(" checkBox is enabled :"+ actualCheckBoxEnabled);
		if(actualCheckBoxEnabled== ExpectedCheckBoxEnabled) 
		{
			System.out.println(" checkBox is is Enabled"); 

		}
		else 
		{
			System.out.println(" checkBox is not isEnabled"); 

		}
		boolean actualCheckBoxSelected=checkBox.isSelected();
		boolean ExpectedCheckBoxSelected=false;
		System.out.println(" checkBox is isSelected :"+ actualCheckBoxSelected);
		if(actualCheckBoxSelected== ExpectedCheckBoxSelected) 
		{
			System.out.println(" checkBox is  Selected"); 

		}
		else 
		{
			System.out.println(" checkBox is  not Selected"); 

		}
		checkBox.click();

		boolean afterCheckBoxSelected=checkBox.isSelected();
		boolean afterExpectedCheckBoxSelected=true;
		System.out.println("After click checkBox is isSelected :"+ afterCheckBoxSelected);
		if(afterCheckBoxSelected== afterExpectedCheckBoxSelected) 
		{
			System.out.println("After click checkBox is  Selected :"); 

		}
		else 
		{
			System.out.println("After click checkBox  is not Selected :"); 

		}
		
		
		


	
	
	}

}
