package modelo;





public class Rectangulo extends Poligono   {
    private double lado1;
    private double lado2;
    
    //implementar la formula que me permite hacer el calculo de esta figura

    //  CONSTRUCTOR
    public Rectangulo(double lado1, double lado2, int numeroLados) {
        super(numeroLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //ENCAPSULADO

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    //Implementar los metodos para calcular area y perimetro
    //Se supone que los metodos ya estan definidos, pero también puedo crear los mis propios metodos
    //para indicarle que tiene que sobreescribirse override
    
    @Override
    public double area(){
        return lado1*lado2; 
    }
    
    @Override
    public double perimetro() {
        return (lado1*2) + (lado2*2);   
    }
    
    
    
    
}
