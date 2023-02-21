/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talleragregacion;

/**
 *
 * @author salacomputo
 */
public class Carros {
    private String marca;
    private String referencia;
    private int modelo;
    private String color;
    private int NumeroDeAsientos;
    private int kilometraje;

    public Carros() {
    }

    public Carros(String marca, String referencia, int modelo, String color, int NumeroDeAsientos, int kilometraje) {
        this.marca = marca;
        this.referencia = referencia;
        this.modelo = modelo;
        this.color = color;
        this.NumeroDeAsientos = NumeroDeAsientos;
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Carros{" + "marca=" + marca + ", referencia=" + referencia + ", modelo=" + modelo + ", color=" + color + ", NumeroDeAsientos=" + NumeroDeAsientos + ", kilometraje=" + kilometraje + '}';
    }
    
    
}
