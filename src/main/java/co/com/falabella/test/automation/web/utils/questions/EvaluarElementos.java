package co.com.falabella.test.automation.web.utils.questions;

import co.com.falabella.test.automation.web.constants.enums.configuracion.Esperas;
import co.com.falabella.test.automation.web.interactions.esperas.Esperar;
import co.com.falabella.test.automation.web.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class EvaluarElementos implements Question<Boolean>
{
    private Target[] elementos;

    @Override
    public Boolean answeredBy(Actor actor)
    {
        actor.attemptsTo(
            //WaitUntil.the(this.elementos[0], WebElementStateMatchers.isVisible()).forNoMoreThan(Esperas.GENERAL.getTiempo()).seconds()
            Esperar.hastaQue(this.elementos[0])
                .este(EstadoElemento.PRESENTE)
                .porNoMasDe(Esperas.GENERAL.getTiempo()).segundos()
        );

        boolean resultado = true;

        for (   Target elemento : this.elementos )
        {
            resultado = this.validaQue(actor,elemento);
            if  (   !resultado  ){
                break;
            }
        }

        return resultado;
    }

    protected abstract boolean validaQue(Actor actor, Target elemento);

}
