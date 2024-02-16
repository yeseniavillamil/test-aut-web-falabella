package co.com.falabella.test.automation.web.tasks.features.portal.ofertas;

import co.com.falabella.test.automation.web.models.params.features.portal.ofertas.OfertasParams;
import co.com.falabella.test.automation.web.tasks.javadoc.TasksJavaDoc;
import co.com.falabella.test.automation.web.userinterfaces.features.portal.ofertas.OfertasUI;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

/**
 * Para mas informacion:
 * @see TasksJavaDoc#CLASE
 */
@AllArgsConstructor
public class ConfirmarMejoresOfertas implements Task
{
    private OfertasParams parametros;

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
            Check.whether(this.parametros.isConfirma())
                .andIfSo(
                    Click.on(OfertasUI.BTN_SI_AMO_LAS_OFERTAS.getTarget()),
                    Click.on(OfertasUI.BTN_CERRAR_CONFIRMACION_RECIBIDO.getTarget())
                ).otherwise(
                    Click.on(OfertasUI.BTN_NO_GRACIAS.getTarget())
                )
        );
    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#ENLACE
     */
    public static ConfirmarMejoresOfertas sugeridas(OfertasParams parametros)
    {
        return Tasks.instrumented(
            ConfirmarMejoresOfertas.class,
               parametros
        );
    }
}
