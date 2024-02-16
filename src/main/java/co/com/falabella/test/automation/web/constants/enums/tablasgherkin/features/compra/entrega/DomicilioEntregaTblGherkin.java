package co.com.falabella.test.automation.web.constants.enums.tablasgherkin.features.compra.entrega;

import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.javadoc.TblGherkinJavaDoc;
import co.com.falabella.test.automation.web.models.params.features.compra.entrega.DomicilioEntregaParams;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.interfaces.ITablaGherkin;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.utils.TablaGherkinUtil;


/**
 * Para mas informacion:
 * @see TblGherkinJavaDoc#CLASE
 */
public enum DomicilioEntregaTblGherkin implements ITablaGherkin<DomicilioEntregaParams>
{
    DEPARTAMENTO("departamento_domicilio"),
    CIUDAD("ciudad_domicilio"),
    BARRIO("barrio_domicilio"),
    DIRECCION("direccion_domicilio"),
    ADICIONAL("adicional_domicilio"),
    ;

    private final String columna;

    DomicilioEntregaTblGherkin(String columna)
    {
        this.columna = columna;
    }

    @Override
    public DomicilioEntregaParams crearParams(TablaGherkinUtil deLaTablaGherkin)
    {
        DomicilioEntregaParams parametros = DomicilioEntregaParams.crearParams(
            deLaTablaGherkin.obtener(DEPARTAMENTO),
            deLaTablaGherkin.obtener(CIUDAD),
            deLaTablaGherkin.obtener(BARRIO),
            deLaTablaGherkin.obtener(DIRECCION),
            deLaTablaGherkin.obtener(ADICIONAL)
        );

        Protagonista.principal().getLibreto().setParametrosDomicilioEntrega(parametros);

        return parametros;
    }

    @Override
    public String getColumna() {
        return columna;
    }
}
