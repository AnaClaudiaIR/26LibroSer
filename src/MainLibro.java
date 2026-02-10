import java.util.ArrayList;
import java.util.List;

public class MainLibro {
    public static void main(String[] args) {
        //Crear lista --> Guardar objetos de la clase Libro
        List<Libro> libros = new ArrayList<>();

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("1984", "George Orwell", 1949);
        Libro libro3 = new Libro("El resplandor", "Stephen King", 1977);
        Libro libro4 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);
        Libro libro5 = new Libro("Crónica de una muerte anunciada", "Gabriel García Márquez", 1981);
        Libro libro6 = new Libro("El código Da Vinci", "Dan Brown", 2003);
        Libro libro7 = new Libro("Orgullo y prejuicio", "Jane Austen", 1813);
        Libro libro8 = new Libro("Fahrenheit 451", "Ray Bradbury", 1953);
        Libro libro9 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", 1985);
        Libro libro10 = new Libro("Los juegos del hambre", "Suzanne Collins", 2008);

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        libros.add(libro5);
        libros.add(libro6);
        libros.add(libro7);
        libros.add(libro8);
        libros.add(libro9);
        libros.add(libro10);

        //Llamar a los métodos
        SerializacionGuardar.guardar(libros);
        System.out.println();
        SerializacionLeer.leer();
    }
}
