package co.com.falabella.test.automation.web.questions.general.pantalla;

import co.com.falabella.test.automation.web.questions.javadoc.QuestionsJavaDoc;
import co.com.falabella.test.automation.web.userinterfaces.general.pantalla.ContenidoWebUI;
import co.com.falabella.test.automation.web.userinterfaces.general.pantalla.ZonasUI;
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
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Para mas informacion:
 * @see QuestionsJavaDoc#CLASE
 */
@Builder
@Data
public class SeObservaTexto implements Question<Boolean>
{
    private List<String> textos;
    private EstadoElemento este;
    private boolean exacto;
    private String seccion;
    private List<String> parametros;

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

        for(String texto : this.textos)
        {
            if( texto!=null &&  !texto.isEmpty()  )
            {
                resultado = this.validarTexto(actor,texto);

                if( !resultado ) {
                    break;
                }
            }
        }

        return resultado;
    }

    private boolean validarTexto(Actor actor,String texto){
        IUserInterface lblTexto=this.exacto
            ? ContenidoWebUI.LBL_TEXTO_EXACTO
            : ContenidoWebUI.LBL_TEXTO;

        String xpathSeccion;

        if(this.seccion==null || this.seccion.trim().isEmpty()){
            xpathSeccion = StringUtils.EMPTY;
        }else{
            IUserInterface ui = ZonasUI.buscarZonaUI(this.seccion);
            Target uiSeccion = (this.parametros==null)
                ? ui.getTarget()
                : ui.getTarget(this.parametros.toArray());

            actor.attemptsTo(
                Scroll.to(uiSeccion)
            );
            xpathSeccion = uiSeccion.getCssOrXPathSelector();
        }

        boolean resultado = ElEstado.deLosElementos(
                lblTexto.getTarget(texto,xpathSeccion)
            ).sea(this.este)
            .answeredBy(actor);

        if(resultado && this.seccion==null){
            actor.attemptsTo(
                Scroll.to(lblTexto.getTarget(texto,xpathSeccion))
            );
        }

        return resultado;
    }

    public static SeObservaTexto enPantalla(
        EstadoElemento este,
        boolean exacto,
        String seccion,
        String parametros,
        String texto
    ) {
        SeObservaTexto question = SeObservaTexto.enPantalla(este,exacto,seccion,texto);
        List<String> lstParametros = ParamsUtil.procesarCadena(parametros);
        question.setParametros(lstParametros);
        return question;
    }

    public static SeObservaTexto enPantalla(
        EstadoElemento este,
        boolean exacto,
        String seccion,
        String texto
    ) {
        SeObservaTexto question = SeObservaTexto.enPantalla(este,exacto,texto);
        question.setSeccion(seccion);
        return question;
    }

    /**
     * Para mas informacion:
     * @see QuestionsJavaDoc#ENLACE
     */
    public static SeObservaTexto enPantalla(EstadoElemento este, boolean exacto,String texto)
    {
        List<String> textos = ParamsUtil.procesarCadena(texto);

        return SeObservaTexto.builder()
            .este(este)
            .exacto(exacto)
            .textos(textos)
            .build();
    }

}

