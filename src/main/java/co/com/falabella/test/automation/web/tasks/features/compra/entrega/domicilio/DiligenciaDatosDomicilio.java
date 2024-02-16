package co.com.falabella.test.automation.web.tasks.features.compra.entrega.domicilio;

import co.com.falabella.test.automation.web.models.params.features.compra.entrega.DomicilioEntregaParams;
import co.com.falabella.test.automation.web.tasks.javadoc.TasksJavaDoc;
import co.com.falabella.test.automation.web.userinterfaces.features.compra.entrega.DomicilioEntregaUI;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

/**
 * Para mas informacion:
 * @see TasksJavaDoc#CLASE
 */
@AllArgsConstructor
public class DiligenciaDatosDomicilio implements Task
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

            Check.whether(this.parametros.getDepartamento()!=null && !this.parametros.getDepartamento().trim().isEmpty())
                    .andIfSo(
                        Click.on(DomicilioEntregaUI.BTN_DEPARTAMENTOS.getTarget())
                            .then(
                                Click.on(DomicilioEntregaUI.BTN_ITM_UBICACION.getTarget(this.parametros.getDepartamento()))
                            )
                    ),

            Check.whether(this.parametros.getCiudad()!=null && !this.parametros.getCiudad().trim().isEmpty())
                .andIfSo(
                    Click.on(DomicilioEntregaUI.BTN_CIUDADES.getTarget())
                        .then(
                            Click.on(DomicilioEntregaUI.BTN_ITM_UBICACION.getTarget(this.parametros.getCiudad()))
                        )
                ),

            Check.whether(this.parametros.getBarrio()!=null && !this.parametros.getBarrio().trim().isEmpty())
                .andIfSo(
                    Click.on(DomicilioEntregaUI.BTN_BARRIOS.getTarget())
                        .then(
                            Click.on(DomicilioEntregaUI.BTN_ITM_UBICACION.getTarget(this.parametros.getBarrio()))
                        )
                ),

            Enter.theValue(this.parametros.getDireccion())
                .into(DomicilioEntregaUI.TXT_DIRECCION.getTarget()),

            Enter.theValue(this.parametros.getAdicional())
                .into(DomicilioEntregaUI.TXT_ADICIONAL.getTarget())
        );
    }

    /**
     * Para mas informacion:
     * @see TasksJavaDoc#ENLACE
     */
    public static DiligenciaDatosDomicilio entrega(DomicilioEntregaParams parametros)
    {
        return Tasks.instrumented(
            DiligenciaDatosDomicilio.class,
            parametros
        );
    }
}
