package SeleniumBatch33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import freemarker.cache.WebappTemplateLoader;

public class CheckBoxDemo1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		WebElement checkBox=driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		//WebElement checkBox=driver.findElement(By.xpath("//input[@id='ContentHolder_lbFeatures_VI']"));

		boolean actualCheckBoxDispalyed=checkBox.isDisplayed();
		boolean ExpectedCheckBoxDispalyed=true;
		System.out.println(" checkBox is dispalyeing :"+ actualCheckBoxDispalyed);
		if(actualCheckBoxDispalyed== ExpectedCheckBoxDispalyed) 
		{
			System.out.println(" checkBox is isDisplayed"); 			
			System.out.println(" checkBox is isDisplayed central repo"); 

			

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
			System.out.println(" checkBox is  not Selected"); 
			checkBox.click();

		}
		else 
		{
			System.out.println(" checkBox is Selected"); 

		}
		//checkBox.click();
	//WebElement checkBOX1	=driver.findElement(By.id("ContentHolder_lbFeatures_LBI0T1"));

		boolean afterCheckBoxSelected=checkBox.isSelected();
		boolean afterExpectedCheckBoxSelected=true;
		System.out.println("After click checkBox is isSelected :"+ afterCheckBoxSelected);
		if(afterCheckBoxSelected== afterExpectedCheckBoxSelected) 
		{
			System.out.println("After click checkBox is isSelected :"); 

		}
		else 
		{
			System.out.println("After click checkBox not is isSelected :"); 

		}
		
		


	}

}
