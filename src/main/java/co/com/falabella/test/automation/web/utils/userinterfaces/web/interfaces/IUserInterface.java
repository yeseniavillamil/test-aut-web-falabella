package co.com.falabella.test.automation.web.utils.userinterfaces.web.interfaces;


import co.com.falabella.test.automation.web.userinterfaces.javadoc.UIJavaDoc;
import co.com.falabella.test.automation.web.utils.parametros.ParamsUtil;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.targets.TargetBuilder;

public interface IUserInterface {

    /**
     * Para mas informacion:
     * @see UIJavaDoc#TARGET
     */
    default Target getTarget(Object ... parametros)
    {
        String nombre = ParamsUtil.procesarParametros(this.getNombre(),parametros);
        String stringSelector = ParamsUtil.procesarParametros(this.getStringSelector(),parametros);

        return this.getStrategy(
            Target.the(nombre),
            stringSelector
        );
    }

    default Target getStrategy(TargetBuilder target, String stringSelector)
    {
        return target.locatedBy(stringSelector);
    }

    /**
     * Para mas informacion:
     * @see UIJavaDoc#STRING_SELECTOR
     */
    String getStringSelector();

    /**
     * Para mas informacion:
     * @see UIJavaDoc#NOMBRE
     */
    String getNombre();
}
