package co.com.falabella.test.automation.web.runners;

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
    features = RunnerConstants.PACKAGE_FEATURES+"/{{ruta/especifica/sobre/directorio/feature}}/{{funcionalidad}}.feature",
    glue = {RunnerConstants.PACKAGE_STEP_DEFINITIONS,RunnerConstants.PACKAGE_SETUPS},
    tags = "@{{Funcionalidad}} ¿{{and|or @{{TagEspecifico}}}}?",
    dryRun = true //Desactive, despues de comprobar la existencia/relacion entre enunciado gherkin y StepDefinition
)
public class TestPlantillaRunner
{
    /**
     * Para mas informacion:
     * @see RunnersJavaDoc#CONSTRUCTOR
     */
    private TestPlantillaRunner()
    {
        GeneralUtil.noPermitaInstanciar();
    }
}
