package co.com.falabella.test.automation.web.constants.enums.tablasgherkin.general.pantalla;

import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.javadoc.TblGherkinJavaDoc;
import co.com.falabella.test.automation.web.models.params.general.pantalla.TextoElementoParams;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.interfaces.ITablaGherkin;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.utils.TablaGherkinUtil;


/**
 * Para mas informacion:
 * @see TblGherkinJavaDoc#CLASE
 */
public enum TextoElementoTblGherkin implements ITablaGherkin<TextoElementoParams>
{
    ELEMENTO("nombre_texto_elemento"),
    PARAMETROS("parametros_texto_elemento"),
    TEXTO("texto_elemento"),
    ;

    private final String columna;

    TextoElementoTblGherkin(String columna)
    {
        this.columna = columna;
    }

    @Override
    public TextoElementoParams crearParams(TablaGherkinUtil deLaTablaGherkin)
    {
        TextoElementoParams parametros = TextoElementoParams.crearParams(
                deLaTablaGherkin.obtener(ELEMENTO),
                deLaTablaGherkin.obtener(PARAMETROS),
                deLaTablaGherkin.obtener(TEXTO)
        );

        Protagonista.principal().getLibreto().setParametrosTextoElemento(parametros);

        return parametros;
    }

    @Override
    public String getColumna() {
        return columna;
    }
}
