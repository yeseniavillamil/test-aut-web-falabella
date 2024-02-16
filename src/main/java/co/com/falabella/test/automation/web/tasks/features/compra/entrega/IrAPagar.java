package co.com.falabella.test.automation.web.tasks.features.compra.entrega;

import co.com.falabella.test.automation.web.constants.enums.configuracion.Esperas;
import co.com.falabella.test.automation.web.interactions.esperas.Esperar;
import co.com.falabella.test.automation.web.tasks.javadoc.TasksJavaDoc;
import co.com.falabella.test.automation.web.userinterfaces.features.compra.entrega.TipoEntregaUI;
import co.com.falabella.test.automation.web.utils.questions.estadoelementos.constants.enums.EstadoElemento;
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
public class IrAPagar implements Task
{

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
            Esperar.hastaQue(TipoEntregaUI.BTN_IR_A_PAGAR.getTarget())
                .este(EstadoElemento.VISIBLE)
                .porNoMasDe(Esperas.GENERAL.getTiempo()).segundos(),

            Click.on(TipoEntregaUI.BTN_IR_A_PAGAR.getTarget())
        );
    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#ENLACE
     */
    public static IrAPagar compra()
    {
        return Tasks.instrumented(
            IrAPagar.class
        );
    }
}
