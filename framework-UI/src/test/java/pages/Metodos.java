package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Metodos {

	WebDriver Driver;

	public void abrirNavegador(String appUrl, String DescricaoPasso) {

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.get(appUrl);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		Driver = new ChromeDriver( options );
		
	
	}
	
	public void escrever(String texto, By elemento) {
		
		Driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void submit(By elemento) {
		
		Driver.findElement(elemento).submit();
		
	}
	
	
	
	
	
	
	
	
	

	public void fecharNavegador(String descricaoPasso) {

		Driver.quit();{
			
	
		}

	}

}
