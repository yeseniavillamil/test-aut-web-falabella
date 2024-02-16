package co.com.falabella.test.automation.web.stepdefinitions.features.portal.buscador;

import co.com.falabella.test.automation.web.models.scena.Libreto;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.stepdefinitions.javadoc.StepDefinitionsJavaDoc;
import co.com.falabella.test.automation.web.tasks.features.portal.buscador.AgregarAlCarrito;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

/**
 * Para mas informacion:
 * @see StepDefinitionsJavaDoc#CLASE
 */
public class ResultadosStepDefinition
{

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#DADO
     */
    @Dado("^que \"([^\"]*)\" se encuentra sobre el listado de productos encontrados.*")
    public static void dadoQueSeEncuentraSobreElListadoDeProductosEncontrados(String actor, Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_ESCENA_PREVIA_PANTALLA_ANTERIOR
         */
        BuscadorStepDefinition.dadoQueSeEncuentraSobreElBuscadorDeProductos(actor,libreto);
        BuscadorStepDefinition.cuandoRealizaLaConsultaDelProducto(libreto);
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^agrega el articulo al carrito.*")
    public static void cuandoAgregaElArticuloAlCarrito(Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            AgregarAlCarrito.deCompra(libreto.getParametrosResultado())
        );
    }


}
