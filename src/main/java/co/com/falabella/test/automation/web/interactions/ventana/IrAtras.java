package co.com.falabella.test.automation.web.interactions.ventana;

import co.com.falabella.test.automation.web.utils.web.navegador.VentanaUtil;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

@AllArgsConstructor
public class IrAtras implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        VentanaUtil.irAtras(actor);
    }

    public static IrAtras enNavegador()
    {
        return Tasks.instrumented(IrAtras.class);
    }
}
