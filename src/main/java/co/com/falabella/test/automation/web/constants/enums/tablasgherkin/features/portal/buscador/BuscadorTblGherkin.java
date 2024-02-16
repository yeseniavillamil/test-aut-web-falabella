package co.com.falabella.test.automation.web.constants.enums.tablasgherkin.features.portal.buscador;

import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.javadoc.TblGherkinJavaDoc;
import co.com.falabella.test.automation.web.models.params.features.portal.buscador.BuscadorParams;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.interfaces.ITablaGherkin;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.utils.TablaGherkinUtil;


/**
 * Para mas informacion:
 * @see TblGherkinJavaDoc#CLASE
 */
public enum BuscadorTblGherkin implements ITablaGherkin<BuscadorParams>
{
    PRODUCTO("producto_busqueda"),
    RESULTADO("resultado_busqueda"),
    ;

    private final String columna;

    BuscadorTblGherkin(String columna)
    {
        this.columna = columna;
    }

    @Override
    public BuscadorParams crearParams(TablaGherkinUtil deLaTablaGherkin)
    {
        BuscadorParams parametros = BuscadorParams.crearParams(
            deLaTablaGherkin.obtener(PRODUCTO),
            deLaTablaGherkin.obtener(RESULTADO)
        );

        Protagonista.principal().getLibreto().setParametrosBuscador(parametros);

        return parametros;
    }

    @Override
    public String getColumna() {
        return columna;
    }
}
