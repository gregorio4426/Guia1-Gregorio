public class Cuenta {


    /// Modele el objeto que representa la cuenta de un banco, con identificador,nombre y balance.
    int id = 0;
    String nombre, apellido;
    double balance;

    public Cuenta(int id, String nombre, String apellido, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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

    /// c. Un metodo que imprima por pantalla las características del objeto.
    public void mostrarCuenta(Cuenta cuenta) {
        System.out.println("Banco Argentina, bienvenido!");
        System.out.println("----------------------------");
        System.out.println("ID cliente: " + cuenta.id);
        System.out.println("Nombre y apellido: " + cuenta.nombre + cuenta.apellido);
        System.out.println("Balance: " + cuenta.balance);
        System.out.println("----------------------------");

    }

    /// a. El metodo crédito que representa un depósito de dinero en la
    /// cuenta. Este metodo debe devolver el balance luego de la operación.

    public double deposito(double importe) {
        System.out.println("Se registro un ingreso de $" + importe + ".");
        balance = balance + importe;
        System.out.println("El balance actual de la cuenta es: $" + balance + ".");
        return this.balance;
    }

    /// b. El mtodo débito que representa una sustracción de dinero de la cuenta. Este mtodo debe devolver el balance luego de la operación.
    /// Si el dinero en la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por pantalla un aviso
    /// sin permitir dicha sustracción.
    public double debito(double monto) {

        if (monto >= this.balance) {
            System.out.println("El balance de la cuenta es insuficiente para gastar $" +monto+ ", te faltan $"+(monto-balance));
            System.out.println("El balance actual de la cuenta es: $" + balance + ".");

        }
        else {
        this.balance = this.balance - monto;
            System.out.println("Compra exitosa, gastaste: $"+monto+".");
            System.out.println("El balance actual de la cuenta es: $" + balance +".");

        }
        return this.balance;

    }
}


