import java.io.Serializable;

public class Libro implements Serializable { //Implementa seriazable
    private String titulo;
    private String autor;
    private int yearPublished;

    public Libro(String titulo, String autor, int yearPublished) {
        this.titulo = titulo;
        this.autor = autor;
        this.yearPublished = yearPublished;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}
