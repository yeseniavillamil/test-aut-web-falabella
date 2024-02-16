package co.com.falabella.test.automation.web.userinterfaces.general.pantalla;

import co.com.falabella.test.automation.web.userinterfaces.javadoc.UIJavaDoc;
import co.com.falabella.test.automation.web.utils.userinterfaces.web.interfaces.IUserInterface;

public enum ContenidoWebUI implements IUserInterface
{

    LBL_TEXTO("texto similar a: {0}",
        "{1}//*[contains(text(),'{0}')]"
    ),
    LBL_TEXTO_EXACTO("exactamente el texto: {0}",
        "{1}//*[text()[normalize-space()='{0}']]"
    ),


//    public static final Target LBL_TEXTO=
//        Target.the("texto similar a: {0}")
//            .locatedBy("//*[contains(text(),'{0}')]");
//
//    public static final Target LBL_TEXTO_EXACTO=
//        Target.the("exactamente el texto: {0}")
//            .locatedBy("//*[text()='{0}']");

    ;

    private final String nombre;
    private final String stringSelector;

    /**
     * Para mas informacion:
     * @see UIJavaDoc#CONSTRUCTOR
     */
    ContenidoWebUI(String nombre, String stringSelector){
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
