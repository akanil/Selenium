package locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gsArenaChkBox {

	public static void main(String[] args)
	{
			// TODO Auto-generated method stub
			
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().refresh();
			driver.manage().window().maximize();
			
			driver.get("http://www.gsmarena.com/nokia-phones-1.php");
			String xp = "//input[@type='Checkbox']";
			List<WebElement> allChkBox = driver.findElements(By.xpath(xp));
			int count  = allChkBox.size();
//			// for used for selecting one by one check box
//				for ( int i = 0; i <count; i++)
//				{
//						WebElement v = allChkBox.get(i);
//						v.click();
//				}
//				
//			// for loop for selecting from reverse 
//				for (int i = count-1; i>=0; i--)
//				{
//					WebElement v = allChkBox.get(i);
//							v.click();
//				}
		// for loop for clicking alternative check box
				for ( int i = 0 ; i<count; i=i+2)
				{
					WebElement v = allChkBox.get(i);
					v.click();
				}
		//  selecting last element
				allChkBox.get(count-1).click();
				
		//Selecting first element
				allChkBox.get(0).click();
				
		// check for isSlected checkbox for each element 
				for ( WebElement v : allChkBox)
				{
					int i =0 ; 
					if(v.isSelected())
					{
						System.out.println("Check Box is Selected + i");
						i++;
					}
					else
					{
						System.out.println("Chekc Box is not Selected");
					}
				}
		}
		
	}


