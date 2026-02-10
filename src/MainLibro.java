import java.util.ArrayList;
import java.util.List;

public class MainLibro {
    public static void main(String[] args) {
        //Crear lista --> Guardar objetos de la clase Libro
        List<Libro> libros = new ArrayList<>();

        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
        libros.add(new Libro("1984", "George Orwell", 1949));
        libros.add(new Libro("El resplandor", "Stephen King", 1977));
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605));
        libros.add(new Libro("Crónica de una muerte anunciada", "Gabriel García Márquez", 1981));
        libros.add(new Libro("El código Da Vinci", "Dan Brown", 2003));
        libros.add(new Libro("Orgullo y prejuicio", "Jane Austen", 1813));
        libros.add(new Libro("Fahrenheit 451", "Ray Bradbury", 1953));
        libros.add(new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", 1985));
        libros.add(new Libro("Los juegos del hambre", "Suzanne Collins", 2008));

        //Llamar a los métodos
        SerializacionGuardar.guardar(libros);
        System.out.println();
        SerializacionLeer.leer();
    }
}
