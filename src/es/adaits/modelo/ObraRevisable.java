package es.adaits.modelo;

/**
 * Clase que gestiona las obras revisables. Las que solo se pueden revisar en instancias del Castillo de Hogwarts.
 */
public abstract class ObraRevisable extends Obra implements Revisable {

    /**
     * Sala donde será revisada la obra.
     */
    protected String sala;

    /**
     * Profesor que demanda la revisión.
     */
    protected String profesor;

    /**
     * Constructor designado. No utiliza los parámetros sala y profesor porque estos solo se tocan desde
     * los métodos de la interfaz.
     *
     * @param codigo
     * @param title
     * @param anioPub
     */
    public ObraRevisable(int codigo, String title, int anioPub) {
        super(codigo, title, anioPub);
    }

    /**
     * Solicita obra para revisión.
     *
     * @param sala Lugar donde se revisará la obra.
     * @param profesor Profesor que ha demandado la revisión.
     */
    @Override
    public void solicitudRevision(String sala, String profesor) {
        // Si la obra no se encuentra en ninguna sala
        if( this.sala == null ){
            // Se le adjudica la sala de revisión y el profesor demandante
            this.sala = sala;
            this.profesor = profesor;
        }else{
            // Si está en una sala no se puede adjudicar en este momento
            System.out.println("No es posible la revisión.");
            System.out.println("Obra prestada en estos momentos.");
        }

    }

    /**
     * Finaliza la revisión de una obra.
     */
    @Override
    public void finRevision() {
        System.out.println("Mensaje para el personal de la biblioteca:");
        System.out.println("Recoger el " + getClass().getSimpleName() + " con título '" + title + "' y devolver a sus estancias de conservación.");
        this.sala = null;
        this.profesor = null;
    }

    /**
     * Estado del objeto
     *
     * @return
     */
    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "codigo=" + codigo +
                ", title='" + title + '\'' +
                ", anioPub=" + anioPub +
                ", sala='" + sala + '\'' +
                ", profesor='" + profesor + '\'' +
                '}';
    }
}
