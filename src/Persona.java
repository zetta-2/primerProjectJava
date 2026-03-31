import java.util.Scanner;

public class Persona {
    int DNI;
    String nombre;
    String apellido;
    int edad;

    void ingresoDatosPersona(Scanner sc, String tipo)
    {
        System.out.println("Ingrese el DNI del " + tipo + ":");
        this.DNI = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre del " + tipo + ":");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del " + tipo + ":");
        this.apellido = sc.nextLine();
        System.out.println("Ingrese la edad del " + tipo + ":");
        this.edad = sc.nextInt();
        sc.nextLine();
    }

    void mostrarDatosPersonas(){
        System.out.println("Datos de la persona:");
        System.out.println("DNI: " + this.DNI);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Edad: " + this.edad);
    }

    void Comer()
    {
        System.out.println("Comiendo");
    }

    void Trabajar(){
        System.out.println("Trabajando");
    }
}
