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
public class ContactoEntregaParams implements IParam
{

    private String correo;


    /**
     * Para mas informacion:
     * @see ParamsJavaDoc#CREAR_PARAMS
     */
    public static ContactoEntregaParams crearParams(String correo)
    {
        return ContactoEntregaParams.builder()
            .correo(correo)
            .build();
    }
}
