package co.com.falabella.test.automation.web.interactions.ventana;

import co.com.falabella.test.automation.web.utils.web.navegador.VentanaUtil;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

@AllArgsConstructor
public class Cerrar implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        VentanaUtil.cerrarPestanya(actor);
    }

    public static Cerrar pestanya()
    {
        return Tasks.instrumented(Cerrar.class);
    }
}
