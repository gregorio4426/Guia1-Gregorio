public class Empleado {



    int dni;
String nombre;
String apellido;
double salario;

public Empleado(int dni, double salario, String apellido, String nombre) {
    this.dni = dni;
    this.salario = salario;
    this.apellido = apellido;
    this.nombre = nombre;
}

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//A su vez se requiere otro metodo que permita
//aumentar el salario dependiendo del porcentaje que se le pase por
//parámetro.

    public double aumento(double porcentaje) {
        return this.salario + (this.salario * porcentaje) / 100;
    }

    /// Considere crear un metodo que facilite imprimir por pantalla las
    /// características del objeto de la siguiente forma: Empleado dni=?, nombre=?, apellido=?, salario=?

    public void muestraEmpleado (Empleado empleado){
        System.out.println("Dni: " +empleado.dni);
        System.out.println("Nombre y apellido: "+empleado.nombre +empleado.apellido);
        System.out.println("Salario: "+empleado.salario);

    }
}
