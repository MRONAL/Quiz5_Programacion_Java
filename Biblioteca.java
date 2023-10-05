import java.util.LinkedList;

public class Biblioteca {
    LinkedList<Libro> librosDisponibles = new LinkedList<>();

    public void registrarLibro(Libro libro){
        librosDisponibles.add(libro);
    }

    /**
     * Busca un libro por título en la lista de libros disponibles.
     * @param titulo Título del libro a buscar.
     * @return El libro encontrado o null si no se encuentra.
     * Complejidad temporal O(N) Tiempo Lineal.
     */
    public Libro buscarLibro(String titulo) {
        for (int i = 0; i < librosDisponibles.size(); i++) {
            Libro libroBuscado = librosDisponibles.get(i);
            if (libroBuscado.getTitulo().equals(titulo)) {
                return libroBuscado;
            }
        }
        return null;
    }

    /**
     * Devuelve la lista completa de libros disponibles.
     * @return Lista de libros disponibles.
     */
    public LinkedList<Libro> mostrarLibrosDisponibles(){
        return librosDisponibles;
    }
}


