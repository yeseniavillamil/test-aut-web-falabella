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
public class EstadoElementoParams implements IParam
{

    private String estado;

    private String elemento;

    private String parametros;

    /**
     * Para mas informacion:
     * @see ParamsJavaDoc#CREAR_PARAMS
     */
    public static EstadoElementoParams crearParams(String estado, String elemento, String parametros)
    {
        return EstadoElementoParams.builder()
                .estado(estado)
                .elemento(elemento)
                .parametros(parametros)
                .build();
    }
}
