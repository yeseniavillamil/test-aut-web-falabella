package co.com.falabella.test.automation.web.userinterfaces.general.pantalla;

import co.com.falabella.test.automation.web.userinterfaces.features.compra.carrito.CarritoCompraUI;
import co.com.falabella.test.automation.web.userinterfaces.features.compra.unidad.UnidadCompraUI;
import co.com.falabella.test.automation.web.userinterfaces.features.portal.buscador.BuscadorUI;
import co.com.falabella.test.automation.web.userinterfaces.javadoc.UIJavaDoc;
import co.com.falabella.test.automation.web.utils.userinterfaces.web.interfaces.IUserInterface;

import java.util.HashMap;
import java.util.Map;

/**
 * Para mas informacion:
 * @see UIJavaDoc#CLASE
 */
public enum ElementosUI implements IUserInterface {

    TXT_BUSCAR(
        BuscadorUI.TXT_BUSCAR
    ),
    ITM_PRODUCTO(
        CarritoCompraUI.ITM_PRODUCTO
    ),

    PNL_ARTICULO_AGREGADO(
        UnidadCompraUI.PNL_ARTICULO_AGREGADO
    ),


    ;

    private final String nombre;
    private final String stringSelector;
    private static HashMap<String,IUserInterface> hmElementosUI;

    /**
     * Para mas informacion:
     * @see UIJavaDoc#CONSTRUCTOR
     */
    ElementosUI(String nombre, String stringSelector){
        this.nombre = nombre;
        this.stringSelector = stringSelector;
        ElementosUI.getHmElementosUI().put(this.getNombre(),this);
    }

    ElementosUI(IUserInterface iUserInterface){
        this(iUserInterface.getNombre(),iUserInterface.getStringSelector());
    }

    public static Map<String,IUserInterface> getHmElementosUI()
    {
        if(ElementosUI.hmElementosUI == null)
        {
            ElementosUI.hmElementosUI = new HashMap<>();
        }
        return ElementosUI.hmElementosUI;
    }

    public static IUserInterface buscarElementoUI(String elementoUI)
    {
        return ElementosUI.getHmElementosUI().get(elementoUI);
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
