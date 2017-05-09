package es.adaits.modelo;

/**
 * Created by thinway on 9/5/17.
 */
public enum LugarHogwart {
    SECRETOS("Sala de los Secretos"),
    MENESTERES("Sala de los Menesteres"),
    RAVENCLAW("Torre de Ravenclaw"),
    SLYTHERIN("Mazmorras de Slytherin"),
    BIBLIOTECA("Biblioteca de Hogwarts");

    final String nombreSala;

    LugarHogwart(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public String getNombreSala() {
        return nombreSala;
    }
}
