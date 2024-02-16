package co.com.falabella.test.automation.web.utils.gherkin.tabla.interfaces;

import co.com.falabella.test.automation.web.utils.gherkin.tabla.utils.TablaGherkinUtil;

public interface ITablaGherkin<T> {


    String getColumna();
    T crearParams(TablaGherkinUtil deLaTablaGherkin);

}
