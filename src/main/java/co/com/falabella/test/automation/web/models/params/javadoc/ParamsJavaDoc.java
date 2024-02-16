package co.com.falabella.test.automation.web.models.params.javadoc;

import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.PlantillaTblGherkin;
import co.com.falabella.test.automation.web.models.scena.Libreto;
import co.com.falabella.test.automation.web.utils.GeneralUtil;

/**
 * Clase que centraliza la documentacion asociada al concepto de paso-parametros (Params), dentro de la arquitectura
 */
public class ParamsJavaDoc {

    /**
     * Clase que representa el conjunto de parametros, habitualmente descritos por una tabla gherkin
     * NO OLVIDE REGISTRAR LOS PARAMETROS EN EL LIBRETO, PARA HABILITAR SU USO
     * @see Libreto
     */
    public static final String CLASE = null;

    /**
     * Metodo que facilita la creacion del objeto de parametros, habitualmente conectado desde la configuracion de una
     * tabla gherkin
     * @see PlantillaTblGherkin
     */
    public static final String CREAR_PARAMS = null;

    private ParamsJavaDoc()
    {
        GeneralUtil.noPermitaInstanciar();
    }

}
