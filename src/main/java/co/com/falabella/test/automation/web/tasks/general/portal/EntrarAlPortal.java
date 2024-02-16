package co.com.falabella.test.automation.web.tasks.general.portal;

import co.com.falabella.test.automation.web.constants.enums.configuracion.serenity.SerenityConf;
import co.com.falabella.test.automation.web.interactions.ventana.Navegar;
import co.com.falabella.test.automation.web.tasks.javadoc.TasksJavaDoc;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

/**
 * Para mas informacion:
 * @see TasksJavaDoc#CLASE
 */
@AllArgsConstructor
public class EntrarAlPortal implements Task {

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
            Navegar.hacia(SerenityConf.URL_BASE.getValor())
        );
    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#ENLACE
     */
    public static EntrarAlPortal web()
    {
       return Tasks.instrumented(
               EntrarAlPortal.class
       );
    }
}
