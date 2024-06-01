package turkcell_pasaj.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import turkcell_pasaj.utilities.Driver;
import static turkcell_pasaj.utilities.ReusableMethods.bekle;


public class Hooks {


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
           TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/jpeg", "scenario_" + scenario.getName());
        }
        bekle(5);
        //Driver.closeDriver();


    }
}
