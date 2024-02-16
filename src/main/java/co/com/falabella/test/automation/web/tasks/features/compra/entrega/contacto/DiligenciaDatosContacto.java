package co.com.falabella.test.automation.web.tasks.features.compra.entrega.contacto;

import co.com.falabella.test.automation.web.constants.enums.configuracion.Esperas;
import co.com.falabella.test.automation.web.interactions.esperas.Esperar;
import co.com.falabella.test.automation.web.models.params.features.compra.entrega.ContactoEntregaParams;
import co.com.falabella.test.automation.web.tasks.javadoc.TasksJavaDoc;
import co.com.falabella.test.automation.web.userinterfaces.features.compra.entrega.ContactoEntregaUI;
import co.com.falabella.test.automation.web.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

/**
 * Para mas informacion:
 * @see TasksJavaDoc#CLASE
 */
@AllArgsConstructor
public class DiligenciaDatosContacto implements Task
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
            Esperar.hastaQue(ContactoEntregaUI.TXT_CORREO.getTarget())
                .este(EstadoElemento.VISIBLE)
                .porNoMasDe(Esperas.GENERAL.getTiempo()).segundos(),

            Enter.theValue(this.parametros.getCorreo())
                .into(ContactoEntregaUI.TXT_CORREO.getTarget())
        );
    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#ENLACE
     */
    public static DiligenciaDatosContacto cliente(ContactoEntregaParams parametros)
    {
        return Tasks.instrumented(
            DiligenciaDatosContacto.class,
            parametros
        );
    }
}
