package umariana.tutoriales;

/**
 *
 * @author Juan Goyes
 */
public class Categoria {

    private int idCategoria;
    private String categorias;

    // Metodo constructor vacio
    public Categoria() {
    }

    /**
     * Metodo constructor con parametros
     *
     * @param idCategoria
     * @param categorias
     */
    public Categoria(int idCategoria, String categorias) {
        this.idCategoria = idCategoria;
        this.categorias = categorias;
    }

    //Metodos gettes y setter
    
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

}
