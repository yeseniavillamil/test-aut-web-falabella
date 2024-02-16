package co.com.falabella.test.automation.web.userinterfaces.features.portal.buscador;

import co.com.falabella.test.automation.web.userinterfaces.javadoc.UIJavaDoc;
import co.com.falabella.test.automation.web.utils.userinterfaces.web.interfaces.IUserInterface;

/**
 * Para mas informacion:
 * @see UIJavaDoc#CLASE
 */
public enum BuscadorUI implements IUserInterface {


    BTN_BUSCAR("buscar",
        "//*[@id='testId-search-wrapper']//button"
    ),

    TXT_BUSCAR("busqueda",
        "//*[@id='testId-search-wrapper']//input"
    ),

    LNK_RESULTADO("resultado {0}",
        "//div[contains(@class,'searchResults')]//a[string()='{0}']"
    )

    ;

    private final String nombre;
    private final String stringSelector;

    /**
     * Para mas informacion:
     * @see UIJavaDoc#CONSTRUCTOR
     */
    BuscadorUI(String nombre, String stringSelector){
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
