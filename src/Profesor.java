import java.util.Scanner;

public class Profesor extends Persona {
    String matricula;
    String materia;

    void ingresoDatosProfesor(Scanner sc) {
        super.ingresoDatosPersona(sc,"profesor");
        System.out.println("Ingrese la matricula del profesor");
        this.matricula = sc.nextLine();
        System.out.println("Ingrese la materia que dicta el profesor");
        this.materia = sc.nextLine();
    }

    void mostrarDatosProfesor(Profesor profesor) {
        System.out.println("DNI: " + profesor.DNI);
        System.out.println("Nombre: " + profesor.nombre);
        System.out.println("Apellido: " + profesor.apellido);
        System.out.println("Edad: " + profesor.edad);
        System.out.println("Matricula: " + profesor.matricula);
        System.out.println("Materia: " + profesor.materia);
    }
}
