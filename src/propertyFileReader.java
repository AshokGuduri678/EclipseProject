import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class propertyFileReader {
	 static WebDriver driver;

	public static void main(String[] args) throws Throwable  {
		FileInputStream file=new FileInputStream("C:\\EclipseJava\\BeForYourSelf\\PropertyFile\\config.properties");
        Properties properties = new Properties();
        properties.load(file);
        String value=properties.getProperty("url");
        System.out.println(value);
         
        if(value.equals("chrome")){
        	 driver = new ChromeDriver();
        }else if(value.equals("edge")){
        	driver=new EdgeDriver();
        }else{
        	driver =new FirefoxDriver();
        }
	
	}

}
