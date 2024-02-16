package co.com.falabella.test.automation.web.userinterfaces.features.portal;

import co.com.falabella.test.automation.web.userinterfaces.javadoc.UIJavaDoc;
import co.com.falabella.test.automation.web.utils.userinterfaces.web.interfaces.IUserInterface;

public enum PortalUI implements IUserInterface
{
    BTN_RESUMEN_TOTAL_COMPRA("Resumen items",
        "//div[contains(@class,'minicartQuantity')][text()='{0}']"
    ),

    LNK_CARRITO("Ir al carrito",
        "//div[contains(@class,'minicartContainer')]//a[contains(@class,'minicartLink')]"
    ),
    ;

    private final String nombre;
    private final String stringSelector;

    /**
     * Para mas informacion:
     * @see UIJavaDoc#CONSTRUCTOR
     */
    PortalUI(String nombre, String stringSelector){
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
