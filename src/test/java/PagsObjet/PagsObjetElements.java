package PagsObjet;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import MapsObjet.MapsObjetElements;
import utilidadesExcel.ReadExcelFile;

public class PagsObjetElements extends MapsObjetElements
{
	public PagsObjetElements(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
	
	public void urlAcceso(String url) 
	{
		driver.get(url);
		//busquedaInicial();
	}
	
	
	// METODO PRIEMRA PRUEBA 
	
	public void Registro(ReadExcelFile leer, Properties propiedades, String numHoja,File rutaCarpeta) throws Exception{
		
		click(btnelements, rutaCarpeta);
		
		
		
		//sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"), "Mercu", 1, 0), btnregistrar,rutaCarpeta);
		// TIEMPO DE ESPERA 
		// CLICK	
		
		click(webtables, rutaCarpeta);
		
		
		click(add, rutaCarpeta);
		
		
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"),numHoja,1,1),txtFN,rutaCarpeta);
	
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"),numHoja,1,2),txtLN,rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"),numHoja,1,3),txtEmail,rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"),numHoja,1,4),txtAge,rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"),numHoja,1,5),txtSalary,rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"),numHoja,1,6),txtDepartment,rutaCarpeta);
		
		click(submit, rutaCarpeta);
		tiempoEspera(1000);
		
		
		click(delete, rutaCarpeta);
		tiempoEspera(1000);

	}
	
}
	   
		

