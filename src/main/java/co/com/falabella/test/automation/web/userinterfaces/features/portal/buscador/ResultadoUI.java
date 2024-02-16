package co.com.falabella.test.automation.web.userinterfaces.features.portal.buscador;

import co.com.falabella.test.automation.web.userinterfaces.javadoc.UIJavaDoc;
import co.com.falabella.test.automation.web.utils.userinterfaces.web.interfaces.IUserInterface;

/**
 * Para mas informacion:
 * @see UIJavaDoc#CLASE
 */
public enum ResultadoUI implements IUserInterface {


    LNK_ARTICULO("articulo",
        "//*[@id='testId-searchResults-products']//a[.//b[contains(text(),'{0}')]]"
    ),
    BTN_AGREGAR_CARRO("Agregar al carro",
        "//*[@id='testId-searchResults-products']//a[.//b[contains(text(),'{0}')]]//button[string()='Agregar al Carro']"
    ),

    BTN_SIGUIENTE_PAGINA("siguiente pagina",
        "//button[@id='testId-pagination-top-arrow-right']"
    ),


    ;

    private final String nombre;
    private final String stringSelector;

    /**
     * Para mas informacion:
     * @see UIJavaDoc#CONSTRUCTOR
     */
    ResultadoUI(String nombre, String stringSelector){
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
