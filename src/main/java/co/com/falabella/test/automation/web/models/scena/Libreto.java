package co.com.falabella.test.automation.web.models.scena;


import co.com.falabella.test.automation.web.models.params.PlantillaParams;
import co.com.falabella.test.automation.web.models.params.features.compra.entrega.ContactoEntregaParams;
import co.com.falabella.test.automation.web.models.params.features.compra.entrega.DomicilioEntregaParams;
import co.com.falabella.test.automation.web.models.params.features.portal.buscador.BuscadorParams;
import co.com.falabella.test.automation.web.models.params.features.portal.buscador.ResultadoParams;
import co.com.falabella.test.automation.web.models.params.features.portal.ofertas.OfertasParams;
import co.com.falabella.test.automation.web.models.params.general.pantalla.EstadoElementoParams;
import co.com.falabella.test.automation.web.models.params.general.pantalla.TextoElementoParams;
import co.com.falabella.test.automation.web.models.params.general.pantalla.TextoZonaParams;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Libreto {

    private PlantillaParams parametrosPlantilla;

    private List<EstadoElementoParams> parametrosEstadoElemento;

    private List<TextoZonaParams> parametrosTextoZona;

    private List<TextoElementoParams> parametrosTextoElemento;

    private OfertasParams parametrosOfertas;

    private BuscadorParams parametrosBuscador;

    private ResultadoParams parametrosResultado;

    private ContactoEntregaParams parametrosContactoEntrega;

    private DomicilioEntregaParams parametrosDomicilioEntrega;


    public void setParametrosEstadoElemento(EstadoElementoParams parametrosEstadoElemento) {
        this.getParametrosEstadoElemento().add(parametrosEstadoElemento);
    }

    public List<EstadoElementoParams> getParametrosEstadoElemento() {
        if (this.parametrosEstadoElemento==null){
            this.parametrosEstadoElemento=new ArrayList<>();
        }
        return this.parametrosEstadoElemento;
    }

    public void setParametrosTextoZona(TextoZonaParams parametrosTextoZona) {
        this.getParametrosTextoZona().add(parametrosTextoZona);
    }

    public List<TextoZonaParams> getParametrosTextoZona() {
        if (this.parametrosTextoZona==null){
            this.parametrosTextoZona=new ArrayList<>();
        }
        return this.parametrosTextoZona;
    }

    public void setParametrosTextoElemento(TextoElementoParams parametrosTextoElemento) {
        this.getParametrosTextoElemento().add(parametrosTextoElemento);
    }

    public List<TextoElementoParams> getParametrosTextoElemento() {
        if (this.parametrosTextoElemento==null){
            this.parametrosTextoElemento=new ArrayList<>();
        }
        return this.parametrosTextoElemento;
    }
}

