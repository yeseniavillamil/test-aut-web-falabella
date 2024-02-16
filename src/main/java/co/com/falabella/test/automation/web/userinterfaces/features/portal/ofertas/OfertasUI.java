package co.com.falabella.test.automation.web.userinterfaces.features.portal.ofertas;

import co.com.falabella.test.automation.web.userinterfaces.javadoc.UIJavaDoc;
import co.com.falabella.test.automation.web.utils.userinterfaces.web.interfaces.IUserInterface;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.targets.TargetBuilder;
import net.thucydides.core.webdriver.shadow.ByShadow;

/**
 * Para mas informacion:
 * @see UIJavaDoc#CLASE
 */
public enum OfertasUI implements IUserInterface {

    BTN_SI_AMO_LAS_OFERTAS("Si, amo las ofertas",
            "button.airship-btn-accept"
    ){
        @Override
        public Target getStrategy(TargetBuilder target, String stringSelector) {
            return target.located(ByShadow.cssSelector(stringSelector,
                ".airship-html-prompt-shadow"));
        }
    },

    BTN_NO_GRACIAS("No, gracias",
        "button.airship-btn-deny"
    ){
        @Override
        public Target getStrategy(TargetBuilder target, String stringSelector) {
            return target.located(ByShadow.cssSelector(stringSelector,
                ".airship-html-prompt-shadow"));
        }
    },

    BTN_CERRAR_CONFIRMACION_RECIBIDO("cerrar confirmacion de recibido",
        "//*[@id='testId-notification'][2]//button[@id='testId-notification-close-btn']"
    )

    ;

    private final String nombre;
    private final String stringSelector;

    /**
     * Para mas informacion:
     * @see UIJavaDoc#CONSTRUCTOR
     */
    OfertasUI(String nombre, String stringSelector){
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
