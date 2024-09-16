package pages;

import java.awt.List;
import java.io.File;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage extends BasePage {
	
	private String searchButton = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button";
	private String testFirstName = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input";
	private String testlastName = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input";
	private String buttonRecruitment = "//div[@class='oxd-sidepanel-body']/ul[@class='oxd-main-menu']/li[5]//span[contains(text(),'')]"; 
	private String titleStep3 = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(2) > div > div > div > div:nth-child(2) > div > div";
	private String buttonApp = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button";
	private String testFirst = "//input[@name='firstName']";
	private String testMiddle = "//input[@name='middleName']";
	private String testLastname = "//input[@name='lastName']";
	private String selectText = "div[class='oxd-select-wrapper']";
	private String selectOption = "div.oxd-select-dropdown";
	private String testTypeEmail = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input[1]";
	private String testTypeNumber = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input[1]";
	//private String textFile = "//div[@class='oxd-file-button']";
	
	private String testTypeKeywords = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input";
	private String testTypeNotes = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea";
//private String checkBox = "//input[@type='checkbox']";
	
	private String buttonSave = "div.oxd-form-actions button.oxd-button:nth-child(3)";
	private String buttonShortlist = "div.orangehrm-recruitment div.orangehrm-recruitment-actions button.oxd-button:nth-child(2)";
	                                 
	private String title = "//label[contains(text(),'Hiring Manager')]";
	private String testTextArea = "textarea.oxd-textarea";
	private String SaveShortlist = "//*[@id=app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]";
	private String ScheduleInterview = "//*[@id='app']/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]";
	private String InterviewTitle = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input";
	private String textInterviewer = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div/input";
	
	
	
	
	
	Actions act = new Actions(driver);
	
	public GooglePage (){
		super(driver);
	}
	
	public void navigateToGoogle(){
		navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	/*
	public String Title(){
		return textFromElement(title);
	}*/
	
	public void enterSearchCriteria(String criteria){
		write(testFirstName, criteria);
	}
	
	public void testlastName(String criteria){
		write(testlastName, criteria);
	}

	public void clickLocation(){
		try {     Thread.sleep(5000);
		// Espera 5 segundos (el tiempo está en milisegundos)
		} catch (InterruptedException e) {     e.printStackTrace(); }
		clickElement(searchButton);
	}
	
	public void clickRecruitment(){
		try {     Thread.sleep(7000);
		// Espera 5 segundos (el tiempo está en milisegundos)
		} catch (InterruptedException e) {     e.printStackTrace(); }
		clickElement(buttonRecruitment);
	}
	public void clickLastStep(){
		try {     Thread.sleep(5000);
		// Espera 5 segundos (el tiempo está en milisegundos)
		} catch (InterruptedException e) {     e.printStackTrace(); }
		clickElement(buttonApp);
	}
	
	public void enterSearchName(String criteria){
		write(testFirst, criteria);
	}
	
	public void testMiddle(String criteria){
		write(testMiddle, criteria);
	}
	public void testLastname(String criteria){
		write(testLastname, criteria);
	}

	public void selectVacancy(){
		try {     Thread.sleep(5000);
		// Espera 5 segundos (el tiempo está en milisegundos)
		} catch (InterruptedException e) {     e.printStackTrace(); }
		driver.findElement(By.cssSelector(selectText)).click();
		driver.findElement(By.cssSelector(selectOption)).click();
	}
	

	public void testTypeEmail(String criteria){	
			write(testTypeEmail, criteria);
	}

	public void testTypeNumber(String criteria){	
			write(testTypeNumber, criteria);
	}
		
/*	public void File(){
		try {     Thread.sleep(5000);
		// Espera 5 segundos (el tiempo está en milisegundos)
		} catch (InterruptedException e) {     e.printStackTrace(); }	    
	    WebElement chooseFile = driver.findElement(By.xpath("//div[@class='oxd-file-input-div']"));
	    chooseFile.sendKeys("C:\\Users\\dfernandez\\Desktop\\automatizacion\\RetoTécnicoAnalistapruebasgeneralistaconautomatización.pdf");
	}
	*/
	
	public void testTypeKeywords(String criteria){	
		write(testTypeKeywords, criteria);
	}
	
	public void testTypeNotes(String criteria){	
		write(testTypeNotes, criteria);
	
	}
	
	public void checkBox(){
		try {     Thread.sleep(5000);
		// Espera 5 segundos (el tiempo está en milisegundos)
		} catch (InterruptedException e) {     e.printStackTrace(); }
		driver.findElement(By.cssSelector("i.oxd-checkbox-input-icon")).click();
		//clickElement(checkBox);
	}

	public void clickLastSave(){
		try {     Thread.sleep(5000);
		// Espera 5 segundos (el tiempo está en milisegundos)
		} catch (InterruptedException e) {     e.printStackTrace(); }
		driver.findElement(By.cssSelector(buttonSave)).click();
	}
		
	public void buttonShortlist(){
		try {     Thread.sleep(5000);
		// Espera 5 segundos (el tiempo está en milisegundos)
		} catch (InterruptedException e) {     e.printStackTrace(); }
		driver.findElement(By.cssSelector(buttonShortlist)).click();
	}
	
	public void testTextArea(String criteria){	
		write(testTextArea, criteria);
	
	}
	
	public void SaveShortlist(){
		try {     Thread.sleep(5000);
		// Espera 5 segundos (el tiempo está en milisegundos)
		} catch (InterruptedException e) {     e.printStackTrace(); }
		clickElement(SaveShortlist);
	}
	
	public void ScheduleInterview(){
		try {     Thread.sleep(5000);
		// Espera 5 segundos (el tiempo está en milisegundos)
		} catch (InterruptedException e) {     e.printStackTrace(); }
		clickElement(ScheduleInterview);
	}

	public void InterviewTitle(String criteria){	
		write(InterviewTitle, criteria);
	
	}
	
	public void textInterviewer(String criteria){	
		write(textInterviewer, criteria);
	
	}
}
