package es.adaits.modelo;

/**
 * Created by thinway on 10/5/17.
 */
public enum Profesor {
    DUMBLEDORE("Albus Dumbledore"),
    MINERVA("Minerva McGonagall"),
    QUIRREL("Quirinus Quirrell"),
    LOCKHART("Gilderoy Lockhart"),
    LUPIN("Remus Lupin");

    final String nombre;

    Profesor(String nombre) {
        this.nombre = nombre;
    }
}
