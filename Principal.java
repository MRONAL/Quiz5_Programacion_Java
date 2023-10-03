public class Principal {
    public static void main(String[] args) {
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();

        Libro cienAnosSoledad = new Libro("Cien años de Soledad", "Gabriel Garcia Marquez", 496);
        bibliotecaKonradLorenz.registrarLibro(cienAnosSoledad);
        Libro codigoDaVinci= new Libro("El código DaVinci","Dan Brown",656 );
        bibliotecaKonradLorenz.registrarLibro(codigoDaVinci);
        Libro milnovecientosochentaycuatro= new Libro("1984","George Orwell",326);
        bibliotecaKonradLorenz.registrarLibro(milnovecientosochentaycuatro);
        Libro Hobbit= new Libro("El Hobbit","J.R.R. Tolkien",310);
        bibliotecaKonradLorenz.registrarLibro(Hobbit);
        Libro laodisea= new Libro("La Odisea", "Homero", 448);
        bibliotecaKonradLorenz.registrarLibro(laodisea);
        /**
         * Complejidad temporal O(1) Tiempo Constante
         */

    }
}
