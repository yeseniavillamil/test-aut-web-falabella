package co.com.falabella.test.automation.web.utils.formatos;

import co.com.falabella.test.automation.web.utils.datos.NullUtil;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatoUtil
{
    private FormatoUtil(){
        throw new UnsupportedOperationException();
    }

    public static String validar(String texto)
    {
        if(FormatoUtil.nullIdentificado(texto)){
            texto = null;
        }else{
            texto = FormatoUtil.reemplazarPorNumeroAleatorio(texto);
            texto = FormatoUtil.reemplazarPorFecha(texto);
            texto = FormatoUtil.reemplazarPorBlancos(texto);
            texto = FormatoUtil.reemplazarPorPropiedades(texto);
            texto = FormatoUtil.reemplazarPorIdNull(texto);
        }

        return texto;
    }

    private static boolean nullIdentificado(String texto)
    {
        String id = "[Nn][Uu][Ll]{2}";
        String patron = "\\{("+id+")\\}";

        return texto.matches(patron);
    }

    private static String reemplazarPorPropiedades(String texto)
    {
        String id = "[A-Za-z0-9_-]+";
        String patron = "\\{[pP]:("+id+")(:(.+))?\\}";

        Matcher matcher = Pattern.compile(patron).matcher(texto);

        if( matcher.find()  )
        {
            try{
                StringBuffer resultado = new StringBuffer();

                do {
                    matcher.appendReplacement(
                            resultado,
                            System.getProperty(matcher.group(1),matcher.group(3))
                    );
                }while  (   matcher.find()  );
                matcher.appendTail(resultado);

                return resultado.toString();

            }catch(Exception e){
                return texto;
            }

        }else{
            return texto;
        }
    }

    private static String reemplazarPorIdNull(String texto)
    {
        String id = "[Nn][Uu][Ll]{2}";
        String patron = "\\{'"+id+"'\\}";

        Matcher matcher = Pattern.compile(patron).matcher(texto);

        if( matcher.find()  )
        {
            try{
                StringBuffer resultado = new StringBuffer();

                do {
                    matcher.appendReplacement(
                        resultado,
                        NullUtil.ID_NULL
                    );
                }while  (   matcher.find()  );
                matcher.appendTail(resultado);

                return resultado.toString();

            }catch(Exception e){
                return texto;
            }

        }else{
            return texto;
        }
    }

    private static String reemplazarPorBlancos(String texto)
    {
        String id = "\\s";
        String patron = "\\{("+id+"*)\\}";

        Matcher matcher = Pattern.compile(patron).matcher(texto);

        if( matcher.find()  )
        {
            StringBuffer resultado = new StringBuffer();

            do {
                matcher.appendReplacement(
                    resultado,
                    matcher.group(1)
                );
            }while  (   matcher.find()  );
            matcher.appendTail(resultado);

            return resultado.toString();
        }else{
            return texto;
        }
    }

    private static String reemplazarPorNumeroAleatorio(String texto)
    {
        String id = "#";
        String patron = "\\{("+id+"+)\\}";

        Matcher matcher = Pattern.compile(patron).matcher(texto);

        if( matcher.find()  )
        {
            StringBuffer resultado = new StringBuffer();
            int min = 0;
            BigInteger max;

            do {
                int totalNum = StringUtils.countMatches(matcher.group(1),id);
                max = new BigDecimal(matcher.group(1).replace("#","9")).toBigInteger();
                //BigDecimal numero = BigDecimal.valueOf(RandomUtils.nextDouble(min,max.doubleValue()))
                BigDecimal numero = BigDecimal.valueOf(min + Math.random()*(max.doubleValue()-min+1));

                matcher.appendReplacement(
                    resultado,
                    StringUtils.leftPad(String.valueOf(numero.toBigInteger()),totalNum,"0")
                );
            }while  (   matcher.find()  );
            matcher.appendTail(resultado);

            return resultado.toString();
        }else{
            return texto;
        }
    }

    private static String reemplazarPorFecha(String texto)
    {
        String patron = "\\{([dMyHhms]+)\\}";

        Matcher matcher = Pattern.compile(patron).matcher(texto);

        if( matcher.find() )
        {
            StringBuffer resultado = new StringBuffer();

            Calendar fecha = Calendar.getInstance();
            String diaFecha = StringUtils.leftPad(String.valueOf(fecha.get(Calendar.DAY_OF_MONTH)),2,"0");
            String mesFecha = StringUtils.leftPad(String.valueOf((fecha.get(Calendar.MONTH)+1)),2,"0");
            String anyoFecha = String.valueOf(fecha.get(Calendar.YEAR));
            String hora12Fecha = StringUtils.leftPad(String.valueOf(fecha.get(Calendar.HOUR)),2,"0");
            String hora24Fecha = StringUtils.leftPad(String.valueOf(fecha.get(Calendar.HOUR_OF_DAY)),2,"0");
            String minutoFecha = StringUtils.leftPad(String.valueOf(fecha.get(Calendar.MINUTE)),2,"0");
            String segundoFecha = StringUtils.leftPad(String.valueOf(fecha.get(Calendar.SECOND)),2,"0");

            do{
                texto = FormatoUtil.reemplazarPorItemFecha(matcher.group(1),"d",diaFecha);
                texto = FormatoUtil.reemplazarPorItemFecha(texto,"M",mesFecha);
                texto = FormatoUtil.reemplazarPorItemFecha(texto,"y",anyoFecha);
                texto = FormatoUtil.reemplazarPorItemFecha(texto,"H",hora24Fecha);
                texto = FormatoUtil.reemplazarPorItemFecha(texto,"h",hora12Fecha);
                texto = FormatoUtil.reemplazarPorItemFecha(texto,"m",minutoFecha);
                texto = FormatoUtil.reemplazarPorItemFecha(texto,"s",segundoFecha);

                matcher.appendReplacement(resultado,texto);
            }while  ( matcher.find()  );
            matcher.appendTail(resultado);

            return resultado.toString();
        }else{
            return texto;
        }
    }

    private static String reemplazarPorItemFecha(String texto, String id, String valorItemFecha)
    {
        StringBuffer resultado = new StringBuffer();
        Matcher matcher = Pattern.compile("("+id+"+)").matcher(texto);
        boolean idAnyo = id.equals("y");
        while  (   matcher.find()  )
        {
            int totalId = StringUtils.countMatches(matcher.group(),id);

            int offset = idAnyo && totalId<4 ?valorItemFecha.length()-totalId:0;
            String reemplazar = StringUtils.truncate(
                StringUtils.leftPad(valorItemFecha,totalId,"0"),
                offset,
                totalId
            );

            matcher.appendReplacement(resultado,reemplazar);
        }
        matcher.appendTail(resultado);

        return resultado.toString();
    }

}
