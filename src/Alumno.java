import java.util.ArrayList;
import java.util.Scanner;

public class Alumno extends Persona {
    String carrera;
    int cantMaterias;
    ArrayList<String> materias = new ArrayList<>();
    void ingresoDatosAlumno(Scanner sc)
    {
        int i;
        super.ingresoDatosPersona(sc,"alumno");
        System.out.println("Ingrese la carrera que estudia el alumno:");
        this.carrera = sc.nextLine();
        System.out.println("Ingrese la cantidad de materias que se anotó:");
        this.cantMaterias = sc.nextInt();
        sc.nextLine();
        for(i=0;i<cantMaterias;i++)
        {
            System.out.println("Ingrese la materia " + (i+1) + ":");
            materias.add(sc.nextLine());
        }
    }

    void mostrarDatosAlumno(Alumno alumno)
    {
        int i;
        System.out.println("DNI del alumno: " + alumno.DNI);
        System.out.println("Nombre del alumno: " + alumno.nombre);
        System.out.println("Apellido del alumno: " + alumno.apellido);
        System.out.println("Edad del alumno: " + alumno.edad);
        System.out.println("Carrera del alumno: " + alumno.carrera);
        System.out.println("Cantidad de materias: " + alumno.cantMaterias);
        if(alumno.cantMaterias>0)
        {
            System.out.println("Materias anotadas:");
            for(i=0; i<alumno.cantMaterias; i++)
            {
                System.out.println("Materia " + (i+1) + ": " + alumno.materias.get(i));
            }
        }
       else {
            System.out.println("No se inscribió a ningun materia.");
        }
    }

    void Estudiar(Alumno alumno)
    {
        System.out.println("Soy " + alumno.nombre + " " + alumno.apellido + ". Tengo " + alumno.edad + " años y estoy estudiando " + alumno.carrera);
    }
}
