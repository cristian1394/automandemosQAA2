package MapsObjet;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.semillerospom.prueba.ClasesBase;

public class MapsObjetElements extends ClasesBase {

	public MapsObjetElements(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
    // ELEMENTOS DE LA PAGINA INICIAL
	
	protected By btnelements= By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]");
	protected By webtables= By.xpath("//span[contains(text(),'Web Tables')]");
	protected By add= By.xpath("//button[@id='addNewRecordButton']");
	protected By txtFN= By.xpath("//input[@id='firstName']");
	protected By txtLN= By.xpath("//input[@id='lastName']");
	protected By txtEmail= By.xpath("//input[@id='userEmail']");
	protected By txtAge= By.xpath("//input[@id='age']");
	protected By txtSalary= By.xpath("//input[@id='salary']");
	protected By txtDepartment= By.xpath("//input[@id='department']");
	protected By submit= By.xpath("//button[@id='submit']");
	
	
	protected By delete= By.xpath("//span[@id='delete-record-2']");
	//protected By btnwidgets= By.xpath("//*[@class='left-pannel']/div/div[4]");
	
	//protected By datepicker= By.xpath("//span[contains(text(),'Date Picker')]");
	
	//protected By selectdate= By.xpath("//input[@id='datePickerMonthYearInput']");
	//protected By txtDate= By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]");
	
	
	
	/*
	protected By Country= By.xpath("//input[@name='email']");
	protected By txtUN= By.xpath("//input[@name='email']");
	protected By txtPswd= By.xpath("//input[@name='password']");
	protected By txtCPswd= By.xpath("//input[@name='confirmPassword']");
	protected By enviar= By.xpath("//input[@name='submit']");
	
	*/
	
}
