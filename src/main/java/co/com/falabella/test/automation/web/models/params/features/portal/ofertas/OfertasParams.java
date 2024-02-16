package co.com.falabella.test.automation.web.models.params.features.portal.ofertas;

import co.com.falabella.test.automation.web.models.params.javadoc.ParamsJavaDoc;
import co.com.falabella.test.automation.web.utils.models.params.interfaces.IParam;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;


/**
 * Para mas informacion:
 * @see ParamsJavaDoc#CLASE
 */
@Builder
@Data
public class OfertasParams implements IParam
{

    private boolean confirma;

    private static final String SI = "S";

    /**
     * Para mas informacion:
     * @see ParamsJavaDoc#CREAR_PARAMS
     */
    public static OfertasParams crearParams(String confirma)
    {
        return OfertasParams.builder()
                .confirma(confirma == null
                    || confirma.trim().isEmpty()
                    || StringUtils.containsIgnoreCase(confirma,SI)
                ).build();
    }
}
