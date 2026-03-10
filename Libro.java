import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Libro {

    @JsonAlias("title")
    private String titulo;

    @JsonAlias("authors")
    private Autor autor;

    @JsonAlias("languages")
    private String idioma;

    @JsonAlias("download_count")
    private int descargas;

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }

    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = idioma; }

    public int getDescargas() { return descargas; }
    public void setDescargas(int descargas) { this.descargas = descargas; }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", idioma='" + idioma + '\'' +
                ", descargas=" + descargas +
                '}';
    }
}
