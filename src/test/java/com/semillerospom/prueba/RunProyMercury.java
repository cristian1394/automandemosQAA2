package com.semillerospom.prueba;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import PagsObjet.PagsObjetAlerts;
import PagsObjet.PagsObjetElements;
import PagsObjet.PagsObjetWidgets;
import utilidadesExcel.ReadExcelFile;
import utilidadesExcel.WriteExcelFile;

public class RunProyMercury {

	// CREAR OBJETO WebDriver
		private WebDriver driver;
        PagsObjetAlerts paginaAlert;
		PagsObjetElements guru;
		PagsObjetWidgets widget;
		Properties propiedades;
		ReadExcelFile leer;
		WriteExcelFile escribir;
		
		
		
		
		String url = null;

		@Before

		public void setUp() throws IOException

		{
			driver = ClasesBase.chomeDriverConnection();
	        paginaAlert = new PagsObjetAlerts(driver);
			guru = new PagsObjetElements(driver);
			widget = new PagsObjetWidgets(driver);
			
			
			// INSTANCIAR LA CLASE PAGSOBJET
			propiedades = new Properties();
			//claseBase = new ClasesBase(driver);
			

			// INSTANCIAR LAS CLASES DE EXCEL
			leer = new ReadExcelFile();
			escribir = new WriteExcelFile();
			//driver = claseBase.chomeDriverConnection();
			

			// CEREAR VARIBLE TIPO INPUTSTRING
			InputStream entrada = null;

			// VALIDAR SI GENERA ERROR AL NO ENCONTRAR EL ARCHIVO

			try {

				entrada = new FileInputStream("./Properties/datos.properties");
				propiedades.load(entrada);
			}

			catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.print(e);

			}

		}	
		
		 @Test // PRUEBA 1 MERCURY
		  public void test() throws Exception { 
		  //if (leer.getCellValue(propiedades.getProperty("filePathExcel"), "Mercu", 1, 0).equals("Si")) {
			
			  
			//OBTENER EL NOMBRE DEL METODO A EJECUTAR
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			File rutaCarpeta = guru.crearCarpeta(propiedades, nomTest);
			// ASIGNAMOS LAS OPCIONES Y LA CONFIGURACION DEL NAVEGADOR A LA VARIABLE DRIVER
			//driver = guru.chomeDriverConnection();
			url = leer.getCellValue(propiedades.getProperty("filePathExcel"), "Mercu", 1, 0);
			//guru.(leer.getCellValue(propiedades.getProperty("filePathExcel"),"Mercu", 0, 0));
			//guru.urlAcceso(url);
			guru.urlAcceso(url);
			// ACCEDER AL METODO DE ABRIR PAGINA
			
			
			// ACCEDER AL METODO DE PRUEBA INICIAL
			//pagina.busquedaInicial(leer, propiedades, "Mercu", rutaCarpeta);
	        
			guru.Registro(leer, propiedades, "Mercu", rutaCarpeta);
	        widget.SeleccionarDate(leer, propiedades, nomTest, rutaCarpeta);
	        paginaAlert.busquedaAlert(leer, propiedades, "Mercu", rutaCarpeta);
			   
		  
		 }
		 
		@After

		public void cerrarNavegador()

		{
			//CERRAR EL PROCESO
			driver.quit();
		}
	}




