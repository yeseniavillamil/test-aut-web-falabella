package co.com.falabella.test.automation.web.utils.datos;

import co.com.falabella.test.automation.web.utils.GeneralUtil;
import co.com.falabella.test.automation.web.utils.javadoc.JavaDocUtil;

/**
 * Utilitario relacionado con el procesamiento de datos null
 */
public class NullUtil
{
    public static final String ID_NULL = "%[NULL]%";

    /**
     * Para mas informacion:
     * @see JavaDocUtil#CONSTRUCTOR
     */
    private NullUtil(){
        GeneralUtil.noPermitaInstanciar();
    }

    public static boolean esNulo(String dato) {

        return ID_NULL.equals(dato);
    }
}
