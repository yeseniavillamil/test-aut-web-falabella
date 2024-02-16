package co.com.falabella.test.automation.web.constants.enums.tablasgherkin.general.pantalla;

import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.javadoc.TblGherkinJavaDoc;
import co.com.falabella.test.automation.web.models.params.general.pantalla.TextoZonaParams;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.interfaces.ITablaGherkin;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.utils.TablaGherkinUtil;


/**
 * Para mas informacion:
 * @see TblGherkinJavaDoc#CLASE
 */
public enum TextoZonaTblGherkin implements ITablaGherkin<TextoZonaParams>
{
    SECCION("seccion_zona"),
    PARAMETROS("parametros_zona"),
    TEXTO("texto_zona"),
    ;

    private final String columna;

    TextoZonaTblGherkin(String columna)
    {
        this.columna = columna;
    }

    @Override
    public TextoZonaParams crearParams(TablaGherkinUtil deLaTablaGherkin)
    {
        TextoZonaParams parametros = TextoZonaParams.crearParams(
                deLaTablaGherkin.obtener(SECCION),
                deLaTablaGherkin.obtener(PARAMETROS),
                deLaTablaGherkin.obtener(TEXTO)
        );

        Protagonista.principal().getLibreto().setParametrosTextoZona(parametros);

        return parametros;
    }

    @Override
    public String getColumna() {
        return columna;
    }
}
