package co.com.falabella.test.automation.web.setups.hooks.production;

import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Escena {

    @Before
    public void camaras() {
        OnStage.setTheStage(new OnlineCast());
    }

    /**
     * Al terminar un caso de prueba
     */
    @After
    public void corte(Scenario escenario)
    {
        Protagonista.sePreparaParaSiguienteEscena();
       // EscenarioLTUtil.actualizarEstado(escenario);
    }
}
