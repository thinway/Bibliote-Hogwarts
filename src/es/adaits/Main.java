package es.adaits;

import es.adaits.modelo.Diario;
import es.adaits.modelo.Libro;
import es.adaits.modelo.Mapa;
import es.adaits.modelo.Pergamino;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
        // Préstamo de un libro y devolución fuera de fecha
        Libro libro = new Libro(148, "Armas mágicas", 1870);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        libro.solicitarPrestamo(22);
        // Se pone una fecha de solicitud anterior a los 22 días del préstamo
        libro.setFechaPrestamo( sdf.parse("1/4/2017"));
        System.out.println( libro );
        libro.devolucionPrestamo();
        System.out.println( libro );

        // Préstamo de un diario
        Diario diario = new Diario(234, "Diario del Mago Pop", 2010);
        diario.solicitarPrestamo(5);
        System.out.println( diario );
        diario.devolucionPrestamo();
        System.out.println( diario );

        // Revisión de un mapa
        Mapa mapa = new Mapa(5345, "Mapa de la Tierra Media",1550);
        mapa.solicitudRevision("Sala de los Secretos", "Quirinus Quirrel");
        System.out.println( mapa );
        mapa.finRevision();
        System.out.println( mapa );

        // Revisión de un Pergamino
        Pergamino pergamino = new Pergamino(456, "Sobre los magos y demonios", 1450);
        pergamino.solicitudRevision("Torre de Ravenclaw", "Remus Lupin");
        System.out.println( pergamino );
        pergamino.finRevision();
        System.out.println( pergamino );
    }
}
