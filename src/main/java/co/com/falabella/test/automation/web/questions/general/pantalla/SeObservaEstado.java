package co.com.falabella.test.automation.web.questions.general.pantalla;

import co.com.falabella.test.automation.web.questions.javadoc.QuestionsJavaDoc;
import co.com.falabella.test.automation.web.userinterfaces.general.pantalla.ElementosUI;
import co.com.falabella.test.automation.web.utils.parametros.ParamsUtil;
import co.com.falabella.test.automation.web.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import co.com.falabella.test.automation.web.utils.questions.estadoelementos.questions.ElEstado;
import co.com.falabella.test.automation.web.utils.userinterfaces.web.interfaces.IUserInterface;
import lombok.Builder;
import lombok.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Arrays;
import java.util.List;

/**
 * Para mas informacion:
 * @see QuestionsJavaDoc#CLASE
 */
@Builder
@Data
public class SeObservaEstado implements Question<Boolean>
{
    private List<String> elementos;
    private List<String> parametros;
    private String estado;

    /**
     * Para mas informacion:
     * @see QuestionsJavaDoc#ANSWERED_BY
     */
    @Override
    public Boolean answeredBy(Actor actor)
    {
        /**
         * Para mas informacion:
         * @see QuestionsJavaDoc#ENLAZAR_VALIDACIONES_VERIFICACIONES
         */

        boolean resultado = true;

        for(String elemento : this.elementos)
        {
            if( elemento!=null &&  !elemento.isEmpty()  )
            {
                resultado = this.validarElemento(actor,elemento);

                if( !resultado ) {
                    break;
                }
            }
        }

        return resultado;
    }

    private boolean validarElemento(Actor actor, String elemento){

        IUserInterface ui = ElementosUI.buscarElementoUI(elemento);
        Target uiElemento = (this.parametros==null)
            ? ui.getTarget()
            : ui.getTarget(this.parametros.toArray());

        actor.attemptsTo(
            Scroll.to(uiElemento)
        );

        return ElEstado.deLosElementos(
                uiElemento
            ).sea(EstadoElemento.valueOf(this.estado.toUpperCase()))
            .answeredBy(actor);
    }

    /**
     * Para mas informacion:
     * @see QuestionsJavaDoc#ENLACE
     */
    public static SeObservaEstado delElemento(String estado, String elemento, String parametros)
    {
        List<String> elementos = ParamsUtil.procesarCadena(elemento);
        List<String> lstParametros = ParamsUtil.procesarCadena(parametros);

        return SeObservaEstado.builder()
            .estado(estado)
            .elementos(elementos)
            .parametros(lstParametros)
            .build();
    }



    /**
     * Para mas informacion:
     * @see QuestionsJavaDoc#ENLACE
     */
    public static SeObservaEstado delElemento(String estado, String ... elementos)
    {
        return SeObservaEstado.builder()
            .estado(estado)
            .elementos(Arrays.asList(elementos))
            .build();
    }
}

