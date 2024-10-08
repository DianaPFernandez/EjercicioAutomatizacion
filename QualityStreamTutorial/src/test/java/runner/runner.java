package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "" // que escenarios ejecutar
)
        
public class runner {
	@AfterClass
	public static void cleanDriver(){
		BasePage.closeBrowser(); // cierra el browser despues de finalizar la ejecucion
	}

}
