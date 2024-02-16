package co.com.falabella.test.automation.web.models.params.general.pantalla;

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
public class TextoZonaParams implements IParam
{

    private String seccion;

    private String parametros;

    private String texto;

    /**
     * Para mas informacion:
     * @see ParamsJavaDoc#CREAR_PARAMS
     */
    public static TextoZonaParams crearParams(String seccion, String parametros, String texto)
    {
        return TextoZonaParams.builder()
                .seccion(seccion)
                .parametros(parametros)
                .texto(texto)
                .build();
    }
}
