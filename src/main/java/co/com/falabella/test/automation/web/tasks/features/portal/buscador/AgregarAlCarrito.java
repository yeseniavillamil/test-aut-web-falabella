package co.com.falabella.test.automation.web.tasks.features.portal.buscador;

import co.com.falabella.test.automation.web.models.params.features.portal.buscador.ResultadoParams;
import co.com.falabella.test.automation.web.tasks.javadoc.TasksJavaDoc;
import co.com.falabella.test.automation.web.userinterfaces.features.portal.buscador.ResultadoUI;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Absence;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Para mas informacion:
 * @see TasksJavaDoc#CLASE
 */
@AllArgsConstructor
public class AgregarAlCarrito implements Task
{
    private ResultadoParams parametros;

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

        Target articulo = ResultadoUI.LNK_ARTICULO.getTarget(this.parametros.getNombreArticulo());
        Target siguientePag = ResultadoUI.BTN_SIGUIENTE_PAGINA.getTarget();
        boolean encontrado = true;

        while(actor.asksFor(Absence.of(articulo)).booleanValue()) {
            if(actor.asksFor(Enabled.of(siguientePag)).booleanValue())
            {
                actor.attemptsTo(
                    Click.on(siguientePag)
                );
            }else{
                encontrado = false;
                break;
            }
        }

        if(encontrado)
        {
            actor.attemptsTo(
                Scroll.to(articulo),

                MoveMouse.to(articulo)
                    .then(
                        Click.on(
                            ResultadoUI.BTN_AGREGAR_CARRO.getTarget(this.parametros.getNombreArticulo())
                        )
                    )
            );
        }

    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#ENLACE
     */
    public static AgregarAlCarrito deCompra(ResultadoParams parametros)
    {
        return Tasks.instrumented(
            AgregarAlCarrito.class,
               parametros
        );
    }
}
