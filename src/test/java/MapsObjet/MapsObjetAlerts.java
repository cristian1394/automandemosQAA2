package MapsObjet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.semillerospom.prueba.ClasesBase;

public class MapsObjetAlerts extends ClasesBase{

	public MapsObjetAlerts(WebDriver driver) 
	{
		
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	protected By alertsframe= By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]");
	protected By alerts= By.xpath("//span[contains(text(),'Alerts')]");
	
	
	//protected By btnRecoWidget = By.xpath("//div[1]//div[1]//div[4]//span[1]//div[1]//div[2]//div[2]//*[name()='svg']");
	//protected By btnFrame = By.xpath("//*[@class='left-pannel']/div/div[3]");
	//protected By btnAlerts = By.xpath("//span[normalize-space()='Alerts']");
	protected By btnClic1 = By.xpath("//button[@id='alertButton']");
	protected By btnClic2 = By.xpath("//button[@id='timerAlertButton']");
	protected By btnClic3 = By.xpath("//button[@id='confirmButton']");
	protected By btnClic4 = By.xpath("//button[@id='promtButton']");
	
	

}
