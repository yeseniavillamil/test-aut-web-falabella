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
public class TextoElementoParams implements IParam
{
    private String elemento;

    private String parametros;

    private String texto;

    /**
     * Para mas informacion:
     * @see ParamsJavaDoc#CREAR_PARAMS
     */
    public static TextoElementoParams crearParams(String elemento, String parametros, String texto)
    {
        return TextoElementoParams.builder()
                .elemento(elemento)
                .parametros(parametros)
                .texto(texto)
                .build();
    }
}
