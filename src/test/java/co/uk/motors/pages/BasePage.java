package co.uk.motors.pages;

import co.uk.motors.common.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends Driver {


    public String BASE_URL = "https://www.zoopla.co.uk/";
    // Declaring Select variable;
    public Select select;

    public void launchUrl(){
        driver.navigate().to(BASE_URL);

    }
    //Define method to select by visible text
    public void selectByText(WebElement element, String text){
        select = new Select(element);
        select.selectByVisibleText(text);

    }//Define method to select by Vale
    public void selectByValue(WebElement element, String value){
        select = new Select(element);
        select.selectByValue(value);

    }//Define method to select by index
    public void selectByIndex(WebElement element, int index){
        select = new Select(element);
        select.selectByIndex(index);

    }

}
