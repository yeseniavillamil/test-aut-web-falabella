package co.com.falabella.test.automation.web.stepdefinitions.features.compra.entrega;

import co.com.falabella.test.automation.web.models.scena.Libreto;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.stepdefinitions.javadoc.StepDefinitionsJavaDoc;
import co.com.falabella.test.automation.web.tasks.features.compra.entrega.domicilio.ConfirmaDatosDomicilio;
import co.com.falabella.test.automation.web.tasks.features.compra.entrega.domicilio.DiligenciaDatosDomicilio;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

/**
 * Para mas informacion:
 * @see StepDefinitionsJavaDoc#CLASE
 */
public class DomicilioEntregaStepDefinition
{

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#DADO
     */
    @Dado("^que \"([^\"]*)\" se encuentra especificando sus información de domicilio.*")
    public static void dadoQueSeEncuentraEspecificandoSuInformacionDeDomicilio(String actor, Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_ESCENA_PREVIA_PANTALLA_ANTERIOR
         */
        ContactoEntregaStepDefinition.dadoQueSeEncuentraEspecificandoSuInformacionDeContacto(actor,libreto);
        ContactoEntregaStepDefinition.cuandoConfirmaSuInformacionDeContacto(libreto);
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^diligencia su información de domicilio.*")
    public static void cuandoDiligenciaSuInformacionDeDomicilio(Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            DiligenciaDatosDomicilio.entrega(libreto.getParametrosDomicilioEntrega())
        );
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^confirma su información de domicilio.*")
    public static void cuandoConfirmaSuInformacionDeDomicilio(Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            ConfirmaDatosDomicilio.entrega(libreto.getParametrosDomicilioEntrega())
        );
    }


}
