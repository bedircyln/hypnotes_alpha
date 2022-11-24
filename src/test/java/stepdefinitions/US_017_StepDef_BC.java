package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_017_StepDef_BC {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @Given("User goes to homepage")
    public void user_goes_to_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("Use is on Homepage")
    public void use_is_on_homepage() {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigurationReader.getProperty("url");
        Assert.assertEquals(currentUrl,expectedUrl);
    }
    @When("User clicks the Sign Up button")
    public void user_clicks_the_sign_up_button() {
        homePage.signUpButton.click();
        
    }
    @When("User clicks the Therapist button")
    public void user_clicks_the_therapist_button() {
        homePage.therapistSignUpButton.click();
        
    }
    @Then("Assert user on register page")
    public void assert_user_on_register_page() {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigurationReader.getProperty("registerPageUrl");
        Assert.assertEquals(currentUrl,expectedUrl);
    }
    @Then("Therapist button should be selected")
    public void therapist_button_should_be_selected() {

        
    }



}
