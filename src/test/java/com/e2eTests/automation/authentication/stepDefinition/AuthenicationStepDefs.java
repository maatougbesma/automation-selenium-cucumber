package com.e2eTests.automation.authentication.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.authentication.pageObjects.AuthenticationPage;
import com.e2eTests.automation.util.CommonMethods;
import com.e2eTests.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenicationStepDefs extends CommonMethods {

	public WebDriver driver;
	private AuthenticationPage authenticationPage = new AuthenticationPage();
	private CommonMethods commonMethods = new CommonMethods();

	public AuthenicationStepDefs() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthenticationPage.class);
	}

	@Given("^Je me connecte sur l'application OrangeHRM$")
	public void jeMeConnecteSurLApplicationOrangeHRM() throws Throwable {
		logger.info("Je me connecte sur l'application OrangeHRM");
		commonMethods.readFromFile("url");
	}

	@When("^Je saisie le Username \"([^\"]*)\"$")
	public void jeSaisieLeUsername(String name) throws Throwable {
		logger.info("Je saisie le Username");
		authenticationPage.fillUserName(name);
	}

	@When("^Je saisie le mot de passe \"([^\"]*)\"$")
	public void jeSaisieLeMotDePasse(String password) throws Throwable {
		logger.info("Je saisie le mot de passe");
		authenticationPage.fillPassword(password);
	}

	@When("^Je clique sur le bouton Login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
		logger.info("Je clique sur le bouton Login");
		authenticationPage.clickBtnLogin();
	}

	@Then("^Je me redirige vers la page Home \"([^\"]*)\"$")
	public void jeMeRedirigeVersLaPageHome(String text) throws Throwable {
		logger.info("Je me redirige vers la page Home");
		String messageToWelcome = AuthenticationPage.message.getText();
		Assert.assertTrue(messageToWelcome.contains(text));

	}

	/*
	 * Login with outline scenario
	 */
	@When("^Je saisie le username \"([^\"]*)\"$")
	public void jeSaisieUsername(String name) throws Throwable {
		authenticationPage.fillUserName(name);

	}

	@When("^Je saisie le password \"([^\"]*)\"$")
	public void jeSaisieLePassword(String password) throws Throwable {
		authenticationPage.fillPassword(password);
	}

}
