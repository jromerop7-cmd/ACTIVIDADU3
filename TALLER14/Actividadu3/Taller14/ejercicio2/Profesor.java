package ejercicio2;

import java.util.Scanner;

public class Profesor extends Persona {

    Scanner teclado = new Scanner(System.in);
    private String profesor;


    public Profesor(){
        System.out.println("Ingrese el nombre del profesor:");
        this.profesor = teclado.nextLine();
    }

    @Override
    public void Presentarse(){
        System.out.println("hola soy el profesor y mi nombre ess: " + profesor);
    }
}
