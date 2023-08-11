import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Solicitamos datos al usuario para crear un objeto de la clase persona
        System.out.println("Ingrese el nombre de la persona");
        String nombre = sc.next();
        System.out.println("Ingrese la edad de la persona");
        int edad = sc.nextInt();
        System.out.println("Ingrese la identificación de la persona");
        String identificacion = sc.next();

        Persona persona1 = new Persona(nombre, edad, identificacion);
        System.out.println(persona1.mostrar());
        if (persona1.esMayorDeEdad()){
            System.out.println(persona1.getNombre() + " es mayor de edad");
        } else {
            System.out.println(persona1.getNombre() + " no es mayor de edad");
        }
        System.out.println("-------");

        Persona persona2 = new Persona();
        persona2.setNombre("Carlos Mario");
        persona2.setEdad(15);
        persona2.setIdentificacion("TI-4563214289");
        System.out.println(persona2.mostrar());

        if (persona2.esMayorDeEdad()){
            System.out.println(persona2.getNombre() + " es mayor de edad");
        } else {
            System.out.println(persona2.getNombre() + " no es mayor de edad");
        }

        System.out.println("-------");
        System.out.println("Cuenta bancaria");
        System.out.println("Ingrese el nombre del titular");
        String nombreTitular = sc.next();
        System.out.println("Ingrese el saldo inicical de la cuenta");
        double saldoCuenta = sc.nextDouble();

        Cuenta cuenta1 = new Cuenta(nombreTitular, saldoCuenta);
        System.out.println(cuenta1.getDatosCuenta());
        System.out.println("Ingrese el valor a ingresar a la cuenta");
        cuenta1.setIngreso(sc.nextDouble());
        System.out.println("Su saldo es de " + cuenta1.getSaldoCuenta());
        System.out.println("Ingrese el valor a retirar de la cuenta");
        cuenta1.setRetiro(sc.nextDouble());
        System.out.println("Su saldo es de " + cuenta1.getSaldoCuenta());

    }
}