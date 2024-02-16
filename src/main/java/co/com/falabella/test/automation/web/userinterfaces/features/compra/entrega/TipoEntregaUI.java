package co.com.falabella.test.automation.web.userinterfaces.features.compra.entrega;

import co.com.falabella.test.automation.web.userinterfaces.javadoc.UIJavaDoc;
import co.com.falabella.test.automation.web.utils.userinterfaces.web.interfaces.IUserInterface;

/**
 * Para mas informacion:
 * @see UIJavaDoc#CLASE
 */
public enum TipoEntregaUI implements IUserInterface {


    BTN_IR_A_PAGAR("ir a pagar",
        "//button[@id='testId-ContinueShopping-enabled']"
    ),



    ;

    private final String nombre;
    private final String stringSelector;

    /**
     * Para mas informacion:
     * @see UIJavaDoc#CONSTRUCTOR
     */
    TipoEntregaUI(String nombre, String stringSelector){
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
