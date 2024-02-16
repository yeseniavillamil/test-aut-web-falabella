package co.com.falabella.test.automation.web.userinterfaces.features.compra.entrega;

import co.com.falabella.test.automation.web.userinterfaces.javadoc.UIJavaDoc;
import co.com.falabella.test.automation.web.utils.userinterfaces.web.interfaces.IUserInterface;

/**
 * Para mas informacion:
 * @see UIJavaDoc#CLASE
 */
public enum ContactoEntregaUI implements IUserInterface {

    TXT_CORREO("correo electronico",
        "//input[@id='testId-Input-email']"
    ),

    ;

    private final String nombre;
    private final String stringSelector;

    /**
     * Para mas informacion:
     * @see UIJavaDoc#CONSTRUCTOR
     */
    ContactoEntregaUI(String nombre, String stringSelector){
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
