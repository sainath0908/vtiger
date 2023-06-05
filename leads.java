package mock;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class leads
{
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("appnavigator")).click();
		driver.findElement(By.xpath("//span[contains(text(),' MARKETING')]")).click();
				
		WebElement ele = driver.findElement(By.partialLinkText("Leads"));
		Actions a = new Actions(driver);
		a.click(ele).perform();
		driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();
	    driver.findElement(By.id("s2id_autogen1")).click();
	    WebElement pro = driver.findElement(By.id("s2id_autogen2_search"));
	    pro.sendKeys("Mr.");
	    pro.sendKeys(Keys.ENTER);
	    driver.findElement(By.id("Leads_editView_fieldName_firstname")).sendKeys("Sainath");
	    driver.findElement(By.id("Leads_editView_fieldName_lastname")).sendKeys("Aldar");
	    driver.findElement(By.id("Leads_editView_fieldName_phone")).sendKeys("7718927701");
	    driver.findElement(By.id("Leads_editView_fieldName_company")).sendKeys("DS Softwares");
	    driver.findElement(By.id("Leads_editView_fieldName_mobile")).sendKeys("7030602570");
	    driver.findElement(By.id("Leads_editView_fieldName_designation")).sendKeys("MD & CEO");
	    driver.findElement(By.id("Leads_editView_fieldName_fax")).sendKeys("abcde@15");
	    driver.findElement(By.id("s2id_autogen3")).click();
	    WebElement source = driver.findElement(By.id("s2id_autogen4_search"));
	    source.sendKeys("Self Generated");
	    source.sendKeys(Keys.ENTER);
	    driver.findElement(By.id("Leads_editView_fieldName_email")).sendKeys("sainathaldar@yahoo.com");
	    driver.findElement(By.id("s2id_autogen5")).click();
	    WebElement industry = driver.findElement(By.id("s2id_autogen6_search"));
	    industry.sendKeys("Engineering");
	    industry.sendKeys(Keys.ENTER);
	    driver.findElement(By.id("Leads_editView_fieldName_website")).sendKeys("https://www.dsindustries.com");
	    driver.findElement(By.id("Leads_editView_fieldName_annualrevenue")).sendKeys("1000000000");
	    driver.findElement(By.id("s2id_autogen7")).click();
	    WebElement leadstatus = driver.findElement(By.id("s2id_autogen8_search"));
	    leadstatus.sendKeys("Qualified");
	    leadstatus.sendKeys(Keys.ENTER);
	    driver.findElement(By.id("Leads_editView_fieldName_noofemployees")).sendKeys("5000");
	    driver.findElement(By.id("s2id_autogen9")).click();
	    WebElement rating = driver.findElement(By.id("s2id_autogen10_search"));
	    rating.sendKeys("Active");
	    rating.sendKeys(Keys.ENTER);
	    driver.findElement(By.id("Leads_editView_fieldName_secondaryemail")).sendKeys("sai@yahoo.com");
	    driver.findElement(By.id("s2id_autogen11")).click();
	    WebElement assign = driver.findElement(By.id("s2id_autogen12_search"));
	    assign.sendKeys("Atlas Jeniffer");
	    assign.sendKeys(Keys.ENTER);
	    driver.findElement(By.id("Leads_editView_fieldName_emailoptout")).click();
	    Thread.sleep(2000);
	    JavascriptExecutor jse =( JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(1000);
	    driver.findElement(By.id("Leads_editView_fieldName_lane")).sendKeys("dew drop");
	    driver.findElement(By.id("Leads_editView_fieldName_pobox")).sendKeys("shikrapur post");
	    driver.findElement(By.id("Leads_editView_fieldName_code")).sendKeys("412208");
	    driver.findElement(By.id("Leads_editView_fieldName_city")).sendKeys("Pune");
	    driver.findElement(By.id("Leads_editView_fieldName_country")).sendKeys("India");
	    driver.findElement(By.id("Leads_editView_fieldName_state")).sendKeys("Maharashtra");
	    driver.findElement(By.id("Leads_editView_fieldName_description")).sendKeys("ABCDEFG");
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	    Thread.sleep(2000);
	    Runtime.getRuntime().exec("");
	  
	    driver.findElement(By.id("//span[text()='Atlas Jeniffer']")).click();
	    driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	      
	}

}