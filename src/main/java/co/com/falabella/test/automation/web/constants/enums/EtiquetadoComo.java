package co.com.falabella.test.automation.web.constants.enums;


public enum EtiquetadoComo
{
    //Etiquetas en Pantalla

    ;

    private final String etiqueta;

    EtiquetadoComo(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }

    public String enPantalla()
    {
        return this.etiqueta;
    }
}
