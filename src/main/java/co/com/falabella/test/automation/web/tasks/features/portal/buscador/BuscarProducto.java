package co.com.falabella.test.automation.web.tasks.features.portal.buscador;

import co.com.falabella.test.automation.web.constants.enums.configuracion.Esperas;
import co.com.falabella.test.automation.web.interactions.esperas.Detener;
import co.com.falabella.test.automation.web.interactions.esperas.Esperar;
import co.com.falabella.test.automation.web.models.params.features.portal.buscador.BuscadorParams;
import co.com.falabella.test.automation.web.tasks.javadoc.TasksJavaDoc;
import co.com.falabella.test.automation.web.userinterfaces.features.portal.buscador.BuscadorUI;
import co.com.falabella.test.automation.web.userinterfaces.features.portal.buscador.ResultadoUI;
import co.com.falabella.test.automation.web.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Visibility;

/**
 * Para mas informacion:
 * @see TasksJavaDoc#CLASE
 */
@AllArgsConstructor
public class BuscarProducto implements Task
{
    private BuscadorParams parametros;

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#PERFORM_AS
     */
    @Override
    public <T extends Actor> void performAs(T actor)
    {
        /**
         * Para mas informacion:
         * @see TasksJavaDoc#ENLAZAR_ACCIONES
         */
        actor.attemptsTo(
            Enter.keyValues(this.parametros.getProducto())
                .into(BuscadorUI.TXT_BUSCAR.getTarget()),

            Check.whether(this.parametros.getResultado()==null || this.parametros.getResultado().trim().isEmpty())
                .andIfSo(
                    Click.on(BuscadorUI.BTN_BUSCAR.getTarget())
                ).otherwise(
                    Esperar.hastaQue(BuscadorUI.LNK_RESULTADO.getTarget(this.parametros.getResultado()))
                            .este(EstadoElemento.VISIBLE)
                                .porNoMasDe(Esperas.GENERAL.getTiempo()).segundos(),

                    Click.on(BuscadorUI.LNK_RESULTADO.getTarget(this.parametros.getResultado()))
                )
        );

        this.validaReintentoBusqueda(actor);

    }

    private <T extends Actor> void validaReintentoBusqueda(T actor)
    {
        for(int i=0;i<2;i++){
            if(actor.asksFor(Visibility.of(ResultadoUI.BTN_SIGUIENTE_PAGINA.getTarget()))){
                break;
            }else{
                actor.attemptsTo(
                    Click.on(BuscadorUI.BTN_BUSCAR.getTarget())
                        .then(Detener.por(2).segundos())
                );
            }
        }
    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#ENLACE
     */
    public static BuscarProducto desdeElPortal(BuscadorParams parametros)
    {
        return Tasks.instrumented(
            BuscarProducto.class,
               parametros
        );
    }
}
