package steps;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps {
	
	GooglePage google = new GooglePage();
	
	@Given("^abrir el navegador$")
	public void navigateToGoogle(){
		google.navigateToGoogle();
		
	}
	
	@When("^seleccionar el boton registrar$")
	public void enterSearchCriteria(){
		google.enterSearchCriteria("Admin");
		google.testlastName("admin123");
		google.clickLocation();
//		google.clickGoogleSearch();
	}
	
	@And("^ingresar formulario$")
	public void clickSearchButton(){
		google.clickRecruitment();
		google.clickLastStep();
		google.enterSearchName("Diana");
		google.testMiddle("Fernandez");
		google.testLastname("Arias");
		google.selectVacancy();
		google.testTypeEmail("Prueba@gmail.com");
		google.testTypeNumber("1234567");
		//google.File();
		
		google.testTypeKeywords("Prueba nueva");
		google.testTypeNotes("prueba nueva");
		
		google.checkBox();
		google.clickLastSave();
				
		
	}
	@Then("^guardar informacion$")
	public void clickButtonSave(){
		google.clickLastSave();
		google.testTextArea("Prueba");
		google.SaveShortlist();
		google.ScheduleInterview();
		google.InterviewTitle("Prueba");
				
	}
	
}
