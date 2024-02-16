package co.com.falabella.test.automation.web.tasks.features.compra.entrega.contacto;

import co.com.falabella.test.automation.web.models.params.features.compra.entrega.ContactoEntregaParams;
import co.com.falabella.test.automation.web.tasks.javadoc.TasksJavaDoc;
import co.com.falabella.test.automation.web.userinterfaces.features.compra.entrega.DomicilioEntregaUI;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

/**
 * Para mas informacion:
 * @see TasksJavaDoc#CLASE
 */
@AllArgsConstructor
public class ConfirmaDatosContacto implements Task
{

    private ContactoEntregaParams parametros;

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
            DiligenciaDatosContacto.cliente(this.parametros),

            Click.on(DomicilioEntregaUI.BTN_CONTINUAR.getTarget())
        );
    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#ENLACE
     */
    public static ConfirmaDatosContacto cliente(ContactoEntregaParams parametros)
    {
        return Tasks.instrumented(
            ConfirmaDatosContacto.class,
            parametros
        );
    }
}
