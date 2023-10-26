package co.uk.motors.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MotorsHomePae extends BasePage{


    public MotorsHomePae(WebDriver driver) {
        this.driver = driver;
        // adding PageFactory
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "gdpr-consent-notice")
    private WebElement cookiesAlertyMessage;
    @FindBy(css = "#save > span.mat-button-wrapper > div > span")
    //variable for AcceptButton on Iframe
    private WebElement AcceptAllCookiesButton;

    // using @FindBy()
    // handle dynamic webElement 'id' using contain function
    @FindBy(css = "input[id*='downshift-']")
    // variable for lacationField
    private WebElement locationField;


    @FindBy (css = "div._19tdmcrk._19tdmcrm > button > div > div:nth-child(2)")
    private WebElement searchButton;






    //#######################################################################################################
    // Method for Alert message on HomePage
// #######################################################################################################
    public void managePrivacy() {
        // driver must switch to ifram to access the Frame and in .frame() pass the css Argument in double qoutes
        //    driver.switchTo().frame("gdpr-consent-notice");
        driver.switchTo().frame(cookiesAlertyMessage);
        AcceptAllCookiesButton.click();
    }

    //#######################################################################################################
    //Method declaration for Enter Location field on HomePage
//#######################################################################################################
    public void enterLocation(String location) {
        // clearing the location field
        locationField.clear();
        locationField.sendKeys(location);
    }
//###############################################################################
    //Concept of Try and Catch
// ###########################################################################


    //public void confirmClaimsTabAvailablility() throws IOException {
    //   boolean elmDoesNotExists = false;
    // try{
    //      claimsPage.isDisplayed();
    //}
    //catch (NoSuchElementException exception){
    //  elmDoesNotExists = true;
    // }
    //Assert.assertEquals(elmDoesNotExists, true);
    // }


    public CarSearchResultPage clickOnSearchButton(){
        searchButton.click();
        return new CarSearchResultPage(driver);
    }





}
