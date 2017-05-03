package es.adaits.modelo;

/**
 * Created by thinway on 1/5/17.
 */
public abstract class Obra {

    protected int codigo;
    protected String title;
    protected int anioPub;

    public Obra() {
    }

    public Obra(int codigo, String title, int anioPub) {
        this.setCodigo(codigo);
        this.setTitle(title);
        this.setAnioPub(anioPub);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if( codigo < 0 ){
            // Si el código es negativo (incorrecto) se pone a 0
            this.codigo = 0;
        }else{
            this.codigo = codigo;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if( title.equals("") ){
            this.title = "Sin tiítulo";
        }else{
            this.title = title;
        }
    }

    public int getAnioPub() {
        return anioPub;
    }

    public void setAnioPub(int anioPub) {
        // Se considerarán los años negativos como años AC
        this.anioPub = anioPub;
    }
}
