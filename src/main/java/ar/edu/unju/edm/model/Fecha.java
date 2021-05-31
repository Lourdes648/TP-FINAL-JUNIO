package ar.edu.unju.edm.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fecha {
	static String obtenerFechaYHoraActual() {
        String formato = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
        LocalDateTime ahora = LocalDateTime.now();
        return formateador.format(ahora);
    }
}
