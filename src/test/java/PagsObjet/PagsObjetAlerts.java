package PagsObjet;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import MapsObjet.MapsObjetAlerts;
import utilidadesExcel.ReadExcelFile;

public class PagsObjetAlerts extends MapsObjetAlerts

{
	// CREAR CONSTRUCTOR DE LA CALSE

	public PagsObjetAlerts(WebDriver driver) {
		super(driver);
		this.driver=driver;

	}

		

	// METODO PRIMERA PRUEBA

	//public void busquedaInicial(ReadExcelFile leer, Properties propiedades, String numHoja, File rutaCarpeta) throws Exception
	
	
	public void busquedaAlert( ReadExcelFile leer, Properties propiedades, String numHoja,File rutaCarpeta) throws Exception
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,100)");
		
		click(alertsframe, rutaCarpeta);
		tiempoEspera(2000);
		
		click(alerts, rutaCarpeta);
		tiempoEspera(1000);
		
		click(btnClic1, rutaCarpeta);
		driver.switchTo().alert().dismiss();
		tiempoEspera(1000);
		click(btnClic2, rutaCarpeta);
		tiempoEspera(7000);
		driver.switchTo().alert().dismiss();
		tiempoEspera(500);
		click(btnClic3, rutaCarpeta);
		tiempoEspera(500);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		tiempoEspera(500);
		click(btnClic3, rutaCarpeta);
		tiempoEspera(500);
		driver.switchTo().alert().dismiss();
		tiempoEspera(500);
		click(btnClic4, rutaCarpeta);
		
		driver.switchTo().alert().sendKeys(leer.getCellValue(propiedades.getProperty("filePathExcel"),numHoja,1,8));
		alert();
		tiempoEspera(5000);

		
	}
}
