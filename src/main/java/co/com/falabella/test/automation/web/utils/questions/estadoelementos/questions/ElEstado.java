package co.com.falabella.test.automation.web.utils.questions.estadoelementos.questions;

import co.com.falabella.test.automation.web.utils.questions.EvaluarElementos;
import co.com.falabella.test.automation.web.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class ElEstado
{
    private Target[] elementos;

    public class ElEstadoDeLosElementos extends EvaluarElementos {

        private EstadoElemento estado;

        ElEstadoDeLosElementos(Target[] elementos, EstadoElemento estado) {
            super(elementos);
            this.estado = estado;
        }

        @Override
        protected boolean validaQue(Actor actor, Target elemento)
        {
            if (this.estado == null) {
                throw new UnsupportedOperationException();
            }

            return this.estado.esCuando(actor, elemento);
        }
    }

    public ElEstadoDeLosElementos sea(EstadoElemento estado) {
        return new ElEstadoDeLosElementos(this.elementos, estado);
    }

    public static ElEstado deLosElementos(Target ... elementos)
    {
        return new ElEstado(elementos);
    }
}
