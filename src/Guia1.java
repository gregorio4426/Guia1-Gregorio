public class Guia1 {
    public static void main(String[] args) {
/// EJERCICIO 1
Empleado empleado1 = new Empleado(23456345, 25000, "Gutierrez", "Carlos");
Empleado empleado2= new Empleado(34234123, 27500,"Sanchez","Ana");

empleado1.mostrarEmpleado(empleado1);
empleado2.mostrarEmpleado(empleado2);

System.out.println("El salario aumentado del empleado " + empleado1.nombre + " " + empleado1.apellido + " es: "+ empleado1.aumento(15));

System.out.println("El salario anual del empleado " + empleado1.nombre + " " + empleado1.apellido + " es: "+ empleado1.aumento(15)*12);
System.out.println("El salario anual del empleado " + empleado2.nombre + " " + empleado2.apellido + " es: "+ empleado2.salario*12);

/// EJERCICIO 2
        Cuenta cuenta1 = new Cuenta(1, "Facundo ","Gregorio", 15000);
        cuenta1.mostrarCuenta(cuenta1);
        System.out.println("--");
        cuenta1.balance = cuenta1.deposito(2500);
        System.out.println("--");
        cuenta1.balance = cuenta1.debito(1500);
        System.out.println("--");
        cuenta1.balance = cuenta1.debito(30000);
        System.out.println("--");
        cuenta1.mostrarCuenta(cuenta1);

        /// Ejercicio 3

        Libro libro1 = new Libro("El Quijote ","Miguel de Cervantes", 500, 10);
        Libro libro2 = new Libro("Cien años de soledad ","Gabriel Garcia Marquez", 700,5);
        /// c. Imprime los detalles de ambos libros.
        System.out.println(""+libro1.infoLibro(libro1));
        System.out.println("-------");
        System.out.println(""+libro2.infoLibro(libro2));
        System.out.println("-------");
        /// d. Vende 3 copias del primer libro.
       libro1.copias = libro1.venta(3);
        System.out.println("-------");
        /// e. Imprime los detalles del primer libro.
        System.out.println(""+libro1.infoLibro(libro1));
        System.out.println("-------");
        /// f. Intenta vender 8 copias del segundo libro.
        libro2.copias = libro2.venta(8);
        System.out.println("-------");
        /// g. Incrementa en 5 la cantidad de copias disponibles del segundo libro.
        libro2.copias = libro2.incrementarCopias(5);
        System.out.println("-------");
        /// h. Imprime los detalles del segundo libro.
        System.out.println(""+libro2.infoLibro(libro2));
        System.out.println("-------");


        /// Ejercicio 4

    }



}
