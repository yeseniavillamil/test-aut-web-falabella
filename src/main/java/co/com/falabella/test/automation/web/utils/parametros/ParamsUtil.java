package co.com.falabella.test.automation.web.utils.parametros;

import co.com.falabella.test.automation.web.utils.GeneralUtil;
import co.com.falabella.test.automation.web.utils.javadoc.JavaDocUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Utilitario relacionado con el procesamiento de parametros
 */
public class ParamsUtil
{
    public static final String ID_INICIAL = "{";
    public static final String ID_FINAL = "}";
    public static final String RGX_FORMATO = "\\"+ID_INICIAL+"\\d+\\"+ID_FINAL;//[0-9]

    public static final Pattern PAT_RGX_FORMATO = Pattern.compile(RGX_FORMATO);

    /**
     * Para mas informacion:
     * @see JavaDocUtil#CONSTRUCTOR
     */
    private ParamsUtil(){
        GeneralUtil.noPermitaInstanciar();
    }

    public static String procesarParametros(String pCadena, Object ... pParametros) {

        if(PAT_RGX_FORMATO.matcher(pCadena).find()) {
            if(pParametros!=null && pParametros.length>0) {
                for(int i=0 ; i<pParametros.length ; i++) {
                    Object parametro = pParametros[i];
                    String valorParametro = parametro==null? StringUtils.EMPTY:parametro.toString();

                    pCadena = pCadena.replace(ID_INICIAL+i+ID_FINAL, valorParametro);
                }
            }
            pCadena = pCadena.replaceAll(RGX_FORMATO,StringUtils.EMPTY);
        }

        return pCadena;
    }

    public static List<String> procesarCadena(String cadena){
        if (cadena==null || cadena.isEmpty()){
            return new ArrayList<>();
        }else {
            char chrPrimerCaracter = cadena.charAt(0);
            String strPrimerCaracter = String.valueOf(chrPrimerCaracter);

            String separador;
            if(Character.isLetterOrDigit(chrPrimerCaracter))
            {
                separador=null;
            }else{
                separador=Pattern.quote(strPrimerCaracter);
                cadena = cadena.replaceAll("^"+separador, StringUtils.EMPTY);
            }
//            String separador = Character.isLetterOrDigit(chrPrimerCaracter)
//                ? null
//                : Pattern.quote(strPrimerCaracter);

            return separador==null
                ?   Arrays.asList(cadena)
                :   Arrays.asList(cadena.split(separador))
                ;
        }
    }
}
