package co.com.falabella.test.automation.web.constants.enums.tablasgherkin;



import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.features.compra.entrega.ContactoEntregaTblGherkin;
import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.features.compra.entrega.DomicilioEntregaTblGherkin;
import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.features.portal.buscador.BuscadorTblGherkin;
import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.features.portal.buscador.ResultadoTblGherkin;
import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.features.portal.ofertas.OfertasTblGherkin;
import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.general.pantalla.EstadoElementoTblGherkin;
import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.general.pantalla.TextoElementoTblGherkin;
import co.com.falabella.test.automation.web.constants.enums.tablasgherkin.general.pantalla.TextoZonaTblGherkin;
import co.com.falabella.test.automation.web.utils.gherkin.tabla.interfaces.ITablaGherkin;
import co.com.falabella.test.automation.web.utils.models.params.interfaces.IParam;

public enum TablasGherkin
{
    FUNCIONALIDAD(PlantillaTblGherkin.values()),
    ESTADO_ELEMENTO(EstadoElementoTblGherkin.values()),
    TEXTO_ZONA(TextoZonaTblGherkin.values()),
    TEXTO_ELEMENTO(TextoElementoTblGherkin.values()),
    OFERTAS(OfertasTblGherkin.values()),
    BUSCADOR(BuscadorTblGherkin.values()),
    RESULTADO_BUSQUEDA(ResultadoTblGherkin.values()),
    CONTACTO_ENTREGA(ContactoEntregaTblGherkin.values()),
    DOMICILIO_ENTREGA(DomicilioEntregaTblGherkin.values()),
    ;

    private final ITablaGherkin<? extends IParam>[] tablaGherkin;

    TablasGherkin(ITablaGherkin<? extends IParam>[] tablaGherkin)
    {
        this.tablaGherkin = tablaGherkin;
    }

    public ITablaGherkin<? extends IParam>[] getTablaGherkin() {
        return tablaGherkin;
    }
}
