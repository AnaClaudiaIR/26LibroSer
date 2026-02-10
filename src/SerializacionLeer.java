import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializacionLeer {
    //Crear método para leer archivo
    public static void leer() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("libro.ser"))) {
           List<Libro> libros = (ArrayList<Libro>) ois.readObject(); //Lee los objetos guardados en el fichero
           for(Libro libro : libros) { //Mostrar la información
               System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", Año de publicación: " + libro.getYearPublished());
           }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el objeto --> " + e.getMessage());
        }
    }
}
