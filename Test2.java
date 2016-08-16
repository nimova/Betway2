package Betway;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

		public static void main(String[] args) throws Exception {

			
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://news.google.co.uk/nwshp?hl=en&ei=gRSyV-OrMcv-Usr-hqgI&ved=0EKkuCAkoBw");
			
			driver.manage().window().maximize();
	
			List <WebElement> header = driver.findElements(By.className("titletext"));
			
				//Create File In D: Driver.
				
				String TestFile = "D:\\test2.txt";
				
				File FC = new File(TestFile);
				FC.createNewFile();//Create file.
				
				//Writing In to file.

				FileWriter FW = new FileWriter(TestFile);
				BufferedWriter BW = new BufferedWriter(FW);

				
	        	
	        	for(WebElement ele : header)
				{
					BW.write("Headline " + ele.getText());
					BW.newLine();
					System.out.println(ele.getText());	
				}	
	        	
	        	BW.close();
	        	driver.close();
		}			
			
		
}
						

