package MapsObjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.semillerospom.prueba.ClasesBase;

public class MapsObjetWidgets extends ClasesBase{

	public MapsObjetWidgets(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	protected By btnwidgets= By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/span[1]/div[1]");
	protected By datepicker= By.xpath("//span[contains(text(),'Date Picker')]");
	protected By selectdate = By.xpath("//*[@id='datePickerMonthYearInput']");
	protected By dateMonthDateHour = By.id("dateAndTimePickerInput");
	
}

