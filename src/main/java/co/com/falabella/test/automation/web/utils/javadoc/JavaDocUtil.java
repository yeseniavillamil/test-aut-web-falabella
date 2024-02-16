package co.com.falabella.test.automation.web.utils.javadoc;

import co.com.falabella.test.automation.web.utils.GeneralUtil;


public class JavaDocUtil {

    /**
     * Un compendio de utilidades dispone sus consumos de manera estatica, bajo esta caracteristica no deberia necesitarse
     * instanciar <a href="https://rules.sonarsource.com/java/RSPEC-1118">(SonarRule)</a>, Para ello use:
     * <br/>Constructor privado con el soporte para que no permita instanciar
     * @see GeneralUtil#noPermitaInstanciar()
     */
    public static final String CONSTRUCTOR = null;

    private JavaDocUtil()
    {
        GeneralUtil.noPermitaInstanciar();
    }
}
