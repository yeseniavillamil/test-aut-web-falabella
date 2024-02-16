package co.com.falabella.test.automation.web.constants.enums.tablasgherkin.features.portal.ofertas;

import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.javadoc.TblGherkinJavaDoc;
import co.com.falabella.test.automation.web.models.params.features.portal.ofertas.OfertasParams;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.interfaces.ITablaGherkin;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.utils.TablaGherkinUtil;


/**
 * Para mas informacion:
 * @see TblGherkinJavaDoc#CLASE
 */
public enum OfertasTblGherkin implements ITablaGherkin<OfertasParams>
{
    CONFIRMA("confirma_mejor_oferta"),
    ;

    private final String columna;

    OfertasTblGherkin(String columna)
    {
        this.columna = columna;
    }

    @Override
    public OfertasParams crearParams(TablaGherkinUtil deLaTablaGherkin)
    {
        OfertasParams parametros = OfertasParams.crearParams(
                deLaTablaGherkin.obtener(CONFIRMA)
        );

        Protagonista.principal().getLibreto().setParametrosOfertas(parametros);

        return parametros;
    }

    @Override
    public String getColumna() {
        return columna;
    }
}
