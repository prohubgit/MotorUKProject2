package co.uk.motors.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    @Before
    public void setUp() {
        ///launchBrowser("Chrome");
    }

    @After
    public void tearDown() {
        //closeBrowser();
    }

}
