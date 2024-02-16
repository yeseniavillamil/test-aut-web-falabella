package co.com.falabella.test.automation.web.setups.hooks.production;


import net.serenitybdd.core.webdriver.enhancers.BeforeAWebdriverScenario;
import net.thucydides.core.webdriver.SupportedWebDriver;
import net.thucydides.model.domain.TestOutcome;
import net.thucydides.model.util.EnvironmentVariables;
import org.openqa.selenium.MutableCapabilities;

import java.util.Map;

public class Luces implements BeforeAWebdriverScenario {

    @Override
    public boolean isActivated(EnvironmentVariables environmentVariables) {
        return BeforeAWebdriverScenario.super.isActivated(environmentVariables);
    }

    @Override
    public MutableCapabilities apply(EnvironmentVariables environmentVariables, SupportedWebDriver driver, TestOutcome testOutcome, MutableCapabilities capabilities)
    {
        System.err.println("------ CAPABILITIES ------ ");
        for (Map.Entry<String, Object> entry : capabilities.asMap().entrySet()) {
            System.err.println(entry.getKey() + " : " + entry.getValue().toString());
        }

        return capabilities;
    }

}


