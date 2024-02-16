package co.com.falabella.test.automation.web.stepdefinitions.features.compra.entrega;

import co.com.falabella.test.automation.web.models.scena.Libreto;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.stepdefinitions.javadoc.StepDefinitionsJavaDoc;
import co.com.falabella.test.automation.web.tasks.features.compra.entrega.IrAPagar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

/**
 * Para mas informacion:
 * @see StepDefinitionsJavaDoc#CLASE
 */
public class TipoEntregaStepDefinition
{

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#DADO
     */
    @Dado("^que \"([^\"]*)\" se encuentra finalizando el proceso de entrega.*")
    public static void dadoQueSeEncuentraFinalizandoElProcesoDeEntrega(String actor, Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_ESCENA_PREVIA_PANTALLA_ANTERIOR
         */
        DomicilioEntregaStepDefinition.dadoQueSeEncuentraEspecificandoSuInformacionDeDomicilio(actor,libreto);
        DomicilioEntregaStepDefinition.cuandoConfirmaSuInformacionDeDomicilio(libreto);
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^completa el proceso de entrega.*")
    public static void cuandoCompletaElProcesoDeEntrega()
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            IrAPagar.compra()
        );
    }


}
