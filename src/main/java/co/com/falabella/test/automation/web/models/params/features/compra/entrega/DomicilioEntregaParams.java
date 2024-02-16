package co.com.falabella.test.automation.web.models.params.features.compra.entrega;

import co.com.falabella.test.automation.web.models.params.javadoc.ParamsJavaDoc;
import co.com.falabella.test.automation.web.utils.models.params.interfaces.IParam;
import lombok.Builder;
import lombok.Data;


/**
 * Para mas informacion:
 * @see ParamsJavaDoc#CLASE
 */
@Builder
@Data
public class DomicilioEntregaParams implements IParam
{

    private String departamento;

    private String ciudad;

    private String barrio;

    private String direccion;

    private String adicional;

    /**
     * Para mas informacion:
     * @see ParamsJavaDoc#CREAR_PARAMS
     */
    public static DomicilioEntregaParams crearParams(String departamento, String ciudad,
                                                     String barrio, String direccion, String adicional)
    {
        return DomicilioEntregaParams.builder()
            .departamento(departamento)
            .ciudad(ciudad)
            .barrio(barrio)
            .direccion(direccion)
            .adicional(adicional)
            .build();
    }
}
