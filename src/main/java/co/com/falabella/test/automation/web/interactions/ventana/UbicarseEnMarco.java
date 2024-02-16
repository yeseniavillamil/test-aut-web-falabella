package co.com.falabella.test.automation.web.interactions.ventana;


import co.com.falabella.test.automation.web.interactions.esperas.Esperar;
import co.com.falabella.test.automation.web.utils.driver.web.WebDriverUtil;
import co.com.falabella.test.automation.web.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;

@AllArgsConstructor
public class UbicarseEnMarco implements Interaction
{
    private Target marco;

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        WebDriverUtil.getDriver(actor).switchTo().defaultContent();

        if  (   this.marco != null
        ) {
            actor.attemptsTo(
                    Esperar.hastaQue(this.marco)
                            .este(EstadoElemento.VISIBLE)
                            .porNoMasDe(20).segundos()
            );

            actor.attemptsTo(
                    Check.whether(this.marco.resolveFor(actor).isVisible())
                            .andIfSo(
                                    Switch.toFrame(this.marco.resolveFor(actor))
                            )
            );
        }
    }

    public static UbicarseEnMarco iFrame(Target marco)
    {
        return Tasks.instrumented(UbicarseEnMarco.class,marco);
    }

    public static UbicarseEnMarco principal()
    {
        return Tasks.instrumented(UbicarseEnMarco.class,(Target)null);
    }
}
