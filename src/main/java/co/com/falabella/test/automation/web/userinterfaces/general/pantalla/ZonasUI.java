package co.com.falabella.test.automation.web.userinterfaces.general.pantalla;


import co.com.falabella.test.automation.web.userinterfaces.javadoc.UIJavaDoc;
import co.com.falabella.test.automation.web.utils.userinterfaces.web.interfaces.IUserInterface;

import java.util.HashMap;
import java.util.Map;

/**
 * Para mas informacion:
 * @see UIJavaDoc#CLASE
 */
public enum ZonasUI implements IUserInterface {



    ;

    private final String nombre;
    private final String stringSelector;
    private static HashMap<String,IUserInterface> hmZonasUI;

    /**
     * Para mas informacion:
     * @see UIJavaDoc#CONSTRUCTOR
     */
    ZonasUI(String nombre, String stringSelector){
        this.nombre = nombre;
        this.stringSelector = stringSelector;
        ZonasUI.getHmZonasUI().put(this.getNombre(),this);
    }

    ZonasUI(IUserInterface iUserInterface){
        this(iUserInterface.getNombre(),iUserInterface.getStringSelector());
    }

    public static Map<String,IUserInterface> getHmZonasUI()
    {
        if(ZonasUI.hmZonasUI == null)
        {
            ZonasUI.hmZonasUI = new HashMap<>();
        }
        return ZonasUI.hmZonasUI;
    }

    public static IUserInterface buscarZonaUI(String zonaUI)
    {
        return ZonasUI.getHmZonasUI().get(zonaUI);
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
