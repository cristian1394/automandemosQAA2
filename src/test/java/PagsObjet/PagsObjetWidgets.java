package PagsObjet;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import MapsObjet.MapsObjetWidgets;
import utilidadesExcel.ReadExcelFile;

public class PagsObjetWidgets extends MapsObjetWidgets{

	public PagsObjetWidgets(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
    
	public void SeleccionarDate(ReadExcelFile leer, Properties propiedades, String numHoja,File rutaCarpeta) throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		click(btnwidgets, rutaCarpeta);
		tiempoEspera(2000);
		
		click(datepicker, rutaCarpeta);
		tiempoEspera(1000);
		
		click(selectdate, rutaCarpeta);
		tiempoEspera(3000);
		
		controla(selectdate,rutaCarpeta);
		tiempoEspera(3000);
		
		teclaborrar(selectdate, rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"),"Mercu",1,9),selectdate,rutaCarpeta);
		
		intro(selectdate,rutaCarpeta);
		
		controla(dateMonthDateHour,rutaCarpeta);
		tiempoEspera(3000);
		
		teclaborrar(dateMonthDateHour, rutaCarpeta);
		
		// concatenar  +","+
		String datos = (leer.getCellValue(propiedades.getProperty("filePathExcel"),"Mercu",1,10)+","+(leer.getCellValue(propiedades.getProperty("filePathExcel"),"Mercu",1,11)));
		
		sendkey(datos,dateMonthDateHour, rutaCarpeta);
		
		intro(dateMonthDateHour,rutaCarpeta);
	
		
		
	}
	
}
