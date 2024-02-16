package co.com.falabella.test.automation.web.userinterfaces.features.compra.entrega;

import co.com.falabella.test.automation.web.userinterfaces.javadoc.UIJavaDoc;
import co.com.falabella.test.automation.web.utils.userinterfaces.web.interfaces.IUserInterface;

/**
 * Para mas informacion:
 * @see UIJavaDoc#CLASE
 */
public enum DomicilioEntregaUI implements IUserInterface {

    BTN_CONTINUAR("continuar",
        "//button[@id='continueButton']"
    ),
    BTN_DEPARTAMENTOS("departamentos",
        "//button[@data-testid='testId-ExtendedDropdown'][.//*[@placeholder='Selecciona un Departamento']]"
    ),
    BTN_ITM_UBICACION("{0}",
        "//ul[contains(@class,'dropdown-list')]//button[text()='{0}']"
    ),
    BTN_CIUDADES("ciudades",
        "//button[@data-testid='testId-ExtendedDropdown'][.//*[@placeholder='Selecciona una Ciudad']]"
    ),
    BTN_BARRIOS("barrios",
        "//button[@data-testid='testId-ExtendedDropdown'][.//*[@placeholder='Selecciona un Barrio']]"
    ),
    TXT_DIRECCION("dirección",
        "//input[@id='testId-Input-street']"
    ),
    TXT_ADICIONAL("adicional",
        "//input[@id='testId-Input-department']"
    ),
    BTN_CONFIRMAR_DIRECCION("confimar dirección",
        "//button[@id='testId-infoModalFooter-button']"
    ),

    BTN_CONFIRMAR_Y_GUARDAR("confimar y guardar",
        "//button[@id='testId-infoModalFooter-button'][text()='Confirmar y Guardar']"
    ),


    ;

    private final String nombre;
    private final String stringSelector;

    /**
     * Para mas informacion:
     * @see UIJavaDoc#CONSTRUCTOR
     */
    DomicilioEntregaUI(String nombre, String stringSelector){
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
