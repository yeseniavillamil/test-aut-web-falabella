package co.com.falabella.test.automation.web.stepdefinitions.features.compra.unidad;

import co.com.falabella.test.automation.web.models.scena.Libreto;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.stepdefinitions.features.portal.buscador.ResultadosStepDefinition;
import co.com.falabella.test.automation.web.stepdefinitions.javadoc.StepDefinitionsJavaDoc;
import co.com.falabella.test.automation.web.tasks.features.compra.unidad.IrAlCarrito;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

/**
 * Para mas informacion:
 * @see StepDefinitionsJavaDoc#CLASE
 */
public class UnidadCompraStepDefinition
{

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#DADO
     */
    @Dado("^que \"([^\"]*)\" se encuentra especificando las unidades de compra.*")
    public static void dadoQueSeEncuentraEspecificandoLasUnidadesDeCompra(String actor, Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_ESCENA_PREVIA_PANTALLA_ANTERIOR
         */
        ResultadosStepDefinition.dadoQueSeEncuentraSobreElListadoDeProductosEncontrados(actor,libreto);
        ResultadosStepDefinition.cuandoAgregaElArticuloAlCarrito(libreto);
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^se dirige al carrito.*")
    public static void cuandoSeDirigeAlCarrito()
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            IrAlCarrito.deCompra()
        );
    }


}
