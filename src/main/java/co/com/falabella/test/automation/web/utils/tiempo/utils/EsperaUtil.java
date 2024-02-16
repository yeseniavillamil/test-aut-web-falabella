package co.com.falabella.test.automation.web.utils.tiempo.utils;

import co.com.falabella.test.automation.web.utils.GeneralUtil;
import co.com.falabella.test.automation.web.utils.javadoc.JavaDocUtil;
import co.com.falabella.test.automation.web.utils.tiempo.constants.enums.UnidadTiempo;

/**
 * {{Plantilla para la creacion de clases utilitarias}}
 */
public class EsperaUtil
{

    /**
     * Para mas informacion:
     * @see JavaDocUtil#CONSTRUCTOR
     */
    private EsperaUtil(){
        GeneralUtil.noPermitaInstanciar();
    }

    public static void detenerPor(long tiempo, UnidadTiempo unidad){

        tiempo = tiempo * unidad.getEscalaMilisegundos();

        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
