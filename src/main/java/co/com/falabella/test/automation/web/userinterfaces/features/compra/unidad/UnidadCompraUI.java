package co.com.falabella.test.automation.web.userinterfaces.features.compra.unidad;

import co.com.falabella.test.automation.web.userinterfaces.javadoc.UIJavaDoc;
import co.com.falabella.test.automation.web.utils.userinterfaces.web.interfaces.IUserInterface;

/**
 * Para mas informacion:
 * @see UIJavaDoc#CLASE
 */
public enum UnidadCompraUI implements IUserInterface {

    BTN_IR_AL_CARRO("ir al carro",
        "//a[@id='linkButton']"
    ),

    PNL_ARTICULO_AGREGADO("resumen articulo agregado",
        "//*[contains(@class,'additional-information')][contains(string(),'{0}')]"),


    ;

    private final String nombre;
    private final String stringSelector;

    /**
     * Para mas informacion:
     * @see UIJavaDoc#CONSTRUCTOR
     */
    UnidadCompraUI(String nombre, String stringSelector){
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
