package ejercicio1;

public class Rectangulo extends figura{

    private double largo;
    private double ancho;

    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }
    public void setLargo(double largo) {
        this.largo = largo;
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public void CalcularArea(){
         double area;
         area = largo*ancho;
         System.out.println("El area del rectangulo es: "+ area);
    }

}
