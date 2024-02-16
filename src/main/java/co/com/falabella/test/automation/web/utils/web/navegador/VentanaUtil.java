package co.com.falabella.test.automation.web.utils.web.navegador;

import co.com.falabella.test.automation.web.utils.driver.web.WebDriverUtil;
import net.serenitybdd.screenplay.Actor;

import java.util.Set;

public class VentanaUtil
{
    private VentanaUtil(){
        throw new UnsupportedOperationException();
    }

    public static String getIdPestanyaActual(Actor actor)
    {
        return WebDriverUtil.getDriver(actor).getWindowHandle();
    }

    public static Set<String> getIdPestanyas(Actor actor)
    {
        return WebDriverUtil.getDriver(actor).getWindowHandles();
    }

    public static String getTituloPestanya(Actor actor)
    {
        return WebDriverUtil.getDriver(actor).getTitle();
    }

    public static String getURLPestanyaActual(Actor actor)
    {
        return WebDriverUtil.getDriver(actor).getCurrentUrl();
    }

    public static void cerrarPestanya(Actor actor)
    {
        WebDriverUtil.getDriver(actor).close();
    }

    public static void irAtras(Actor actor)
    {
        WebDriverUtil.getDriver(actor).navigate().back();
    }

}
