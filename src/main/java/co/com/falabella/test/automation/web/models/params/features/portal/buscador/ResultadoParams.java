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
public class ResultadoParams implements IParam
{

    private String nombreArticulo;


    /**
     * Para mas informacion:
     * @see ParamsJavaDoc#CREAR_PARAMS
     */
    public static ResultadoParams crearParams(String nombreArticulo)
    {
        return ResultadoParams.builder()
            .nombreArticulo(nombreArticulo)
            .build();
    }
}
