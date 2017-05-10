package es.adaits.modelo;

/**
 * Interfaz que define el comportamiento de las obras que se solo se pueden revisar en las salas del
 * Castillo de Hogwarts.
 */
public interface Revisable {

    void solicitudRevision(LugarHogwart sala, Profesor profesor);
    void finRevision();
}
