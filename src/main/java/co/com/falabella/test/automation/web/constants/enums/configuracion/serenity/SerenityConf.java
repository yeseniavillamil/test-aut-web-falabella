package co.com.falabella.test.automation.web.constants.enums.configuracion.serenity;

import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;


public enum SerenityConf {
    
    URL_BASE("webdriver.base.url"),
    ;

    private final String propiedad;

    private static EnvironmentVariables propiedades = SystemEnvironmentVariables.createEnvironmentVariables();

    private static EnvironmentSpecificConfiguration configuracion = EnvironmentSpecificConfiguration.from(propiedades);

    SerenityConf(String propiedad)
    {
        this.propiedad = propiedad;
    }

    public String getPropiedad()
    {
        return this.propiedad;
    }

    public String getValor()
    {
        return configuracion.getProperty(this.getPropiedad());
    }
}
