package co.com.falabella.test.automation.web.constants.enums.configuracion;

public enum Esperas {

    GENERAL(20),
    FINALIZANDO_TAREA(1),

    ;

    private final long tiempo;

    Esperas(long tiempo){
        this.tiempo = tiempo;
    }

    public long getTiempo() {
        return tiempo;
    }
}
