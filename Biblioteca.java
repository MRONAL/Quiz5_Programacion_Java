import java.util.LinkedList;

public class Biblioteca {
    LinkedList<Libro> librosDisponibles = new LinkedList<>();

    public void registrarLibro(Libro libro){
        librosDisponibles.add(libro);
    }

    /**
     *
     * @param titulo
     * @return
     * Complejidad temporal O(N) Timepo Lineal
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
    public LinkedList<Libro> mostrarLibrosDisponibles(){
        return librosDisponibles;
    }
}


