package ejercicio1;

public class Circulo extends figura {


    private double radio;

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void CalcularArea(){
        double pi = 3.1416;
        double area = pi*radio*radio;

        System.out.println("el area de un circulo es : " +   area);
    }

}
