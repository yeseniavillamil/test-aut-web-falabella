package co.com.falabella.test.automation.web.stepdefinitions.features.portal;

import co.com.falabella.test.automation.web.models.scena.Libreto;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.stepdefinitions.general.NavegadorStepDefinition;
import co.com.falabella.test.automation.web.stepdefinitions.javadoc.StepDefinitionsJavaDoc;
import co.com.falabella.test.automation.web.tasks.features.portal.ofertas.ConfirmarMejoresOfertas;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

/**
 * Para mas informacion:
 * @see StepDefinitionsJavaDoc#CLASE
 */
public class PortalStepDefinition
{

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#DADO
     */
    @Dado("^que \"([^\"]*)\" se encuentra sobre el portal.*")
    public static void dadoQueSeEncuentraSobreElPortal(String actor)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_ESCENA_PREVIA_PANTALLA_ANTERIOR
         */
        NavegadorStepDefinition.dadoQueIngresoAlNavegador(actor);
        NavegadorStepDefinition.cuandoIngresaAlPortal();
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^confirma la notificacion de mejores ofertas.*")
    public static void cuandoConfirmaLaNotificacionDeMejoresOfertas(Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            ConfirmarMejoresOfertas.sugeridas(libreto.getParametrosOfertas())
        );
    }


}
