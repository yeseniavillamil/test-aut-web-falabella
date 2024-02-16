package co.com.falabella.test.automation.web.stepdefinitions.features.compra.entrega;

import co.com.falabella.test.automation.web.models.scena.Libreto;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.stepdefinitions.features.compra.carrito.CarritoCompraStepDefinition;
import co.com.falabella.test.automation.web.stepdefinitions.javadoc.StepDefinitionsJavaDoc;
import co.com.falabella.test.automation.web.tasks.features.compra.entrega.contacto.ConfirmaDatosContacto;
import co.com.falabella.test.automation.web.tasks.features.compra.entrega.contacto.DiligenciaDatosContacto;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

/**
 * Para mas informacion:
 * @see StepDefinitionsJavaDoc#CLASE
 */
public class ContactoEntregaStepDefinition
{

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#DADO
     */
    @Dado("^que \"([^\"]*)\" se encuentra especificando su información de contacto.*")
    public static void dadoQueSeEncuentraEspecificandoSuInformacionDeContacto(String actor, Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_ESCENA_PREVIA_PANTALLA_ANTERIOR
         */
        CarritoCompraStepDefinition.dadoQueSeEncuentraSobreElListadoDeArticulosSeleccionados(actor,libreto);
        CarritoCompraStepDefinition.cuandoIniciaConElProcesoDeCompra();
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^diligencia su información de contacto.*")
    public static void cuandoDiligenciaSuInformacionDeContacto(Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            DiligenciaDatosContacto.cliente(libreto.getParametrosContactoEntrega())
        );
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^confirma su información de contacto.*")
    public static void cuandoConfirmaSuInformacionDeContacto(Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            ConfirmaDatosContacto.cliente(libreto.getParametrosContactoEntrega())
        );
    }


}
