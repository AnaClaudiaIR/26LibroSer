import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializacionGuardar {
    public static void guardar(List<Libro> libros) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("libro.ser"))){
            //libros.add(libro);
            oos.writeObject(libros); //Crear y escribir en el fichero
            System.out.println("Objeto Persona serializado y guardado en libro.ser");
        } catch (IOException e) {
            System.out.println("Error al guardar el objeto --> " + e.getMessage());
        }
    }
}
