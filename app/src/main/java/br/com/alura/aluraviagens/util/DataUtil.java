package br.com.alura.aluraviagens.util;

import androidx.annotation.NonNull;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtil {

    public static final String DIA_E_MES = "dd/MM";

    @NonNull
    public static String periodoEmTexto(int dias) {
        Calendar dataIda = Calendar.getInstance();
        Calendar dataVolta = Calendar.getInstance();
        dataVolta.add(Calendar.DATE, dias);
        String dataFormatadaIda = new SimpleDateFormat(DIA_E_MES).format(dataIda.getTime());
        String dataFormatadaVolta = new SimpleDateFormat(DIA_E_MES).format(dataVolta.getTime());
        return dataFormatadaIda + " - "
                + dataFormatadaVolta + " de "
                + dataVolta.get(Calendar.YEAR);
    }
}
