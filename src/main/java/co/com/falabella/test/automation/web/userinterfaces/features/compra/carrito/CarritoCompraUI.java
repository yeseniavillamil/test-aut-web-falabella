package co.com.falabella.test.automation.web.userinterfaces.features.compra.carrito;

import co.com.falabella.test.automation.web.userinterfaces.javadoc.UIJavaDoc;
import co.com.falabella.test.automation.web.utils.userinterfaces.web.interfaces.IUserInterface;

/**
 * Para mas informacion:
 * @see UIJavaDoc#CLASE
 */
public enum CarritoCompraUI implements IUserInterface {

    ITM_PRODUCTO("producto seleccionado",
        "//div[@class='css-1upilqn'][contains(string(),'{0}')]"
    ),

    BTN_CONTINUAR_COMPRA("continuar compra",
        "//button[@data-testid='testId-ContinueShopping-enabled']"
    ),


    ;

    private final String nombre;
    private final String stringSelector;

    /**
     * Para mas informacion:
     * @see UIJavaDoc#CONSTRUCTOR
     */
    CarritoCompraUI(String nombre, String stringSelector){
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
