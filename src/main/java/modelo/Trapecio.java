package modelo;

/**
 *
 * @author temaj
 */
public class Trapecio {
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double ladoMayor;
    private double ladoMenor;

    public Trapecio(double baseMayor, double baseMenor, double altura, double ladoMayor, double ladoMenor) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2.0;
    }

    public double calcularPerimetro() {
        return baseMayor + baseMenor + ladoMayor + ladoMenor;
    }
}