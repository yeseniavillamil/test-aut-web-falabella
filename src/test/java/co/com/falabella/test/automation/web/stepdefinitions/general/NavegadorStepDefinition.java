package co.com.falabella.test.automation.web.stepdefinitions.general;


import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.stepdefinitions.javadoc.StepDefinitionsJavaDoc;
import co.com.falabella.test.automation.web.tasks.general.portal.EntrarAlPortal;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

/**
 * Para mas informacion:
 * @see StepDefinitionsJavaDoc#CLASE
 */
public class NavegadorStepDefinition {

    @Managed
    static WebDriver suNavegador;

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#DADO
     */
    @Dado("^que \"(.*)\" ingresó a su navegador.*")
    public static void dadoQueIngresoAlNavegador(String actor)
    {
        //OnStage.theActorCalled(actor)
        Protagonista.haActuadoPreviamente(actor);
        Protagonista.entraEnEscena(actor)
            .whoCan(BrowseTheWeb.with(suNavegador));
    }

    @Cuando("^ingresa al portal.*")
    public static void cuandoIngresaAlPortal ()
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            EntrarAlPortal.web()
        );
    }
}
