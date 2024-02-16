package co.com.falabella.test.automation.web.stepdefinitions.features.portal.buscador;

import co.com.falabella.test.automation.web.models.scena.Libreto;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.stepdefinitions.features.portal.PortalStepDefinition;
import co.com.falabella.test.automation.web.stepdefinitions.javadoc.StepDefinitionsJavaDoc;
import co.com.falabella.test.automation.web.tasks.features.portal.buscador.BuscarProducto;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

/**
 * Para mas informacion:
 * @see StepDefinitionsJavaDoc#CLASE
 */
public class BuscadorStepDefinition
{

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#DADO
     */
    @Dado("^que \"([^\"]*)\" se encuentra sobre el buscador de productos.*")
    public static void dadoQueSeEncuentraSobreElBuscadorDeProductos(String actor, Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_ESCENA_PREVIA_PANTALLA_ANTERIOR
         */
        PortalStepDefinition.dadoQueSeEncuentraSobreElPortal(actor);
        PortalStepDefinition.cuandoConfirmaLaNotificacionDeMejoresOfertas(libreto);
    }

    /**
     * Para mas informacion:
     * @see StepDefinitionsJavaDoc#CUANDO
     */
    @Cuando("^realiza la consulta del producto.*")
    public static void cuandoRealizaLaConsultaDelProducto(Libreto libreto)
    {
        /**
         * @see StepDefinitionsJavaDoc#ENLAZAR_TAREAS
         */
        Protagonista.enEscena().attemptsTo(
            BuscarProducto.desdeElPortal(libreto.getParametrosBuscador())
        );
    }


}
