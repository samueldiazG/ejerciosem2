package ejercicio1.refuerzos;
import java.time.LocalDateTime;

public class Libro {
    public String titulo;
    public int codigo;
    public String categorias;
    public String autor;
    public LocalDateTime fechadecreacion;

    public Libro () {}

    public Libro(String titulo, int codigo, String categorias, String autor) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.categorias = categorias;
        this.autor = autor;
    }
    
}
