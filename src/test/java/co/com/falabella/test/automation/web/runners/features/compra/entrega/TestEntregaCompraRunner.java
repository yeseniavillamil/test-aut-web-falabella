package co.com.falabella.test.automation.web.runners.features.compra.entrega;

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
    features = RunnerConstants.PACKAGE_FEATURES+"/compra/entrega/entrega_compra.feature",
    glue = {RunnerConstants.PACKAGE_STEP_DEFINITIONS,RunnerConstants.PACKAGE_SETUPS},
    tags = "@EntregaCompra and @Regresion",
    dryRun = false //Desactive, despues de comprobar la existencia/relacion entre enunciado gherkin y StepDefinition
)
public class TestEntregaCompraRunner
{
    /**
     * Para mas informacion:
     * @see RunnersJavaDoc#CONSTRUCTOR
     */
    private TestEntregaCompraRunner()
    {
        GeneralUtil.noPermitaInstanciar();
    }
}
