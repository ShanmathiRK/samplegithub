package samplegittest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleGitTest {

  @Test
	public void loginTest() throws IOException
	{
		WebDriver WD=new FirefoxDriver();
		WD.get("https://www.bing.com/");
		File src =((TakesScreenshot) WD).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Selenium\\seleniumworkspace\\samplegittest\\screenshot\\test.jpeg"));

	}
	
}
