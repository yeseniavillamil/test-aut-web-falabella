package co.com.falabella.test.automation.web.constants.enums.tablasgherkin.features.compra.entrega;

import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.javadoc.TblGherkinJavaDoc;
import co.com.falabella.test.automation.web.models.params.features.compra.entrega.ContactoEntregaParams;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.interfaces.ITablaGherkin;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.utils.TablaGherkinUtil;


/**
 * Para mas informacion:
 * @see TblGherkinJavaDoc#CLASE
 */
public enum ContactoEntregaTblGherkin implements ITablaGherkin<ContactoEntregaParams>
{
    CORREO("correo_contacto"),
    ;

    private final String columna;

    ContactoEntregaTblGherkin(String columna)
    {
        this.columna = columna;
    }

    @Override
    public ContactoEntregaParams crearParams(TablaGherkinUtil deLaTablaGherkin)
    {
        ContactoEntregaParams parametros = ContactoEntregaParams.crearParams(
            deLaTablaGherkin.obtener(CORREO)
        );

        Protagonista.principal().getLibreto().setParametrosContactoEntrega(parametros);

        return parametros;
    }

    @Override
    public String getColumna() {
        return columna;
    }
}
