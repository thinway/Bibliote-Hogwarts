package es.adaits.modelo;

import java.util.Date;

/**
 * Clase que gestiona las obras que pueden ser cedidas en préstamos y ser sacadas fuera de las
 * dependencias del Castillo de Hogwarts.
 */
public abstract class ObraPrestamo extends Obra implements Prestable {

    /**
     * Milisegundos en un día. Esta constante se utiliza para calcular si un préstamo está dentro del plazo de entrega.
     */
    final long MILISEGUNDOS_DIA = 24 * 60 * 60 * 1000;

    /**
     * Fecha de realización de un préstamo.
     */
    protected Date fechaPrestamo;

    /**
     * Periodo de duración del préstamo (en días).
     */
    protected int  periodoPrestamo;

    /**
     * Constructor designado. No utiliza los parámetros fechaPrestamo y periodoPrestamo porque estos solo se tocan desde
     * los métodos de la interfaz.
     *
     * @param codigo
     * @param title
     * @param anioPub
     */
    public ObraPrestamo(int codigo, String title, int anioPub) {
        super(codigo, title, anioPub);
    }

    // Accesores

    /**
     * Getter fechaPrestamo
     *
     * @return
     */
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * Setter fechaPrestamo
     *
     * @param fechaPrestamo
     */
    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * Get periodoPrestamo
     *
     * @return
     */
    public int getPeriodoPrestamo() {
        return periodoPrestamo;
    }

    /**
     * Setter periodoPrestamo
     *
     * @param periodoPrestamo
     */
    public void setPeriodoPrestamo(int periodoPrestamo) {
        if ( periodoPrestamo < 1 ){
            // si la duración indicada es inferior a 1 día se establece en dos semanas naturales.
            this.periodoPrestamo = 14;
        }else{
            this.periodoPrestamo = periodoPrestamo;
        }
    }

    /**
     * Solicita préstamo de una obra.
     *
     * @param duracionPrestamo
     */
    @Override
    public void solicitarPrestamo(int duracionPrestamo) {
        if( fechaPrestamo == null ){
            this.fechaPrestamo = new Date();    // Se asume la fecha del préstamo la del momento de la solicitud
            setPeriodoPrestamo( duracionPrestamo );
        }else{
            System.out.println("No es posible el préstamo.");
            System.out.println("Obra prestada en estos momentos.");
        }

    }

    /**
     * Procesa la devolución de una obra comprobando que se devuelve dentro de plazo.
     */
    @Override
    public void devolucionPrestamo() {
        // Tomamos la hora actual
        Date ahora = new Date();
        // Calculo la diferencia en milisegundos entre la hora actual y la fecha en la que se realizó el préstamo.
        long difDias = ( ahora.getTime() - fechaPrestamo.getTime() ) / MILISEGUNDOS_DIA;

        // Si la diferencia en días es superior, el libro está fuera de préstamo
        if( difDias > periodoPrestamo ){
            System.out.println("Préstamo con retraso (" + (difDias - periodoPrestamo) + " días). Penalización.");
        }

        // Se informa de la devolución
        System.out.println("Entregado el " + getClass().getSimpleName() + " con título '" + title + "'.");

        // El libro vuelve a estar disponible para préstamo
        // Se pone la fecha a null
        fechaPrestamo = null;
        periodoPrestamo = 0;
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
                ", fechaPrestamo=" + fechaPrestamo +
                ", periodoPrestamo=" + periodoPrestamo +
                '}';
    }
}
