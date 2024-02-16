package co.com.falabella.test.automation.web.stepdefinitions.features.compra.carrito;

import co.com.falabella.test.automation.web.models.scena.Libreto;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.stepdefinitions.features.compra.unidad.UnidadCompraStepDefinition;
import co.com.falabella.test.automation.web.stepdefinitions.javadoc.StepDefinitionsJavaDoc;
import co.com.falabella.test.automation.web.tasks.features.compra.carrito.IniciaCompra;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

/**
 * Para mas informacion:
 * @see StepDefinitionsJavaDoc#CLASE
 */
public class CarritoCompraStepDefinition
{

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#DADO
     */
    @Dado("^que \"([^\"]*)\" se encuentra sobre el listado de articulos seleccionados.*")
    public static void dadoQueSeEncuentraSobreElListadoDeArticulosSeleccionados(String actor, Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_ESCENA_PREVIA_PANTALLA_ANTERIOR
         */
        UnidadCompraStepDefinition.dadoQueSeEncuentraEspecificandoLasUnidadesDeCompra(actor,libreto);
        UnidadCompraStepDefinition.cuandoSeDirigeAlCarrito();
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^inicia con el proceso de compra.*")
    public static void cuandoIniciaConElProcesoDeCompra()
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            IniciaCompra.desdeElCarrito()
        );
    }


}
