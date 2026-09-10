/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// si tengo metodos abstractos la clase tambien lo debe ser

public abstract class Poligono {
    private int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    
    //gET

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    
    //METODOS ABSTRACTOS PORQUE SERAN IMPLEMENTADOS EN LAS CLASES ESPECIFICAS
    
    //Definir metodos abstractos para luego ser implementados en clases hijas
    //Definir el modificador de acceso
    
    public abstract double area();
    public abstract double perimetro();
    
    
    
    
}
