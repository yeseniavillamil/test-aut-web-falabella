package co.com.falabella.test.automation.web.constants.enums.tablasgherkin.general.pantalla;

import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.javadoc.TblGherkinJavaDoc;
import co.com.falabella.test.automation.web.models.params.general.pantalla.EstadoElementoParams;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.interfaces.ITablaGherkin;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.utils.TablaGherkinUtil;


/**
 * Para mas informacion:
 * @see TblGherkinJavaDoc#CLASE
 */
public enum EstadoElementoTblGherkin implements ITablaGherkin<EstadoElementoParams>
{
    ESTADO("estado_elemento"),
    ELEMENTO("nombre_estado_elemento"),
    PARAMETROS("parametros_estado_elemento"),
    ;

    private final String columna;

    EstadoElementoTblGherkin(String columna)
    {
        this.columna = columna;
    }

    @Override
    public EstadoElementoParams crearParams(TablaGherkinUtil deLaTablaGherkin)
    {
        EstadoElementoParams parametros = EstadoElementoParams.crearParams(
                deLaTablaGherkin.obtener(ESTADO),
                deLaTablaGherkin.obtener(ELEMENTO),
                deLaTablaGherkin.obtener(PARAMETROS)
        );

        Protagonista.principal().getLibreto().setParametrosEstadoElemento(parametros);

        return parametros;
    }

    @Override
    public String getColumna() {
        return columna;
    }


}
