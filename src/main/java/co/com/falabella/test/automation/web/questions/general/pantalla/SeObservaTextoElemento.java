package co.com.falabella.test.automation.web.questions.general.pantalla;

import co.com.falabella.test.automation.web.questions.javadoc.QuestionsJavaDoc;
import co.com.falabella.test.automation.web.userinterfaces.general.pantalla.ElementosUI;
import co.com.falabella.test.automation.web.utils.parametros.ParamsUtil;
import co.com.falabella.test.automation.web.utils.userinterfaces.web.interfaces.IUserInterface;
import lombok.Builder;
import lombok.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.TextValue;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

/**
 * Para mas informacion:
 * @see QuestionsJavaDoc#CLASE
 */
@Builder
@Data
public class SeObservaTextoElemento implements Question<Boolean>
{
    private List<String> elementos;
    private List<String> parametros;
    private String texto;

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

        return actor.asksFor(TextValue.of(uiElemento))
            .equals(this.texto);
    }

    /**
     * Para mas informacion:
     * @see QuestionsJavaDoc#ENLACE
     */
    public static SeObservaTextoElemento delElemento(String elemento, String parametros, String texto)
    {
        SeObservaTextoElemento question = SeObservaTextoElemento.delElemento(elemento,texto);
        List<String> lstParametros = ParamsUtil.procesarCadena(parametros);
        question.setParametros(lstParametros);

        return question;
    }

    /**
     * Para mas informacion:
     * @see QuestionsJavaDoc#ENLACE
     */
    public static SeObservaTextoElemento delElemento(String elementos, String texto)
    {
        List<String> lstElementos = ParamsUtil.procesarCadena(elementos);

        return SeObservaTextoElemento.builder()
            .elementos(lstElementos)
            .texto(texto)
            .build();
    }
}

