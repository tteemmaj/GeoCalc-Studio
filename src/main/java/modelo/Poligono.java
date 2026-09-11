/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public abstract class Poligono {
    private int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    


    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    
 
    
    public abstract double area();
    public abstract double perimetro();
    
    
    
    
}
