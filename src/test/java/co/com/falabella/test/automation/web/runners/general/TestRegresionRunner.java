package co.com.falabella.test.automation.web.runners.general;


import co.com.falabella.test.automation.web.runners.RunnerConstants;
import co.com.falabella.test.automation.web.runners.javadoc.RunnersJavaDoc;
import co.com.falabella.test.automation.web.utils.GeneralUtil;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Para mas informacion:
 * @see RunnersJavaDoc#CLASE
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = RunnerConstants.PACKAGE_FEATURES,
        glue = {RunnerConstants.PACKAGE_STEP_DEFINITIONS,RunnerConstants.PACKAGE_DATA_DEFINITIONS,RunnerConstants.PACKAGE_SETUPS},
        tags = "@Regresion",
        dryRun = false
)
public class TestRegresionRunner
{
    /**
     * Para mas informacion:
     * @see RunnersJavaDoc#CONSTRUCTOR
     */
    private TestRegresionRunner()
    {
        GeneralUtil.noPermitaInstanciar();
    }
}
