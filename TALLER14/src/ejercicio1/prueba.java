package ejercicio1;

public class prueba {
    public static void main(String[] args) {
        figura figura = new figura();
        figura rectangulo= new Rectangulo(5,3);
        figura circulo =  new Circulo(4);
        figura.CalcularArea();
        rectangulo.CalcularArea();
        circulo.CalcularArea();
    }
}
