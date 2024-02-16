package co.com.falabella.test.automation.web.models.params.features.portal.buscador;

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
public class BuscadorParams implements IParam
{

    private String producto;

    private String resultado;

    /**
     * Para mas informacion:
     * @see ParamsJavaDoc#CREAR_PARAMS
     */
    public static BuscadorParams crearParams(String producto, String resultado)
    {
        return BuscadorParams.builder()
            .producto(producto)
            .resultado(resultado)
            .build();
    }
}
