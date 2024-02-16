package co.com.falabella.test.automation.web.tasks.features.compra.entrega.domicilio;

import co.com.falabella.test.automation.web.constants.enums.configuracion.Esperas;
import co.com.falabella.test.automation.web.interactions.esperas.Esperar;
import co.com.falabella.test.automation.web.models.params.features.compra.entrega.DomicilioEntregaParams;
import co.com.falabella.test.automation.web.tasks.javadoc.TasksJavaDoc;
import co.com.falabella.test.automation.web.userinterfaces.features.compra.entrega.DomicilioEntregaUI;
import co.com.falabella.test.automation.web.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;

/**
 * Para mas informacion:
 * @see TasksJavaDoc#CLASE
 */
@AllArgsConstructor
public class ConfirmaDatosDomicilio implements Task
{

    private DomicilioEntregaParams parametros;

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
            DiligenciaDatosDomicilio.entrega(this.parametros),

            DoubleClick.on(DomicilioEntregaUI.BTN_CONFIRMAR_DIRECCION.getTarget()),

            Esperar.hastaQue(DomicilioEntregaUI.BTN_CONFIRMAR_Y_GUARDAR.getTarget())
                    .este(EstadoElemento.VISIBLE).porNoMasDe(Esperas.GENERAL.getTiempo()).segundos(),

            Click.on(DomicilioEntregaUI.BTN_CONFIRMAR_Y_GUARDAR.getTarget())
        );
    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#ENLACE
     */
    public static ConfirmaDatosDomicilio entrega(DomicilioEntregaParams parametros)
    {
        return Tasks.instrumented(
            ConfirmaDatosDomicilio.class,
            parametros
        );
    }
}
