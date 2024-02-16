package co.com.falabella.test.automation.web.constants.enums.tablasgherkin.features.portal.buscador;

import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.javadoc.TblGherkinJavaDoc;
import co.com.falabella.test.automation.web.models.params.features.portal.buscador.ResultadoParams;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.interfaces.ITablaGherkin;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.utils.TablaGherkinUtil;


/**
 * Para mas informacion:
 * @see TblGherkinJavaDoc#CLASE
 */
public enum ResultadoTblGherkin implements ITablaGherkin<ResultadoParams>
{
    NOMBRE_ARTICULO("nombre_articulo"),
    ;

    private final String columna;

    ResultadoTblGherkin(String columna)
    {
        this.columna = columna;
    }

    @Override
    public ResultadoParams crearParams(TablaGherkinUtil deLaTablaGherkin)
    {
        ResultadoParams parametros = ResultadoParams.crearParams(
            deLaTablaGherkin.obtener(NOMBRE_ARTICULO)
        );

        Protagonista.principal().getLibreto().setParametrosResultado(parametros);

        return parametros;
    }

    @Override
    public String getColumna() {
        return columna;
    }
}
