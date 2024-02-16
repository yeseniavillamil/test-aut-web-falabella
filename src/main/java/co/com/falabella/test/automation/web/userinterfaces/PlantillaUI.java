package co.com.falabella.test.automation.web.userinterfaces;

import co.com.falabella.test.automation.web.userinterfaces.javadoc.UIJavaDoc;
import co.com.falabella.test.automation.web.utils.userinterfaces.web.interfaces.IUserInterface;

/**
 * Para mas informacion:
 * @see UIJavaDoc#CLASE
 */
public enum PlantillaUI implements IUserInterface {

    TXT_NOMBRE_CAJA_TEXTO("{{descripcion/nombre informe para NOMBRE_CAJA_TEXTO}}",
            "//{{xpath_NOMBRE_CAJA_TEXTO}}"
    ),

    BTN_NOMBRE_BOTON("{{descripcion/nombre informe para NOMBRE_BOTON}}",
            "//{{xpath_NOMBRE_BOTON}}"
    ),

    CHK_NOMBRE_CAJA_VERIFICACION("{{descripcion/nombre informe para NOMBRE_CAJA_VERIFICACION}}",
            "//{{xpath_NOMBRE_CAJA_VERIFICACION}}"
    ),

    CMB_NOMBRE_LISTA_DESPLEGABLE("{{descripcion/nombre informe para NOMBRE_LISTA_DESPLEGABLE}}",
            "//{{xpath_NOMBRE_LISTA_DESPLEGABLE}}"
    ),

    ;

    private final String nombre;
    private final String stringSelector;

    /**
     * Para mas informacion:
     * @see UIJavaDoc#CONSTRUCTOR
     */
    PlantillaUI(String nombre, String stringSelector){
        this.nombre = nombre;
        this.stringSelector = stringSelector;
    }

    @Override
    public String getStringSelector() {
        return this.stringSelector;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}
