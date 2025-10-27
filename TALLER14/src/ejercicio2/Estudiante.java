package ejercicio2;
import java.util.Scanner;

public class Estudiante extends Persona {

    Scanner teclado = new Scanner(System.in);
    private String estudiante;


    public Estudiante() {
        System.out.println("Ingrese el nombre del estudiante:");
        this.estudiante = teclado.nextLine();
    }

    @Override
    public void Presentarse() {
        System.out.println("Hola, soy un estudiante y mi nombre es: " + estudiante);
    }
}
