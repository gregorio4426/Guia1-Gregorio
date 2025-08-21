import java.util.Scanner;

public class ItemVenta {
    /// La clase ItemVenta deberá tener como atributos: identificador (int),
    /// descripcion (String), cantidad (int) y precioUnitario (double). Los métodos a
    /// realizar son:

    int identificador, cantidad;
    double precioUnitario;
    String descripcion;
    String nombre;

    public ItemVenta() {
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    /// Un metodo calcularPrecioTotal() que devuelve el precio total (precio
/// unitario * cantidad).
    public double calcularPrecioTotal (ItemVenta item){
        double precioFinal = precioUnitario*cantidad;
        return precioFinal;
    }
    /// Un metodo que devuelva una representación en cadena del ítem de
    /// venta en el formato: ItemVenta id=?, descripcion=?, cantidad=?,
    /// pUnitario=?, pTotal=?].

    public String muestraItem (ItemVenta item){
      return "Item: "+nombre+", ID: "+identificador+", descripcion: "+descripcion+", cantidad: "+cantidad+", precio unitario: $"+precioUnitario+", precio total stock: $"+calcularPrecioTotal(item);
    }

    public void cargarItem (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre del item: ");
            this.nombre = scanner.nextLine();
        System.out.println("Ingrese identificador: ");
            this.identificador = scanner.nextInt();
            scanner.nextLine();
        System.out.println("Ingrese breve descripcion: ");
            this.descripcion = scanner.nextLine();
        System.out.println("Ingrese stock: ");
            this.cantidad = scanner.nextInt();
        System.out.println("Ingrese precio unitario: ");
            this.precioUnitario = scanner.nextDouble();
    }

    public int nuevaCantidad (ItemVenta item){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nueva cantidad del item: ");
        item.cantidad = scanner.nextInt();
        return cantidad; /// igualar funcion a itemX.cantidad
    }

    /// 4. Permite al usuario ingresar un nuevo precio unitario y actualiza el atributo
    /// precioUnitario del ítem de venta.

    public double nuevoPrecio (ItemVenta item){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nuevo precio del item: ");
        item.precioUnitario = scanner.nextInt();
        return precioUnitario;

    }
}
