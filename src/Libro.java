public class Libro {
    /// 3. Modela un objeto Libro que tenga las siguientes características: id (único y
    /// autoincremental), título, autor, precio y cantidad de copias disponibles.
    private int incrementoIds = 0;
    int id;
    String titulo, autor;
    double precio;
    double copias;

    public Libro(String titulo, String autor, double precio, int copias) {
        this.id = incrementoIds+1;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.copias = copias;
    }

    public int getId() {
        return id;
    }

    public int getIncrementoIds() {
        return incrementoIds;
    }

    public void setIncrementoIds(int incrementoIds) {
        this.incrementoIds = incrementoIds;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCopias() {
        return copias;
    }

    public void setCopias(double copias) {
        this.copias = copias;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
/// Un mtodo que imprima por pantalla los detalles del libro en el
/// siguiente formato: Libro id=?, título=?, autor=?, precio=?, copias
/// disponibles=?].

public String infoLibro (Libro libro){

       return "ID: " + id + ", título: " + titulo + ", autor: " + autor + ", precio: $"+precio+ ", copias disponibles: "+copias;

    }
/// Un mtodo que permita vender una cierta cantidad de copias de un
/// libro, disminuyendo la cantidad disponible. Si no hay suficientes
/// copias, debe mostrar un mensaje indicando que la operación no es
/// posible.

    public double venta(double cantidad) {

        if (cantidad >= copias) {
            System.out.println("No hay "+cantidad+" copias disponibles para vender, faltan "+(cantidad-copias));
        }
        else {
            copias = copias - cantidad;
            System.out.println("Venta exitosa, se vendieron: "+cantidad+" copias.");
            System.out.println("Quedan " + copias +" copias.");

        }
        return this.copias;

    }
/// Un mtodo que permita incrementar la cantidad de copias disponibles
/// en el inventario.
///
    public double incrementarCopias(double cantidad) {
        System.out.println("Se registro un ingreso de " + cantidad + " copias.");
        copias = copias + cantidad;
        System.out.println("La cantidad actual de copias es: " + copias + ".");
        return this.copias;
    }
}
